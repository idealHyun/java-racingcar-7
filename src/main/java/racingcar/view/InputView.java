package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class InputView {
    private final InputValidator inputValidator;
    private final InputParser inputParser;

    public InputView(InputValidator inputValidator, InputParser inputParser){
        this.inputValidator = inputValidator;
        this.inputParser = inputParser;
    }

    public List<String> getInputCarNames(){
        String carNames = Console.readLine();
        inputValidator.validateCarNamesFormat(carNames);
        return inputParser.parseCarNames(carNames);
    }

    public int getInputAttempt(){
        String attempt = Console.readLine();
        inputValidator.validateNumberType(attempt);
        return Integer.parseInt(attempt);
    }
}
