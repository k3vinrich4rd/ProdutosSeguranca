package com.example.produtosSecurity.repository;

import com.example.produtosSecurity.model.ProdutosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProdutosRepository extends JpaRepository<ProdutosModel, Long> {
}
