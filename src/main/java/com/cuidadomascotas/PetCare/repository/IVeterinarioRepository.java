package com.cuidadomascotas.PetCare.repository;

import com.cuidadomascotas.PetCare.model.Veterinario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVeterinarioRepository extends JpaRepository<Veterinario, Long> {
}
