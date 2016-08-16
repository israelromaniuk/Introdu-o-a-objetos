package com.br.revisao.model;

public class CadastroProdutos {

    private String nomeProdut, tipo;
    private double preco;
    private int quantidadeEstoq;

    public String getNomeProdut() {
        return nomeProdut;
    }

    public void setNomeProdut(String nomeProdut) {
        this.nomeProdut = nomeProdut;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoq() {
        return quantidadeEstoq;
    }

    public void setQuantidadeEstoq(int quantidadeEstoq) {
        this.quantidadeEstoq = quantidadeEstoq;
    }
}
