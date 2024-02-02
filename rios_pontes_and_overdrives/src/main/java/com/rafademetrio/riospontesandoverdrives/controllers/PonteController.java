package com.rafademetrio.riospontesandoverdrives.controllers;


import com.rafademetrio.riospontesandoverdrives.models.PonteInputDTO;
import com.rafademetrio.riospontesandoverdrives.models.PonteOutputDTO;
import com.rafademetrio.riospontesandoverdrives.services.PonteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/ponte")
public class PonteController {

    @Autowired
    PonteService ponteService;

    @PostMapping
    public ResponseEntity<PonteOutputDTO> criarNovoRelatorio(@RequestBody PonteInputDTO ponteInputDTO){
        return this.ponteService.save(ponteInputDTO);
    }



}
