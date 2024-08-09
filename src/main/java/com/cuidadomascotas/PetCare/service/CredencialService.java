package com.cuidadomascotas.PetCare.service;

import com.cuidadomascotas.PetCare.model.Credencial;
import com.cuidadomascotas.PetCare.repository.ICredencialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CredencialService implements ICredencialService {

    @Autowired
    private ICredencialRepository credencialRepository;

    @Override
    public List<Credencial> getCredenciales() {
        return credencialRepository.findAll();
    }

    @Override
    public Credencial saveCredencial(Credencial credencial) {
        return credencialRepository.save(credencial);
    }

    @Override
    public Credencial findCredencialById(Long id) {
        return credencialRepository.findById(id).orElse(null);
    }

    @Override
    public Credencial updateCredencial(Credencial credencial) {
        return this.saveCredencial(credencial);
    }

    @Override
    public void deleteCredencialById(Long id) {
        credencialRepository.deleteById(id);
    }
}
