package exercises._5;

import entities.Exercise;

//5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20)

public class Exercise_5 extends Exercise {
    private final double MINIMUM_WAGE = 1518.00;

    protected Exercise_5() {
        super(
                3,
                "O algoritmo irá verificar quantos salários minimos o usuario ganha.",
                "Salário Mínimo", "Salário Atual"
        );

        setInputValidationFunction(
                value -> value >= MINIMUM_WAGE,
                String.format(
                        "O valor tem que ser maior ou igual ao salário mínimo base: %.2f", MINIMUM_WAGE));
    }

    @Override
    protected void process() {
        double minimumWage = parameters.get("Salário Mínimo");
        double currentSalary = parameters.get("Salário Atual");

        System.out.printf("O usuário ganha: %.2f salarios minimos%n", currentSalary / minimumWage);
    }
}
