package com.danielvaca.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielvaca.apirest.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto,Long>{

}
