public class Calculator {

    public int result(String text) {
        if (text == null || text.isEmpty()) {
            throw new IllegalArgumentException("빈 값을 입력받을 수 없습니다.");
        }
        return strToIntCalculator(text.split(" "));
    }

    public int strToIntCalculator(String[] values) {
        int calculateResult = Integer.parseInt(values[0]);
        for (int i = 0; i < values.length - 2; i += 2) {
            calculateResult = calculate(calculateResult, values[i + 1].charAt(0), Integer.parseInt(values[i + 2]));
        }
        return calculateResult;
    }

    public int calculate(int firstNum, char operator, int secNum) {
        if (operator == '+')
            return add(firstNum, secNum);
        if (operator == '-')
            return subtract(firstNum, secNum);
        if (operator == '*')
            return multiply(firstNum, secNum);
        if (operator == '/')
            return divide(firstNum, secNum);
        throw new RuntimeException();
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("나누는 값이 0일 수 없습니다.");
        }
        return a / b;
    }
}
