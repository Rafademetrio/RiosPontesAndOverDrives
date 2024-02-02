package com.rafademetrio.riospontesandoverdrives.controllers;

import com.rafademetrio.riospontesandoverdrives.models.Usuario;
import com.rafademetrio.riospontesandoverdrives.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    //TODO implementar UsuarioOutputDTO
    @PostMapping
    public ResponseEntity<Usuario> salvar (Usuario usuario){
        usuarioService.save(usuario);

        return new ResponseEntity<>(usuario, HttpStatus.CREATED);
    }


}
