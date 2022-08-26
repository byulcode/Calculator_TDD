package enumcalculator;

enum Operation{
    ADD('+'), MINUS('-'), MULTIPLY('*'), DIVIDE('/');
    private char operator;
    Operation(char operator){
        this.operator = operator;
    }

    public char getOperator(){
        return this.operator;
    }
}

public class EnumCalculator {
}
