package enumcalculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class EnumCalculatorTest {
    /*@Test
    @DisplayName("'+' 연산자를 입력하면 PLUS상수를 반환한다")
    void testFindOperator() {
        assertThat(OperatorType.findOperator("+")).isEqualTo(OperatorType.PLUS);
    }
*/
    @Test
    @DisplayName("7 - 5 연산 값을 반환")
    void testFindOperator() {
        assertThat(OperatorType.operationResult(7, "-", 5)).isEqualTo(2);
    }

    @Test
    @DisplayName("7 - 5 연산 값을 반환")
    void testOperation_7_5() {
        assertThat(OperatorType.operationResult(7, "-", 5)).isEqualTo(2);
    }

    @Test
    @DisplayName("")
    void divide_validate() {
        assertThatThrownBy(() ->
                OperatorType.operationResult(4,"/", 0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("나누는 값이 0이 될 수 없습니다.");
    }
}

