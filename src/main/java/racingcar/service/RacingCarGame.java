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
        StringBuilder gameRecord = new StringBuilder();

        List<RacingCar> racingCars = racingCarGenerator.generateRacingCars(carNames);

        for(int i = 0; i < attempt; i++){
            racingCars.forEach(racingCar -> {
                if(randomNumberGenerator.generateRandomNumber() >=4){
                    racingCar.forwardDistance();
                }
                gameRecord.append(racingCar.getState());
                gameRecord.append('\n');
            });
            gameRecord.append('\n');
        }

        return new RacingCarGameResult();
    }

}
