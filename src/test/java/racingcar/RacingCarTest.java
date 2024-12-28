package racingcar;

import org.junit.jupiter.api.Test;
import racingcar.domain.RacingCar;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class RacingCarTest {

    @Test
    void testRacingCar_ThrowExceptionOfLengthOfCarName() {
        assertThrows(IllegalArgumentException.class, () -> {
            new RacingCar("사과자두포도");
        });
    }

    @Test
    void testRacingCar_ThrowExceptionOfNullOfCarName() {
        assertThrows(IllegalArgumentException.class, () -> {
            new RacingCar("");
        });
    }

    @Test
    void testRacingCar_NoExceptionForValidNam() {
        new RacingCar("사과자두배");
    }
}
