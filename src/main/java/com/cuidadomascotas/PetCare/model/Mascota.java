package com.cuidadomascotas.PetCare.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter @Setter
@Entity
public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_mascota;
    private String nombre;
    private String especie;
    private String raza;
    private String color;
    private LocalDate fecha_nacimiento;

    @ManyToOne
    @JoinColumn(name = "id_cliente", referencedColumnName = "id")
    private Cliente cliente;

    @OneToMany(mappedBy = "mascota", fetch = FetchType.EAGER)
    private List<HistorialMedico> historialesMedicos;

    public Mascota(){}

    public Mascota(Long id_mascota, String nombre, String especie, String raza, String color, LocalDate fecha_nacimiento, Cliente cliente, List<HistorialMedico> historialesMedicos) {
        this.id_mascota = id_mascota;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
        this.fecha_nacimiento = fecha_nacimiento;
        this.cliente = cliente;
        this.historialesMedicos = historialesMedicos;
    }
}
