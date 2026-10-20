package com.fube.clientes.excepciones;

import com.fube.clientes.dto.ErrorRespuesta;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.time.LocalDateTime;
import java.util.List;

// ¿@Slf4j que es?
/*
Es una anotación de Lombok que genera en la clase un private static final Logger log de SLF4J.
Es lo que te permite escribir log.error(...) sin declarar el logger a mano.
 */

@Slf4j
@RestControllerAdvice
public class ManejadorExcepciones {

    @ExceptionHandler
    public ResponseEntity<ErrorRespuesta> manejarClienteNoEncontrado(ClienteNoEncontradoException ex, HttpServletRequest request) {
        return construirErrorRespuesta(HttpStatus.NOT_FOUND, ex.getMessage(), List.of(), request);
    }

    @ExceptionHandler
    public ResponseEntity<ErrorRespuesta> manejarArgumentoNoValido(MethodArgumentNotValidException ex, HttpServletRequest request) {
        return construirErrorRespuesta(HttpStatus.BAD_REQUEST, "Datos inválidos", detallesArgumentosInvalidos(ex), request);
    }

    @ExceptionHandler
    public ResponseEntity<ErrorRespuesta> manejarMessageNotReadableException(HttpMessageNotReadableException ex, HttpServletRequest request) {
        return construirErrorRespuesta(HttpStatus.BAD_REQUEST, "Formato de solicitud inválido", List.of(), request);
    }

    @ExceptionHandler
    public ResponseEntity<ErrorRespuesta> manejarArgumentTypeMismatchException(MethodArgumentTypeMismatchException ex, HttpServletRequest request) {
        return construirErrorRespuesta(HttpStatus.BAD_REQUEST, "Tipo de argumento inválido: " + ex.getName(), List.of(), request);
    }

    @ExceptionHandler
    public ResponseEntity<ErrorRespuesta> manejarDataIntegrityViolation(DataIntegrityViolationException ex, HttpServletRequest request) {
        return construirErrorRespuesta(HttpStatus.CONFLICT, "Ya existe un cliente con ese email", List.of(), request);
    }

    @ExceptionHandler
    public ResponseEntity<ErrorRespuesta> manejarExcepcionGenerica(Exception ex, HttpServletRequest request) {
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
        String mensaje = "Error Interno del Servidor";

        if (ex instanceof ErrorResponse errorResponse) {
            status = HttpStatus.valueOf(errorResponse.getStatusCode().value());
            mensaje = errorResponse.getBody().getDetail();
        }

        if (status.is5xxServerError()) {
            log.error("Error desconocido: {}", ex.getMessage(), ex);
        } else {
            log.warn("Solicitud rechazada ({}): {}", status.value(), mensaje);
        }

        return construirErrorRespuesta(status, mensaje, List.of(), request);
    }

    private ResponseEntity<ErrorRespuesta> construirErrorRespuesta(HttpStatus status, String mensaje, List<String> detalles, HttpServletRequest request) {
        ErrorRespuesta errorRespuesta = ErrorRespuesta.builder()
                .timestamp(LocalDateTime.now())
                .status(status.value())
                .error(status.getReasonPhrase())
                .mensaje(mensaje)
                .path(request.getRequestURI())
                .detalles(detalles)
                .build();
        return new ResponseEntity<>(errorRespuesta, status);
    }

    private List<String> detallesArgumentosInvalidos(MethodArgumentNotValidException ex){
        List<String> detalles = ex.getBindingResult().getFieldErrors().stream()
                .map(error -> error.getField() + ": " + error.getDefaultMessage())
                .toList();
        return detalles;
    }

}
