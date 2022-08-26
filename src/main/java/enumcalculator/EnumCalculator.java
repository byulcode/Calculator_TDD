package enumcalculator;

import java.util.function.BiFunction;

enum OperatorType {
    PLUS('+') {
        public double calculate(double num1, double num2) {
            return num1 + num2;
        }
    },
    MINUS('-') {
        public double calculate(double num1, double num2) {
            return num1 - num2;
        }
    },
    MULTIPLY('*') {
        public double calculate(double num1, double num2) {
            return num1 * num2;
        }
    },
    DIVIDE('/') {
        public double calculate(double num1, double num2) {
            if (num2 == 0) {
                throw new IllegalArgumentException("나누는 값이 0이 될 수 없습니다.");
            }
            return num1 / num2;
        }
    };
    private char enumOperator;

    OperatorType(char enumOperator) {
        this.enumOperator = enumOperator;
    }

    public abstract double calculate(double num1, double num2);


}

public class EnumCalculator {

}
