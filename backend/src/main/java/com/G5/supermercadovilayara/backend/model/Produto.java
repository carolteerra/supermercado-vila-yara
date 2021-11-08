package com.G5.supermercadovilayara.backend.model;


import java.io.Serializable;

import javax.persistence.*;
import java.util.Objects;


@Entity
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOME", nullable = false)
    private String nome;

    @Column(name = "CATEGORIA", nullable = false)
    private String categoria;

    @Column(name = "DESCRIÇÃO", nullable = false)
    private String descricao;

    @Column(name = "PRECO", nullable = false)
    private double preco;

    @Column(name = "QUANTIDADE", nullable = false)
    private int qtd;

    @Column(name = "IMAGEM", nullable = false)
    private String imgURL;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto)) return false;
        Produto produto = (Produto) o;
        return Objects.equals(id, produto.id) && nome.equals(produto.nome) && categoria.equals(produto.categoria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, categoria);
    }
}