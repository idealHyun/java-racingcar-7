package racingcar;

import org.junit.jupiter.api.Test;
import racingcar.domain.RacingCar;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class RacingCarTest {

    @Test
    void shouldThrowExceptionWhenCarNameExceedsMaxLength() {
        assertThrows(IllegalArgumentException.class, () -> {
            new RacingCar("사과자두포도"); // 길이 제한 초과
        });
    }

    @Test
    void shouldThrowExceptionWhenCarNameIsEmpty() {
        assertThrows(IllegalArgumentException.class, () -> {
            new RacingCar(""); // 빈 문자열
        });
    }

    @Test
    void shouldNotThrowExceptionWhenCarNameIsValid() {
        new RacingCar("사과자두배"); // 유효한 이름
    }
}
