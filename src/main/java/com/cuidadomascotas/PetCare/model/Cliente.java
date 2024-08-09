package com.cuidadomascotas.PetCare.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@Entity
public class Cliente extends Persona {

    private String direccion;
    @JsonIgnore
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Mascota> mascotas;

    public Cliente(){}

    public Cliente(Long id_cliente, String nombre, String apellido, String correo, String telefono, String direccion, List<Mascota> mascotas) {
        super(id_cliente, nombre, apellido, correo, telefono);
        this.direccion = direccion;
        this.mascotas = mascotas;
    }
}
