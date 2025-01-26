package exercises._4;

import entities.Exercise;

//4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.

public class Exercise_4 extends Exercise {

    protected Exercise_4() {
        super(
                3,
                "O algoritmo irá informar o número antecessor e o sucessor ao número digitado.",
                value -> value % 1 == 0,
                "O número tem que ser inteiro.",
                "X"
        );
    }

    @Override
    protected void process() {
        System.out.printf("Antecessor: %.0f%n", parameters.get("X") - 1);
        System.out.printf("Sucessor: %.0f%n", parameters.get("X") + 1);
    }
}
