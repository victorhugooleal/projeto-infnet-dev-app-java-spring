package com.infnet.dev.external;

public class ProdutoResponse {
    private String id;
    private String nome;
    private Double preco;

    // Getters e Setters

    @Override
    public String toString() {
        return "ProdutoResponse [id=" + id + ", nome=" + nome + ", preco=" + preco + "]";
    }
}
