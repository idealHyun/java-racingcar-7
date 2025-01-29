package racingcar.view;

import java.util.Arrays;
import java.util.List;

public class InputParser {
    private final String DELIMITER = ",";

    public List<String> parseCarNames(String carNames){
        return Arrays.asList(carNames.split(DELIMITER));
    }
}
