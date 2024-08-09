package com.cuidadomascotas.PetCare.service;

import com.cuidadomascotas.PetCare.dto.ClienteMascotaDTO;
import com.cuidadomascotas.PetCare.model.Cliente;
import com.cuidadomascotas.PetCare.model.Mascota;
import com.cuidadomascotas.PetCare.repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService implements IClienteService{

    @Autowired
    private IClienteRepository clienteRepository;

    @Override
    public List<Cliente> getClientes() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente saveCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente findClienteById(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    @Override
    public Cliente updateCliente(Cliente cliente) {
        return this.saveCliente(cliente);
    }

    @Override
    public void deleteClienteById(Long id) {
        clienteRepository.deleteById(id);
    }

}
