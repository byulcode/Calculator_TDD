package enumcalculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EnumCalculatorTest {

    private EnumCalculator enumCalculator;

    @BeforeEach
    public void setup() {
        enumCalculator = new EnumCalculator();
    }

    @Test
    @DisplayName("7과 4를 더한 값을 반환한다")
    void testResult_7_4() {
        double sum = enumCalculator.result("7 + 4");
        assertThat(sum).isEqualTo(11);
    }
}