package com.microservice.fornecedor.service;

import com.microservice.fornecedor.model.InfoFornecedor;
import com.microservice.fornecedor.repository.InfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InfoService {

    private InfoRepository infoRepository;

    public InfoFornecedor getInfoEstado(String estado) {
        return infoRepository.findByEstado(estado);
    }

}
