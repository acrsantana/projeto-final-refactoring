package br.com.infnet.projetofinal.calculadora;

import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Ponto ponto1 = new Ponto();
        Ponto ponto2 = new Ponto();
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite x1: ");
        ponto1.setX(entrada.nextInt());
        System.out.print("Digite y1: ");
        ponto1.setY(entrada.nextInt());
        System.out.print("Digite x2: ");
        ponto2.setX(entrada.nextInt());
        System.out.print("Digite y2: ");
        ponto2.setY(entrada.nextInt());

        PlanoCartesiano calcula = new PlanoCartesiano();
        System.out.println("Distancia entre os pontos: " + calcula.formatarDistancia(calcula.calcularDistancia(ponto1, ponto2)));

    }
}
