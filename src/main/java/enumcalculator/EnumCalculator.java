package enumcalculator;

public class EnumCalculator {
    public static int inputAndReturn(String text) {
        if (text == null || text.isEmpty()) {
            throw new IllegalArgumentException("빈 값을 입력받을 수 없습니다.");
        }
        return calculate(text.split(" "));
    }

    public static int calculate(String[] values){
        int result = Integer.parseInt(values[0]);
        for(int i=0; i < values.length - 2; i+= 2){
            result = OperatorType.operationResult(result, values[i + 1], Integer.parseInt(values[i+2]));
        }
        return result;
    }
}
