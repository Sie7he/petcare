package com.cuidadomascotas.PetCare.controller;

import com.cuidadomascotas.PetCare.dto.ClienteMascotaDTO;
import com.cuidadomascotas.PetCare.model.Mascota;
import com.cuidadomascotas.PetCare.service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MascotaController {

    @Autowired
    private IMascotaService mascotaService;

    @GetMapping("/mascotas")
    public List<Mascota> getMascotas() {
        return mascotaService.getMascotas();
    }

    @GetMapping("/mascotas/{id}")
    public Mascota getMascotaById(@PathVariable Long id) {
        return mascotaService.findMascotaById(id);
    }

    @GetMapping("/mascotas/cliente")
    public List<ClienteMascotaDTO> getMascotaCliente() throws Exception {
        try {
            return mascotaService.getClienteMascota();
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    @PostMapping("/mascotas")
    public Mascota saveMascota(@RequestBody Mascota mascota) {
        return mascotaService.saveMascota(mascota);
    }

    @PutMapping("/mascotas")
    public Mascota updateMascota(@RequestBody Mascota mascota) {
        return mascotaService.updateMascota(mascota);
    }

}
