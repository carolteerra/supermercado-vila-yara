package com.G5.supermercadovilayara.backend.controller;

import com.G5.supermercadovilayara.backend.model.Produto;
import com.G5.supermercadovilayara.backend.service.ProdutoService;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;




@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @PostMapping()
    public Produto salvarProduto(@RequestBody Produto produto){
        return produtoService.salvarProduto(produto);
    }

    @GetMapping("/{nome}")
    public Produto consultarProdutoPorNome(@PathVariable String nome){
        return produtoService.consultarProdutoPorId(nome);
    }

    @GetMapping(value = { "", "/" })
    public @NotNull
    Iterable<Produto> getProduto() {
        return produtoService.listarProdutos();
    }

}
