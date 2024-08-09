package com.cuidadomascotas.PetCare.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@Entity
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_rol;
    private String tipo;
    @OneToMany(mappedBy = "rol")
    @JsonIgnore
    private List<Veterinario> veterinarios;

    public Rol(){}

    public Rol(Long id_rol, String tipo, List<Veterinario> veterinarios) {
        this.id_rol = id_rol;
        this.tipo = tipo;
        this.veterinarios = veterinarios;
    }
}
