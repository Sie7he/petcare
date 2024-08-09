package com.cuidadomascotas.PetCare.repository;

import com.cuidadomascotas.PetCare.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteRepository extends JpaRepository <Cliente, Long> {
}
