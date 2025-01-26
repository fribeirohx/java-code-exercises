package entities;

import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.function.Function;

public abstract class Exercise {
    protected Integer key;
    protected String problemStatement;
    protected LinkedHashMap<String, Double> parameters;
    protected Scanner sc = new Scanner(System.in);
    protected Function<Double, Boolean> inputValidationFunction;
    protected String invalidInputMessage = "";

    protected Exercise(Integer key, String exerciseStatement, String... args) {
        this.key = key;
        this.problemStatement = exerciseStatement;
        this.parameters = new LinkedHashMap<>();
        for (String arg : args) {
            this.parameters.put(arg, null);
        }
        this.inputValidationFunction = value -> true;
    }

    protected Exercise(Integer key, String exerciseStatement, Function<Double, Boolean> inputValidationFunction, String invalidInputMessage, String... args) {
        this.key = key;
        this.problemStatement = exerciseStatement;
        this.parameters = new LinkedHashMap<>();
        for (String arg : args) {
            this.parameters.put(arg, null);
        }
        this.inputValidationFunction = inputValidationFunction;
        this.invalidInputMessage = invalidInputMessage;
    }

    protected void addNewParameter(String key, Double parameter) {
        if (this.parameters.containsKey(key)) {
            throw new IllegalArgumentException(String.format("A parameter %s already exists in the list.", key));
        }
        this.parameters.putIfAbsent(key, parameter);
    }

    public LinkedHashMap<String, Double> getParameters() {
        if (parameters.isEmpty()) {
            throw new IllegalArgumentException("No parameters have been implemented. Please implement at least one parameter.");
        }
        return parameters;
    }

    public void setParameterValue(String key, double value) {
        if (!parameters.containsKey(key)) {
            throw new IllegalArgumentException(String.format("This parameter: %s does not exists in the list.", key));
        }
        parameters.put(key, value);
    }

    protected void readInputValues() {
        Double inputValue = null;

        for (String key : parameters.keySet()) {
            boolean validInput = false;

            while (!validInput) {
                System.out.printf("%s: ", key);
                try {
                    inputValue = sc.nextDouble();
                    validInput = inputValidationFunction.apply(inputValue);
                } catch (InputMismatchException e) {
                    System.out.println("Só será aceito números !");
                }
                System.out.print(" " + invalidInputMessage);
            }

            parameters.put(key, inputValue);
        }
    }

    protected abstract void process();

    public void test() {
        System.out.println(this.parameters);
        process();
    }

    public void run() {
        System.out.printf("%d - %s%n", this.key, this.problemStatement);
        readInputValues();
        process();
        sc.close();
    }
}
