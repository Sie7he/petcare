package com.cuidadomascotas.PetCare.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@Entity
public class Veterinario extends Persona {

    @ManyToOne
    @JoinColumn(name = "id_rol", referencedColumnName = "id_rol")
    @JsonIgnoreProperties
    private Rol rol;
    @OneToOne(mappedBy = "veterinario")
    @JsonIgnore
    private Credencial credencial;
    @OneToMany(mappedBy = "veterinario")
    @JsonIgnore
    private List<HistorialMedico> historialMedicoList;

    public Veterinario(){}

    public Veterinario(Long id, String nombre, String apellido, String correo, String telefono, Rol rol) {
        super(id, nombre, apellido, correo, telefono);
        this.rol = rol;
    }
}
