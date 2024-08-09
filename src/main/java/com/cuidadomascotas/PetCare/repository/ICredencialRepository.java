package com.cuidadomascotas.PetCare.repository;

import com.cuidadomascotas.PetCare.model.Credencial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICredencialRepository extends JpaRepository<Credencial, Long> {
}
