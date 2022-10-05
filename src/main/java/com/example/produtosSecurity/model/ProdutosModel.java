package com.example.produtosSecurity.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "produtos")
public class ProdutosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_produto", length = 125, nullable = false)
    private String nomeProduto;

    @Column(name = "descricao_produto", length = 125, nullable = false)
    private String descricaoProduto;
}
