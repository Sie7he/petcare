package com.cuidadomascotas.PetCare.service;

import com.cuidadomascotas.PetCare.dto.ClienteMascotaDTO;
import com.cuidadomascotas.PetCare.model.Cliente;

import java.util.List;

public interface IClienteService {

    List<Cliente> getClientes();

    Cliente saveCliente(Cliente cliente);

    Cliente findClienteById(Long id);

    Cliente updateCliente(Cliente cliente);

    void deleteClienteById(Long id);

}
