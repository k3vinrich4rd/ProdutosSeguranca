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
@Table(name = "usuarios")
public class UsuariosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_usuario", length = 70, nullable = false)
    private String nomeUsuario;

    @Column(name = "login_usuario", length = 70, nullable = false, unique = true)
    private String login;

    @Column(name = "senha_usuario", length = 70, nullable = false)
    private String senha;
}
