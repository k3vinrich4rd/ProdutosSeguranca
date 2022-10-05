package com.example.produtosSecurity.service;

import com.example.produtosSecurity.model.ProdutosModel;
import com.example.produtosSecurity.repository.IProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutosService {

    @Autowired
    IProdutosRepository iProdutosRepository;

    public ProdutosModel cadastrarProdutos(ProdutosModel produtosModel) {
        return iProdutosRepository.save(produtosModel);
    }

    public List<ProdutosModel> exibirTodosProdutos() {
        return iProdutosRepository.findAll();
    }

    public Optional<ProdutosModel> exibirProdutosViaId(Long id) {
        return iProdutosRepository.findById(id);
    }

    public ProdutosModel alterarProdutosCadastrados(ProdutosModel produtosModel) {
        return iProdutosRepository.save(produtosModel);
    }

    public void deletarProdutosCadastrados(Long id) {
        iProdutosRepository.deleteById(id);
    }
}
