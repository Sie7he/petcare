package com.cuidadomascotas.PetCare.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
@Entity
@JsonIgnoreProperties({"mascota"})
public class HistorialMedico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_historial;
    private LocalDate fecha_visita;
    private String motivo_visita;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String diagnostico;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String tratamiento;
    private String medicacion;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String observaciones;

    @ManyToOne
    @JoinColumn(name = "id_veterinario", referencedColumnName = "id")
    private Veterinario veterinario;
    private LocalDate proxima_visita;

    @ManyToOne
    @JoinColumn(name = "id_mascota")
    private Mascota mascota;

    public HistorialMedico(){}

    public HistorialMedico(Long id_historial, LocalDate fecha_visita, String motivo_visita, String diagnostico, String tratamiento, String medicacion, String observaciones, Veterinario veterinario, LocalDate proxima_visita, Mascota mascota) {
        this.id_historial = id_historial;
        this.fecha_visita = fecha_visita;
        this.motivo_visita = motivo_visita;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.medicacion = medicacion;
        this.observaciones = observaciones;
        this.veterinario = veterinario;
        this.proxima_visita = proxima_visita;
        this.mascota = mascota;
    }
}
