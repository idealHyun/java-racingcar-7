package racingcar.service;

import racingcar.domain.RacingCar;
import racingcar.domain.RacingCarGameResult;
import racingcar.util.generator.impl.RacingCarGeneratorImpl;

import java.util.List;

public class RacingCarGame {
    private final RacingCarGeneratorImpl racingCarGenerator;

    public RacingCarGame(RacingCarGeneratorImpl raceCarGenerator) {
        this.racingCarGenerator = raceCarGenerator;

    }

    public RacingCarGameResult start(List<String> carNames, int attempt){
        List<RacingCar> racingCars = racingCarGenerator.generateRacingCars(carNames);

        return new RacingCarGameResult();
    }

}
