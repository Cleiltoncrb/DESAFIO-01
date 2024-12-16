package com.cleilton.desafio01;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Desafio01Application implements CommandLineRunner {

    private final OrdemService ordemService;

    public Desafio01Application(OrdemService ordemService) {
        this.ordemService = ordemService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Desafio01Application.class, args);
    }

    @Override
    public void run(String... args) {
        Pedido pedido1 = new Pedido("154",50.00, 10.00);
        double total1 = ordemService.calcularTotal(pedido1);
        System.out.printf(" - Total do Pedido: R$ %.2f%n%n", total1);

        Pedido pedido2 = new Pedido("125",150.00, 20.00);
        double total2 = ordemService.calcularTotal(pedido2);
        System.out.printf(" - Total do Pedido: R$ %.2f%n%n", total2);

        Pedido pedido3 = new Pedido("2345",250.00, 15.00);
        double total3 = ordemService.calcularTotal(pedido3);
        System.out.printf(" - Total do Pedido: R$ %.2f%n%n", total3);
    }
}
