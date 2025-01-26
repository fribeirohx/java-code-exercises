package exercises._3;

import entities.Exercise;

//3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores, caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e imprimir seu valor na tela.

public class Exercise_3 extends Exercise {

    protected Exercise_3() {
        super(
                3,
                "O algoritmo irá somar os valores de A + B caso sejam iguais ou multiplicar caso sejam diferentes. O resultado será a variável C." + "\nDigite os valores:",
                value -> value % 1 == 0,
                "O número tem que ser inteiro.",
                "A", "B"
        );
    }

    private double compute(double a, double b) {
        boolean isEqual = parameters.get("A").equals(parameters.get("B"));
        return isEqual ? a + b : a * b;
    }

    @Override
    protected void process() {
        double c = compute(parameters.get("A"), parameters.get("B"));
        System.out.printf("C: %.0f%n", c);
    }
}
