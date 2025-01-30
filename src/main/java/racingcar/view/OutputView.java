package racingcar.view;

import racingcar.constant.OutputMessage;

public class OutputView {
    public void printCarNamesInputMessage() {
        System.out.println(OutputMessage.CAR_NAMES_INPUT_MESSAGE);
    }

    public void printAttemptInputMessage(){
        System.out.println(OutputMessage.ATTEMPT_INPUT_MESSAGE);
    }

    public void printGameRecord(String gameRecord){
        System.out.printf(OutputMessage.RESULT_MESSAGE,gameRecord);
    }

    public void printWinnerNames(String winnerNames){
        System.out.printf(OutputMessage.WINNER_MESSAGE, winnerNames);
    }
}
