package com.infnet.dev.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "produtoClient", url = "https://api.exemplo.com")
public interface ProdutoClient {

    @GetMapping("/produtos")
    ProdutoResponse getProdutoInfo(@RequestParam("id") String produtoId);
}
