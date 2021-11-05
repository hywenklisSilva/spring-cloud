package com.microservice.fornecedor.controller;

import com.microservice.fornecedor.model.InfoFornecedor;
import com.microservice.fornecedor.service.InfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/info")
@RequiredArgsConstructor
public class InfoController {

    private InfoService infoService;


    @RequestMapping("/{estado}")
    public InfoFornecedor getInfoEstado(@PathVariable String estado) {
        return infoService.getInfoEstado(estado);
    }

}
