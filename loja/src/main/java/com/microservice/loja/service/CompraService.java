package com.microservice.loja.service;

import com.microservice.loja.client.FornecedorClient;
import com.microservice.loja.dto.CompraDto;
import com.microservice.loja.dto.InfoFornecedorDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompraService {

    @Autowired
    private FornecedorClient fornecedorClient;


    public void realizaCompra(CompraDto compra) {
        InfoFornecedorDto info = fornecedorClient.getInfoEstado(compra.getEndereco().getEstado());

        System.out.println(info.getEndereco());
    }
}
