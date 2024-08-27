package com.infnet.dev.service;

import com.infnet.dev.external.ProdutoClient;
import com.infnet.dev.external.ProdutoResponse;
import org.springframework.beans.factory.annotation.Autowired;

public class ProdutoService {
    private final ProdutoClient produtoClient;

    @Autowired
    public ProdutoService(ProdutoClient produtoClient) {
        this.produtoClient = produtoClient;
    }

    public ProdutoResponse obterInformacoesProduto(String produtoId) {
        return produtoClient.getProdutoInfo(produtoId);
    }
}
