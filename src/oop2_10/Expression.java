package oop2_10;

public class Expression {
    private double a;
    private double b;
    private String operator;

    public Expression(String aStr, String operator, String bStr) throws IllegalArgumentException {
        try {
            this.a = Double.parseDouble(aStr);
            this.b = Double.parseDouble(bStr);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Error! Not number");
        }

        if (!operator.matches("[+\\-*/]")) {
            throw new IllegalArgumentException("Operation Error!");
        }

        if (operator.equals("/") && b == 0) {
            throw new IllegalArgumentException("Error! Division by zero");
        }

        this.operator = operator;
    }

    public double evaluate() {
        return switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> throw new IllegalStateException("Unexpected operator: " + operator);
        };
    }
}
