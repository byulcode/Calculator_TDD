public class Calculator {

    public int add_(String text){
        if (isBlank(text)){
            return 0;
        }

        String[] values = splitString(text);
        int sum = 0;
        for(String value : values){
            sum += Integer.parseInt(value);
        }

        return sum;
    }

    public boolean isBlank(String text){
        if (text == null || text.isEmpty())
            return true;
        return false;
    }

    public String[] splitString(String text){
        return text.split(" ");
    }

    public int toInt(String strNum){
        return Integer.parseInt(strNum);
    }

    public int calculate(int firstNum, char operator, int secNum){
        if(operator == '+')
            return add(firstNum, secNum);
        if(operator == '-')
            return subtract(firstNum, secNum);
        if(operator == '*')
            return multiply(firstNum, secNum);
        if(operator == '/')
            return divide(firstNum, secNum);
        throw new RuntimeException();
    }

    public int add(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public int divide(int a, int b){
        if (b == 0){
            throw new IllegalArgumentException("나누는 값이 0일 수 없습니다.");
        }
        return a / b;
    }
}
