package com.cuidadomascotas.PetCare.controller;

import com.cuidadomascotas.PetCare.model.HistorialMedico;
import com.cuidadomascotas.PetCare.service.IHistorialMedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HistorialMedicoController {
@Autowired
private IHistorialMedicoService historialMedicoService;

    @GetMapping("/mascotas/historial")
    public List<HistorialMedico> getHistorial() {
        return historialMedicoService.getHistorialMedico();
    }

    @PostMapping("/mascotas/historial")
    public HistorialMedico saveHistorial(@RequestBody HistorialMedico historial) {
       return historialMedicoService.saveHistorialMedico(historial);
    }

    @PutMapping("/mascotas/historial")
    public HistorialMedico updateHistorial(@RequestBody HistorialMedico historial) {
        return historialMedicoService.updateHistorialMedico(historial);
    }

    @DeleteMapping("/mascotas/historial/{id}")
    public String deleteHistorial(@PathVariable Long id) {
        historialMedicoService.deleteHistorialMedicoeById(id);
        return "Historial eliminado";

    }
}
