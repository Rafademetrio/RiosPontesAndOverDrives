package com.rafademetrio.riospontesandoverdrives.services;

import com.rafademetrio.riospontesandoverdrives.models.Usuario;
import com.rafademetrio.riospontesandoverdrives.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    //TODO - implementar UsarioInputDTO e UsuarioOutputDTO
    public ResponseEntity<Usuario> save (Usuario usuario){
        this.usuarioRepository.save(usuario);

        return new ResponseEntity<>(usuario, HttpStatus.CREATED);
    }


}
