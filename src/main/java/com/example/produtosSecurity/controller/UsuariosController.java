package com.example.produtosSecurity.controller;

import com.example.produtosSecurity.model.ProdutosModel;
import com.example.produtosSecurity.model.UsuariosModel;
import com.example.produtosSecurity.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/usuarios")
public class UsuariosController {

    @Autowired
    UsuariosService usuariosService;

    @PostMapping(path = "/create")
    public ResponseEntity<UsuariosModel> cadastrarUsuarios(@RequestBody UsuariosModel usuariosModel) {
        UsuariosModel usuario = usuariosService.cadastrarUsuario(usuariosModel);
        return new ResponseEntity<>(usuario, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<UsuariosModel>> exibirUsuarios() {
        return ResponseEntity.ok(usuariosService.exibirUsuarios());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<UsuariosModel>> exibirUsuarioViaId(@PathVariable Long id){
        return ResponseEntity.ok(usuariosService.exibirUsuariosViaId(id));
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<UsuariosModel> alterarUsuariosCadastrados(@RequestBody UsuariosModel usuariosModel){
        return ResponseEntity.ok(usuariosService.alterarUsuariosCadastrados(usuariosModel));
    }

    @DeleteMapping(path = "/{id}")
    public void deletarUsuariosCadastrados(@PathVariable Long id){
        usuariosService.deletarUsuarios(id);
    }

}
