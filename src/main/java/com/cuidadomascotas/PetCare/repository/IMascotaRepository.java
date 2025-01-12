package com.cuidadomascotas.PetCare.repository;

import com.cuidadomascotas.PetCare.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMascotaRepository extends JpaRepository<Mascota, Long> {
}
