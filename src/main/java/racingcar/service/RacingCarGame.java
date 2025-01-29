package racingcar.service;

import racingcar.domain.RacingCar;
import racingcar.domain.RacingCarGameResult;
import racingcar.util.generator.impl.RacingCarGeneratorImpl;
import racingcar.util.generator.impl.RandomNumberGeneratorImpl;

import java.util.List;

public class RacingCarGame {
    private final RacingCarGeneratorImpl racingCarGenerator;
    private final RandomNumberGeneratorImpl randomNumberGenerator;

    public RacingCarGame(RacingCarGeneratorImpl raceCarGenerator, RandomNumberGeneratorImpl randomNumberGenerator) {
        this.racingCarGenerator = raceCarGenerator;
        this.randomNumberGenerator = randomNumberGenerator;
    }

    public RacingCarGameResult start(List<String> carNames, int attempt){
        List<RacingCar> racingCars = racingCarGenerator.generateRacingCars(carNames);
        racingCars.forEach(racingCar -> {
            if(randomNumberGenerator.generateRandomNumber() >=4){
                racingCar.forwardDistance();
            }
        });

        return new RacingCarGameResult();
    }

}
