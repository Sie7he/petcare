package com.cuidadomascotas.PetCare.service;

import com.cuidadomascotas.PetCare.model.Veterinario;
import com.cuidadomascotas.PetCare.repository.IVeterinarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeterinarioService implements IVeterinarioService{

    @Autowired
    private IVeterinarioRepository veterinarioRepository;

    @Override
    public List<Veterinario> getVeterinarios() {
        return veterinarioRepository.findAll();
    }

    @Override
    public Veterinario saveVeterinario(Veterinario veterinario) {
        return veterinarioRepository.save(veterinario);
    }

    @Override
    public Veterinario findVeterinarioById(Long id) {
        return veterinarioRepository.findById(id).orElse(null);
    }

    @Override
    public Veterinario updateVeterinario(Veterinario veterinario) {
        return this.saveVeterinario(veterinario);
    }

    @Override
    public void deleteVeterinarioById(Long id) {
        deleteVeterinarioById(id);

    }
}
