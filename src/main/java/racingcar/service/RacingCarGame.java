package racingcar.service;

import racingcar.domain.RacingCar;
import racingcar.domain.RacingCarGameResult;
import racingcar.util.generator.impl.RacingCarGeneratorImpl;
import racingcar.util.generator.impl.RandomNumberGeneratorImpl;

import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class RacingCarGame {
    private final RacingCarGeneratorImpl racingCarGenerator;
    private final RandomNumberGeneratorImpl randomNumberGenerator;

    public RacingCarGame(RacingCarGeneratorImpl raceCarGenerator, RandomNumberGeneratorImpl randomNumberGenerator) {
        this.racingCarGenerator = raceCarGenerator;
        this.randomNumberGenerator = randomNumberGenerator;
    }

    public RacingCarGameResult start(List<String> carNames, int attempt){
        List<RacingCar> racingCars = racingCarGenerator.generateRacingCars(carNames);

        // 게임 과정
        StringBuilder gameRecord = new StringBuilder();

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

        // 우승자 고르기
        int maxDistance = racingCars.stream().mapToInt(RacingCar::getDistance).max().getAsInt();

        List<RacingCar> winnerRacingCars = racingCars.stream()
                .filter(car -> car.getDistance() == maxDistance)
                .toList();

        String winnerNames = winnerRacingCars.stream().map(RacingCar::getName).collect(Collectors.joining(", "));

        return new RacingCarGameResult();
    }

}
