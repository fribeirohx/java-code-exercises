package exercises._2;

import entities.Exercise;

//2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.

public class Exercise_2 extends Exercise {

    protected Exercise_2() {
        super(
                2,
                "Digite o número para saber se é par ou impar, positivo ou negativo.",
                "x"
        );
    }

    private boolean isEven(double x) {
        return x % 2 == 0;
    }

    private boolean isPositive(double x) {
        return x >= 0;
    }

    @Override
    protected void process() {
        double value = parameters.get("x");
        System.out.println(isEven(value) ? "Número é par!" : "Número é impar!");
        System.out.println(isPositive(value) ? "Numero é positivo!" : "Número é negativo!");
    }
}
