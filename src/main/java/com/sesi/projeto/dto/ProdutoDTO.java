package com.sesi.projeto.dto;

import com.sesi.projeto.entities.Produto;

public class ProdutoDTO{

    private Long id;
    private String nome;
    private double preco ;
    private String descricao;
    private String imgUrl;

    public ProdutoDTO(Long id,String nome, double preco, String descricao, String imgUrl) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.imgUrl = imgUrl;
    }

    public ProdutoDTO() {
    }

    public ProdutoDTO(Produto produto) {
        id = produto.getId();
        nome = produto.getNome();
        preco = produto.getPreco();
        descricao = produto.getDescricao();
        imgUrl = produto.getImgUrl();
    }

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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
