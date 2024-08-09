package com.cuidadomascotas.PetCare.service;

import com.cuidadomascotas.PetCare.model.Mascota;
import com.cuidadomascotas.PetCare.model.Veterinario;

import java.util.List;

public interface IVeterinarioService {

    List<Veterinario> getVeterinarios();

    Veterinario saveVeterinario(Veterinario veterinario);

    Veterinario findVeterinarioById(Long id);

    Veterinario updateVeterinario(Veterinario veterinario);

    void deleteVeterinarioById(Long id);
}
