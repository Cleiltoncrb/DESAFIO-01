package com.cleilton.desafio01;

import com.cleilton.desafio01.entities.Pedido;
import com.cleilton.desafio01.services.OrdemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Scanner;

@SpringBootApplication

public class Desafio01Application implements CommandLineRunner {

    @Autowired
    private OrdemService ordemService;

//    public Desafio01Application(OrdemService ordemService) {
//        this.ordemService = ordemService;
//    }

    public static void main(String[] args) {
        SpringApplication.run(Desafio01Application.class, args);
    }

    @Override
    public void run(String... args) {

        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        System.out.print("\n\n");

        while (continuar) {

            System.out.print("Digite o valor básico do pedido: R$ ");
            double valorBasico = scanner.nextDouble();

            System.out.print("Digite o desconto do pedido (em %): ");
            double desconto = scanner.nextDouble();


            Pedido pedido = new Pedido(valorBasico, desconto);
            double total = ordemService.calcularTotal(pedido);
            System.out.printf(" - Total do Pedido: R$ %.2f%n%n", total);


            String resposta;
            boolean respostaValida = false;
            while (!respostaValida) {
                System.out.print("\n Deseja fazer outro pedido? \n Digite ( 1 para Sim ) ou ( 0 para Não ) ");
                resposta = scanner.next();

                if (resposta.equals("1")) {
                    respostaValida = true;
                } else if (resposta.equals("0")) {
                    respostaValida = true;
                    continuar = false;
                } else {
                    System.out.println("\n\n Por favor, digite ( 1 para Sim ) ou ( 0 para Não )!!! ");
                }
            }
        }

        System.out.println("\n\n\n Obrigado por usar o sistema de pedidos!");
        scanner.close();
    }


}
