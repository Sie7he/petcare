package com.cuidadomascotas.PetCare.service;

import com.cuidadomascotas.PetCare.dto.ClienteMascotaDTO;
import com.cuidadomascotas.PetCare.model.Mascota;
import com.cuidadomascotas.PetCare.repository.IMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MascotaService implements IMascotaService{

    @Autowired
    private IMascotaRepository mascotaRepository;

    @Override
    public List<Mascota> getMascotas() {
        return mascotaRepository.findAll();
    }

    @Override
    public Mascota saveMascota(Mascota mascota) {
        return mascotaRepository.save(mascota);
    }

    @Override
    public Mascota findMascotaById(Long id) {
        return mascotaRepository.findById(id).orElse(null);
    }

    @Override
    public Mascota updateMascota(Mascota mascota) {
        return this.saveMascota(mascota);
    }

    @Override
    public void deleteMascotaById(Long id) {
        mascotaRepository.deleteById(id);

    }

    @Override
    public List<ClienteMascotaDTO> getClienteMascota() {
        List<Mascota> listaMascotas = this.getMascotas();
        List<ClienteMascotaDTO> listaMascotaDTO = new ArrayList<>();
        ClienteMascotaDTO clienteMascotaDTO = new ClienteMascotaDTO();
        for(Mascota mascota : listaMascotas) {
            clienteMascotaDTO.setId(mascota.getId_mascota());
            clienteMascotaDTO.setDueño(mascota.getCliente().getNombre()+" "+mascota.getCliente().getApellido());
            clienteMascotaDTO.setMascota(mascota.getNombre());
            listaMascotaDTO.add(clienteMascotaDTO);
            clienteMascotaDTO = new ClienteMascotaDTO();
        }
        return listaMascotaDTO;
    }
}
