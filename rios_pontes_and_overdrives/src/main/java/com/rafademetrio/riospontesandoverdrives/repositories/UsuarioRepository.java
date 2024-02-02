package com.rafademetrio.riospontesandoverdrives.repositories;

import com.rafademetrio.riospontesandoverdrives.models.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;

public interface UsuarioRepository extends CrudRepository<Usuario, BigInteger> {
}
