package com.cleilton.desafio01;

import org.springframework.stereotype.Service;

@Service
public class FreteService {
    public double calcularFrete(double valorBasico) {

        if (valorBasico < 100.00) {
            return 20.00;
        } else if (valorBasico < 200.00) {
            return 12.00;
        } else {
            return 0.00;
        }
    }
}
