package com.cuidadomascotas.PetCare.service;

import com.cuidadomascotas.PetCare.dto.ClienteMascotaDTO;
import com.cuidadomascotas.PetCare.model.Cliente;
import com.cuidadomascotas.PetCare.model.Mascota;

import java.util.List;

public interface IMascotaService {

    List<Mascota> getMascotas();

    Mascota saveMascota(Mascota mascota);

    Mascota findMascotaById(Long id);

    Mascota updateMascota(Mascota mascota);

    void deleteMascotaById(Long id);

    List<ClienteMascotaDTO> getClienteMascota();

}


