package com.infnet.dev.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "apiExterna", url = "https://api.externa.com")
public interface ApiExternaClient {
    @GetMapping("/dados")
    DadosExternos obterDadosExternos();
}
