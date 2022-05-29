
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("받은 문자열이 null 또는 빈문자일 경우 0을 반환한다.")
    void add_null_empty(){
        assertEquals(0, calculator.add(null));
        assertEquals(0,calculator.add(""));
    }

    @Test
    @DisplayName("숫자 하나를 문자열로 입력한 경우 해당 숫자를 반환한다.")
    void add_one_num(){
        assertEquals(1, calculator.add("1"));
    }

    @Test
    @DisplayName("숫자 두개를 쉼표(,) 구분자로 입력할 경우 두 숫자의 합을 반환한다.")
    void add_by_comma(){
        assertEquals(3, calculator.add("1,2"));
    }





    @Test
    @DisplayName("나누는 값이 0이면 에러를 반환한다.")
    void divide_validate() {
        assertThatThrownBy(() ->
                calculator.divide(4,0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("나누는 값이 0일 수 없습니다.");
    }


    @Test
    @DisplayName("4에서 2를 뺀 값을 반환한다")
    void subtract_4_2(){
        int result = calculator.subtract(4, 2);
        assertThat(result).isEqualTo(2);
    }

    @Test
    @DisplayName("25에서 5를 뺀 값을 반환한다")
    void subtract_25_5(){
        int result = calculator.subtract(25, 5);
        assertThat(result).isEqualTo(20);
    }

    @Test
    @DisplayName("3와 4를 곱한 값을 반환한다")
    void multiply_3_4(){
        int result = calculator.multiply(3, 4);
        assertThat(result).isEqualTo(12);
    }

    @Test
    @DisplayName("5와 2를 곱한 값을 반환한다")
    void multiply_5_2(){
        int result = calculator.multiply(5, 2);
        assertThat(result).isEqualTo(10);
    }

    @Test
    @DisplayName("두 수를 나눈 값을 반환한다.")
    void divide_4_2(){
        double result = calculator.divide(4, 2);
        assertThat(result).isEqualTo(2);
    }

    @Test
    @DisplayName("두 수를 나눈 값을 반환한다.")
    void divide_5_2(){
        double result = calculator.divide(5, 2);
        assertThat(result).isEqualTo(2.5);
    }


    @Test
    @DisplayName("입력된 값이 숫자가 아니면 에러를 반환한다.")
    void input_valid() {

    }


}
