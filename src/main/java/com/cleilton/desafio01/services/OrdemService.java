package com.cleilton.desafio01.services;

import com.cleilton.desafio01.entities.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdemService {

    @Autowired
    private FreteService freteService;

    public double calcularTotal(Pedido pedido) {

        double valorComDesconto = pedido.getValorBasico() * (1 - pedido.getDesconto() / 100);
        double frete = freteService.calcularFrete(pedido.getValorBasico());

        return valorComDesconto + frete;
    }
}
