package br.com.infnet.projetofinal.calculadora;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class PlanoCartesiano {
    Ponto ponto1;
    Ponto ponto2;

    public PlanoCartesiano(Ponto ponto1, Ponto ponto2) {
        this.ponto1 = ponto1;
        this.ponto2 = ponto2;
    }

    public double calcularDistancia(){
        return Math.sqrt(Math.pow((ponto2.getX() - ponto1.getX()), 2) +  Math.pow((ponto2.getY() - ponto1.getY()), 2));
    }

    public String formatarDistancia(double distancia){
        NumberFormat formatter = new DecimalFormat("#0.0000");
        return formatter.format(distancia);
    }
}
