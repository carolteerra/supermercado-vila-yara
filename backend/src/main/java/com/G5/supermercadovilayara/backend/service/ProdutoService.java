package com.G5.supermercadovilayara.backend.service;

import java.util.List;
import com.G5.supermercadovilayara.backend.model.Produto;
import com.G5.supermercadovilayara.backend.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



@Service
public class ProdutoService {

    @Value("${url}")
    private static String produto;

    @Autowired
    ProdutoRepository produtoRepository;

    public Produto salvarProduto(Produto produto){
        Produto produtoSalvo = produtoRepository.save(produto);
        this.listarProdutos(produtoSalvo);
        return produtoSalvo;
    }

    public Produto consultarProdutoPorId(String id) {
        return (Produto) produtoRepository.findAllById();
    }

    public List<Produto> listarProdutos() {
        return (List<Produto>) produtoRepository.findAll();
    }

    public void listarProdutos (Produto produto) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.postForEntity(produto + "/produtos", produto, Produto.class);
    }

}