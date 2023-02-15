package Singleton;

public class CalculatorTester {
    public static void main(String[] args) {
        Calculator calc = Calculator.getInstance();
        calc.add(20);
        System.out.println("Current: " + calc.getAnswer());
    }
}
