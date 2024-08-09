package com.cuidadomascotas.PetCare.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ClienteMascotaDTO {

    private Long id;
    private String dueño;
    private String mascota;

    public ClienteMascotaDTO(){}

    public ClienteMascotaDTO(Long id, String dueño, String mascota) {
        this.id = id;
        this.dueño = dueño;
        this.mascota = mascota;
    }
}
