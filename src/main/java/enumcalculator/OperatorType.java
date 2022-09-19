package enumcalculator;

import java.util.Arrays;
import java.util.function.BiFunction;

public enum OperatorType {
    PLUS("+", (num1, num2) -> num1 + num2),
    MINUS("-", (num1, num2) -> num1 - num2),
    MULTIPLY("*", (num1, num2) -> num1 * num2),
    DIVIDE("/", (num1, num2) -> {
        if (num2 == 0) {
            throw new IllegalArgumentException("나누는 값이 0이 될 수 없습니다.");
        }
        return num1 / num2;
    });

    private String enumOperator;
    private BiFunction<Integer, Integer, Integer> expression;

    OperatorType(String enumOperator, BiFunction<Integer, Integer, Integer> expression) {
        this.enumOperator = enumOperator;
        this.expression = expression;
    }

    private static OperatorType findOperator(String operator) {
        return Arrays.stream(values())
                .filter(operatorType -> operatorType.enumOperator.equals(operator))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("연산자를 찾을 수 없습니다."));
    }

    public static int operationResult(int num1, String operator, int num2) {
        return findOperator(operator).expression.apply(num1, num2);
    }
}
