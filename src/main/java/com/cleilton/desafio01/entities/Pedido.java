package com.cleilton.desafio01.entities;

import java.util.Random;

public class Pedido {

    private String codigo;
    private double valorBasico;
    private double desconto;

    public Pedido( double valorBasico, double desconto) {
        this.codigo = gerarCodigoAleatorio();
        this.valorBasico = valorBasico;
        this.desconto = desconto;
    }

    private String gerarCodigoAleatorio() {
        Random random = new Random();
        int codigoGerado = random.nextInt(10000);
        return String.format("PED-%06d", codigoGerado);
    }

    public String getCodigo() {
        return codigo;
    }
    public double getValorBasico() {
        return valorBasico;
    }

    public double getDesconto() {
        return desconto;
    }
}