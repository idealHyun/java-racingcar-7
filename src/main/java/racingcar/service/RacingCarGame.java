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

        String gameRecord = playGame(racingCars,attempt);
        String winnerNames = selectWinnerRacingCars(racingCars);

        return new RacingCarGameResult(gameRecord,winnerNames);
    }

    private String playGame(List<RacingCar> racingCars, int attempt){
        StringBuilder gameRecord = new StringBuilder();
        for(int i = 0; i < attempt; i++){
            racingCars.forEach(racingCar -> {
                attemptMoveForward(racingCar);
                gameRecord.append(recordGameState(racingCar)).append('\n');
            });
            gameRecord.append('\n');
        }

        return gameRecord.toString();
    }

    private void attemptMoveForward(RacingCar racingCar){
        if(randomNumberGenerator.generateRandomNumber() >=4){
            racingCar.forwardDistance();
        }
    }

    private String recordGameState(RacingCar racingCar){
        return racingCar.getState();
    }

    private String selectWinnerRacingCars(List<RacingCar> racingCars){
        int maxDistance = racingCars.stream().mapToInt(RacingCar::getDistance).max().getAsInt();

        List<RacingCar> winnerRacingCars = racingCars.stream()
                .filter(car -> car.getDistance() == maxDistance)
                .toList();

        return extractNamesForRacingCars(winnerRacingCars);
    }

    private String extractNamesForRacingCars(List<RacingCar> racingCars){
        return racingCars.stream().map(RacingCar::getName).collect(Collectors.joining(", "));
    }

}
