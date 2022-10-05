package com.example.produtosSecurity.controller;

import com.example.produtosSecurity.model.ProdutosModel;
import com.example.produtosSecurity.service.ProdutosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/produtos")
public class ProdutosController {

    @Autowired
    ProdutosService produtosService;


    @PostMapping(path = "/create")
    public ResponseEntity<ProdutosModel> cadastrarProdutos(@RequestBody ProdutosModel produtosModel) {
        ProdutosModel produtos = produtosService.cadastrarProdutos(produtosModel);
        return new ResponseEntity<>(produtos, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ProdutosModel>> exibirProdutos() {
        return ResponseEntity.ok(produtosService.exibirTodosProdutos());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<ProdutosModel>> exibirProdutosViaId(@PathVariable Long id){
        return ResponseEntity.ok(produtosService.exibirProdutosViaId(id));

    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<ProdutosModel> alterarProdutosCadastrados(@RequestBody ProdutosModel produtosModel){
        return ResponseEntity.ok(produtosService.alterarProdutosCadastrados(produtosModel));
    }

    @DeleteMapping(path = "/{id}")
    public void deletarProdutosCadastrados(@PathVariable Long id){
        produtosService.deletarProdutosCadastrados(id);
    }


}
