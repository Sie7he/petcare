package com.cuidadomascotas.PetCare.service;

import com.cuidadomascotas.PetCare.model.HistorialMedico;
import com.cuidadomascotas.PetCare.model.Mascota;

import java.util.List;

public interface IHistorialMedicoService {

    List<HistorialMedico> getHistorialMedico();

    HistorialMedico saveHistorialMedico(HistorialMedico historialMedico);

    HistorialMedico findMHistorialMedicoById(Long id);

    HistorialMedico updateHistorialMedico(HistorialMedico historialMedico);

    void deleteHistorialMedicoeById(Long id);
}
