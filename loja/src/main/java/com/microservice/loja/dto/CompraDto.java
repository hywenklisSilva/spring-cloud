package com.microservice.loja.dto;

import java.util.List;

public class CompraDto {

    private List<itemDaCompraDto> itens;

    public List<itemDaCompraDto> getItens() {
        return itens;
    }

    public void setItens(List<itemDaCompraDto> itens) {
        this.itens = itens;
    }

    public EnderecoDto getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoDto endereco) {
        this.endereco = endereco;
    }

    private EnderecoDto endereco;
}
