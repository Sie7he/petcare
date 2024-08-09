package com.cuidadomascotas.PetCare.controller;

import com.cuidadomascotas.PetCare.model.Veterinario;
import com.cuidadomascotas.PetCare.service.IVeterinarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VeterinarioController {

    @Autowired
    private IVeterinarioService veterinarioService;

    @GetMapping("/veterinarios")
    public List<Veterinario> getVeterinarios() {
        return veterinarioService.getVeterinarios();
    }

    @GetMapping("/veterinarios/{id}")
    public Veterinario findVeterinario(@PathVariable Long id) {
        return veterinarioService.findVeterinarioById(id);
    }

    @PostMapping("/veterinarios")
    public Veterinario saveVeterinario(@RequestBody Veterinario veterinario) {
        return  veterinarioService.saveVeterinario(veterinario);
    }

    @PutMapping("/veterinarios")
    public Veterinario updateVeterinario(@RequestBody Veterinario veterinario) {
        return veterinarioService.updateVeterinario(veterinario);
    }

    @DeleteMapping("/veterinarios/{id}")
    public String deleteVeterinario(@PathVariable Long id) {
        veterinarioService.deleteVeterinarioById(id);
        return "Veterinario eliminado";
    }


}
