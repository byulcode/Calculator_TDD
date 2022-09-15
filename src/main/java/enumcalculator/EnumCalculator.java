package enumcalculator;

import java.util.function.BiFunction;

enum OperatorType {
    PLUS("+", (num1, num2) -> num1 + num2),
    MINUS("-", (num1, num2) -> num1 + num2),
    MULTIPLY("*", (num1, num2) -> num1 + num2),
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
}

public class EnumCalculator {
    public double result(String text) {
     /*   if (text == null || text.isEmpty()) {
            throw new IllegalArgumentException("빈 값을 입력할 수 없습니다.");
        }
        return calculateOperation(text.split(" "));
    }

    double calculateOperation(String[] values) {
        OperatorType operatorType = OperatorType.decideOperation(values[1]);
        return operatorType.calculate(Double.parseDouble(values[0]), Double.parseDouble(values[2]));
    }*/
        return 0;
    }
}
