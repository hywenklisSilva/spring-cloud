package com.microservice.loja.client;

import com.microservice.loja.dto.InfoFornecedorDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("fornecedor")
public interface FornecedorClient {

    @RequestMapping("/info/{estado}")
    InfoFornecedorDto getInfoEstado(@PathVariable String estado);
}
