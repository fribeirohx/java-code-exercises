package exercises._1;

import entities.Exercise;

public class Exercise_1 extends Exercise {
    public Exercise_1() {
        super(
                1,
                "O algoritmo irá verificar se A + B < C. " +
                        "\nInforme os valores abaixo:",
                "A", "B", "C"
        );
    }

    @Override
    protected void process() {
        double sum = parameters.get("A") + parameters.get("B");
        System.out.printf("A + B: %.2f %n", sum);
        System.out.printf(sum >= parameters.get("C") ? "A soma não é menor que C" : "A soma é menor que C 🔥");
    }
}
