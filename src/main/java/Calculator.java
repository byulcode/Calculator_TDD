public class Calculator {

    public int add(String text){
        if (text == null || text.isEmpty()){
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
        if (text == null || text.isEmpty()){
            return false;
        }
        return true;
    }

    public String[] splitString(String text){
        return text.split(" ");
    }




    public int subtract(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public double divide(double a, double b){
        if (b == 0){
            throw new IllegalArgumentException("나누는 값이 0일 수 없습니다.");
        }
        return a / b;
    }
}
