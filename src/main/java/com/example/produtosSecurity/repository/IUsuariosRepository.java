package com.example.produtosSecurity.repository;

import com.example.produtosSecurity.model.UsuariosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuariosRepository extends JpaRepository<UsuariosModel, Long> {
}
