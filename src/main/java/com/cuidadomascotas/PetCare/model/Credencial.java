package com.cuidadomascotas.PetCare.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Credencial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_credencial;
    private String usuario;
    private String password;
    @OneToOne
    @JoinColumn(name ="id_veterinario", referencedColumnName = "id")
    private Veterinario veterinario;

    public Credencial(){}

    public Credencial(Long id_credencial, String usuario, String password, Veterinario veterinario) {
        this.id_credencial = id_credencial;
        this.usuario = usuario;
        this.password = password;
        this.veterinario = veterinario;
    }
}
