package enumcalculator;

import java.util.Scanner;

public class EnumCalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        int result = EnumCalculator.inputAndReturn(text);
        System.out.println(text + " = " + result);
    }
}
