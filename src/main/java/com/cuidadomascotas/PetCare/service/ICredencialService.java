package com.cuidadomascotas.PetCare.service;

import com.cuidadomascotas.PetCare.model.Credencial;

import java.util.List;

public interface ICredencialService {

    List<Credencial> getCredenciales();

    Credencial saveCredencial(Credencial credencial);

    Credencial findCredencialById(Long id);

    Credencial updateCredencial(Credencial credencial);

    void deleteCredencialById(Long id);
}
