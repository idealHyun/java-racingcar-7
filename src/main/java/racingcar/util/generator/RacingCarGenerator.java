package racingcar.util.generator;

import racingcar.domain.RacingCar;
import java.util.List;

public interface RacingCarGenerator {
    public List<RacingCar> generateRacingCars(List<String> carNames);
}
