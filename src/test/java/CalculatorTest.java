
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("2와 4를 더한 값을 반환한다.")
    void add_2_4(){
        int result = calculator.add(2, 4);
        assertThat(result).isEqualTo(6);
    }

    @Test
    @DisplayName("4와 8을 더한 값을 반환한다.")
    void add_4_8(){
        int result = calculator.add(4, 8);
        assertThat(result).isEqualTo(12);
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

}