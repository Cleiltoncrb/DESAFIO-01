package com.cleilton.desafio01;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.cleilton.desafio01.entities.Pedido;
import com.cleilton.desafio01.services.OrdemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Scanner;

@SpringBootApplication
@ComponentScan({"com.cleilton.desafio01"})
public class Desafio01Application implements CommandLineRunner {

    @Autowired
    private OrdemService ordemService;

    public static void main(String[] args) {
        SpringApplication.run(Desafio01Application.class, args);
    }

    @Override
    public void run(String... args) {

        System.out.println();

        Pedido order1 = new Pedido(1034, 150.0, 20.0);
        System.out.println("Pedido código: " + order1.getCodigo());
        System.out.println("Valor total: R$ " + ordemService.calcularTotal(order1));

        System.out.println();

        Pedido order2 = new Pedido(2282, 800.0, 10.0);
        System.out.println("Pedido código: " + order2.getCodigo());
        System.out.println("Valor total: R$ " + ordemService.calcularTotal(order2));

        System.out.println();

        Pedido order3 = new Pedido(1309, 95.90, 0.0);
        System.out.println("Pedido código: " + order3.getCodigo());
        System.out.println("Valor total: R$ " + ordemService.calcularTotal(order3));

    }
}

