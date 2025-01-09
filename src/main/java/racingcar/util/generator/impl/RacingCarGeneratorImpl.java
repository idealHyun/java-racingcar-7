package racingcar.util.generator.impl;

import racingcar.domain.RacingCar;
import racingcar.util.generator.RacingCarGenerator;

import java.util.List;

public class RacingCarGeneratorImpl implements RacingCarGenerator {
    @Override
    public List<RacingCar> generateRacingCars(List<String> carNames) {
        return carNames.stream().map(RacingCar::new).toList();
    }
}
