package com.cuidadomascotas.PetCare.controller;

import ch.qos.logback.core.net.server.Client;
import com.cuidadomascotas.PetCare.model.Cliente;
import com.cuidadomascotas.PetCare.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {
    @Autowired
    private IClienteService clienteService;

    @GetMapping("/clientes")
    public List<Cliente> getClientes() {
        return clienteService.getClientes();
    }

    @GetMapping("/clientes/{id}")
    public Cliente getCliente(@PathVariable Long id) {
        return clienteService.findClienteById(id);
    }

    @PostMapping("/clientes")
    public Cliente saveCliente(@RequestBody Cliente cliente) {
        return clienteService.saveCliente(cliente);
    }

    @PutMapping("/clientes")
    public Cliente updateCliente(@RequestBody Cliente cliente) {
        return clienteService.updateCliente(cliente);
    }

    @DeleteMapping("/clientes/{id}")
    public String deleteCliente(@PathVariable Long id) {
        clienteService.deleteClienteById(id);
        return "Cliente eliminado";
    }
}
