import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();

        int result = calculator.result(inputText);
        System.out.println(inputText + " = " + result);

    }
}
