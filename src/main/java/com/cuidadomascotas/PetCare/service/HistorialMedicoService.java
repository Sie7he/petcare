package com.cuidadomascotas.PetCare.service;

import com.cuidadomascotas.PetCare.model.HistorialMedico;
import com.cuidadomascotas.PetCare.repository.IHistorialMedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistorialMedicoService implements IHistorialMedicoService{

    @Autowired
    private IHistorialMedicoRepository historialMedicoRepository;

    @Override
    public List<HistorialMedico> getHistorialMedico() {
        return historialMedicoRepository.findAll();
    }

    @Override
    public HistorialMedico saveHistorialMedico(HistorialMedico historialMedico) {
        return historialMedicoRepository.save(historialMedico);
    }

    @Override
    public HistorialMedico findMHistorialMedicoById(Long id) {
        return historialMedicoRepository.findById(id).orElse(null);
    }

    @Override
    public HistorialMedico updateHistorialMedico(HistorialMedico historialMedico) {
        return this.saveHistorialMedico(historialMedico);
    }

    @Override
    public void deleteHistorialMedicoeById(Long id) {
        historialMedicoRepository.deleteById(id);

    }
}
