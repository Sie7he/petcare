package com.cuidadomascotas.PetCare.repository;

import com.cuidadomascotas.PetCare.model.HistorialMedico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHistorialMedicoRepository extends JpaRepository<HistorialMedico, Long> {
}
