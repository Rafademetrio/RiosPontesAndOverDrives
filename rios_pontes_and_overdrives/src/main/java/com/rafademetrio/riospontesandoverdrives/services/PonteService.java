package com.rafademetrio.riospontesandoverdrives.services;

import com.rafademetrio.riospontesandoverdrives.models.Ponte;
import com.rafademetrio.riospontesandoverdrives.models.PonteInputDTO;
import com.rafademetrio.riospontesandoverdrives.models.PonteOutputDTO;
import com.rafademetrio.riospontesandoverdrives.repositories.PonteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class PonteService {

    @Autowired
    PonteRepository ponteRepository;


    public ResponseEntity<PonteOutputDTO> save(PonteInputDTO ponteInputDTO) {
        Ponte ponte;

        ponte = new Ponte(ponteInputDTO);

        try {
            Ponte.gerarRelatorio(ponte);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        PonteOutputDTO ponteOutputDTO = new PonteOutputDTO(this.ponteRepository.save(ponte));

        return new ResponseEntity<>(ponteOutputDTO, HttpStatus.OK);
    }
}
