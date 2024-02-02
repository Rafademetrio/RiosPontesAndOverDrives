package com.rafademetrio.riospontesandoverdrives.repositories;

import com.rafademetrio.riospontesandoverdrives.models.Ponte;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.math.BigInteger;

public interface PonteRepository extends CrudRepository<Ponte, BigInteger> {
}
