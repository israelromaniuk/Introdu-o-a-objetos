package com.br.revisao.model;

public class CadastroClientes {
    
    //variaveis usadas so nesssa class
    private String nome, endereco;
    private int telefone;
    
     //metodos get & set
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereço) {
        this.endereco = endereço;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
