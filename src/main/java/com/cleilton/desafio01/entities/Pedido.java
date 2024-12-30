package com.cleilton.desafio01.entities;

import lombok.Data;

import java.util.Random;
@Data
public class Pedido {

    private int codigo;
    private double valorBasico;
    private double desconto;

    public Pedido( int codigo, double valorBasico, double desconto) {
        this.codigo = codigo;
        this.valorBasico = valorBasico;
        this.desconto = desconto;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getValorBasico() {
        return valorBasico;
    }

    public double getDesconto() {
        return desconto;
    }
}