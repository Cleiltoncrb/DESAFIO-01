package com.cleilton.desafio01;

public class Pedido {

    private String codigo;
    private double valorBasico;
    private double desconto;

    public Pedido(String codigo, double valorBasico, double desconto) {
        this.codigo = codigo;
        this.valorBasico = valorBasico;
        this.desconto = desconto;
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