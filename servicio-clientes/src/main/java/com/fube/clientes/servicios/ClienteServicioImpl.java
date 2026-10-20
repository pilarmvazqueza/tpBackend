package com.fube.clientes.servicios;

import com.fube.clientes.dto.ClienteDTO;
import com.fube.clientes.excepciones.ClienteNoEncontradoException;
import com.fube.clientes.mapper.ClienteMapper;
import com.fube.clientes.modelos.Cliente;
import com.fube.clientes.repositorio.ClienteRepositorio;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ClienteServicioImpl implements ClienteServicio {

    private final ClienteRepositorio repositorio;

    public ClienteServicioImpl(ClienteRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public ClienteDTO crear(Cliente cliente) {
        cliente.setFechaAlta(LocalDateTime.now());
        return ClienteMapper.toDTO(repositorio.save(cliente));
    }

    @Override
    public ClienteDTO buscarPorId(Long id) {
        return repositorio.findById(id)
                .map(ClienteMapper::toDTO)
                .orElseThrow(() -> new ClienteNoEncontradoException(id));
    }

    @Override
    public List<ClienteDTO> buscarTodos() {
        return repositorio.findAll().stream()
                .map(ClienteMapper::toDTO)
                .toList();
    }

    @Override
    public ClienteDTO actualizar(Cliente cliente) {
        Cliente clienteViejo = repositorio.findById(cliente.getId())
                .orElseThrow(() -> new ClienteNoEncontradoException(cliente.getId()));
        cliente.setFechaAlta(clienteViejo.getFechaAlta());
        return ClienteMapper.toDTO(repositorio.save(cliente));
    }

    @Override
    public void eliminar(Long id) {
        repositorio.deleteById(id);
    }
}
