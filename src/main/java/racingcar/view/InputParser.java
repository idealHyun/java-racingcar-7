package racingcar.view;

public class InputParser {
    private final String DELIMITER = ",";

    public String[] parseCarNames(String carNames){
        return carNames.split(DELIMITER);
    }
}
