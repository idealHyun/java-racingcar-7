package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private final InputValidator inputValidator;
    private final InputParser inputParser;

    public InputView(InputValidator inputValidator, InputParser inputParser){
        this.inputValidator = inputValidator;
        this.inputParser = inputParser;
    }

    public String[] getInputCarNames(){
        String carNames = Console.readLine();
        inputValidator.validateCarNamesFormat(carNames);
        return inputParser.parseCarNames(carNames);
    }

    public int getInputAttempt(){
        String attempt = Console.readLine();
        // TODO: inputValidator 로 유효성 검증
        return Integer.parseInt(attempt);
    }
}
