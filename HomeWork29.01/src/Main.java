import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Привет, введи два числа.");
        Scanner scanner = new Scanner(System.in);
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        ArithmeticOperations arithmeticOperations = new ArithmeticOperations(number1, number2);
        double mult = arithmeticOperations.getResultMulti();
        double div = arithmeticOperations.getResultDivide();
        double add = arithmeticOperations.getResultAddition();
        double sub = arithmeticOperations.getResultSubtraction();
        boolean isEven = arithmeticOperations.isEven();


        System.out.println(mult);
        System.out.println(div);
        System.out.println(add);
        System.out.println(sub);
        System.out.println("Результат сложения кратен двум: " + isEven);
        System.out.println("Надеюсь я правильно понял д/з, и справился с ним.");

    }
}