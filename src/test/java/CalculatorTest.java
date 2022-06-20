import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("두 수와 연산자를 입력하면 두 수를 연산자에 따라 계산한 값을 반환한다.")
    void test_calculate(){
        assertEquals(3, calculator.calculate(1, '+', 2));
        assertEquals(1, calculator.calculate(3, '-', 2));
    }

    @Test
    @DisplayName("split 된 문자열 배열을 입력하면 계산하여 결과를 반환한다.")
    void strToIntCalculator() {
        assertEquals(3, calculator.strToIntCalculator(new String[]{"1", "+", "2"}));
        assertEquals(8, calculator.strToIntCalculator(new String[]{"4", "*", "2"}));
        assertEquals(6, calculator.strToIntCalculator(new String[]{"4", "*", "2", "-", "2"}));
    }

    @Test
    @DisplayName("")
    void divide_validate() {
        assertThatThrownBy(() ->
                calculator.divide(4, 0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("나누는 값이 0일 수 없습니다.");
    }


    @Test
    @DisplayName("4에서 2를 뺀 값을 반환한다")
    void subtract_4_2() {
        int result = calculator.subtract(4, 2);
        assertThat(result).isEqualTo(2);
    }

    @Test
    @DisplayName("25에서 5를 뺀 값을 반환한다")
    void subtract_25_5() {
        int result = calculator.subtract(25, 5);
        assertThat(result).isEqualTo(20);
    }

    @Test
    @DisplayName("3와 4를 곱한 값을 반환한다")
    void multiply_3_4() {
        int result = calculator.multiply(3, 4);
        assertThat(result).isEqualTo(12);
    }

    @Test
    @DisplayName("5와 2를 곱한 값을 반환한다")
    void multiply_5_2() {
        int result = calculator.multiply(5, 2);
        assertThat(result).isEqualTo(10);
    }

    @Test
    @DisplayName("두 수를 나눈 값을 반환한다.")
    void divide_4_2() {
        double result = calculator.divide(4, 2);
        assertThat(result).isEqualTo(2);
    }

    @Test
    @DisplayName("두 수를 나눈 값을 반환한다.")
    void divide_5_2() {
        double result = calculator.divide(5, 2);
        assertThat(result).isEqualTo(2);
    }



}
