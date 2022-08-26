package enumcalculator;

import java.util.function.BiFunction;

enum OperatorType {
    PLUS("+") {
        public double calculate(double num1, double num2) {
            return num1 + num2;
        }
    },
    MINUS("-") {
        public double calculate(double num1, double num2) {
            return num1 - num2;
        }
    },
    MULTIPLY("*") {
        public double calculate(double num1, double num2) {
            return num1 * num2;
        }
    },
    DIVIDE("/") {
        public double calculate(double num1, double num2) {
            if (num2 == 0) {
                throw new IllegalArgumentException("나누는 값이 0이 될 수 없습니다.");
            }
            return num1 / num2;
        }
    };
    private String enumOperator;

    OperatorType(String enumOperator) {
        this.enumOperator = enumOperator;
    }

    public abstract double calculate(double num1, double num2);

    public OperatorType decideOperation(String enumOperator) {
        if (enumOperator.equals(PLUS.enumOperator)) {
            return PLUS;
        }
        if (enumOperator.equals(MINUS.enumOperator)) {
            return MINUS;
        }
        if (enumOperator.equals(MULTIPLY.enumOperator)) {
            return MULTIPLY;
        }
        if (enumOperator.equals(DIVIDE.enumOperator)) {
            return DIVIDE;
        }
        throw new IllegalArgumentException("사칙연산의 기호가 아닙니다.");
    }


}

public class EnumCalculator {

}
