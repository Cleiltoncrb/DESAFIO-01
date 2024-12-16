package com.cleilton.desafio01;

import org.springframework.stereotype.Service;

@Service
public class OrdemService {

    private final FreteService freteService;

    public OrdemService(FreteService freteService) {
        this.freteService = freteService;
    }

    public double calcularTotal(Pedido pedido) {

        double valorComDesconto = pedido.getValorBasico() * (1 - pedido.getDesconto() / 100);
        double frete = freteService.calcularFrete(pedido.getValorBasico());

        System.out.printf("\n");
        System.out.printf("Código do pedido: %s%n", pedido.getCodigo());
        System.out.printf(" - Valor do produto: R$ %.2f%n", pedido.getValorBasico());
        System.out.printf(" - Desconto: %.0f%%%n", pedido.getDesconto());
        System.out.printf(" - Frete: R$ %.2f%n", frete);

        return valorComDesconto + frete;
    }
}
