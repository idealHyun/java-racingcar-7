package racingcar.controller;

import racingcar.domain.RacingCarGameResult;
import racingcar.service.RacingCarGame;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class RacingCarController {
    private final InputView inputView;
    private final OutputView outputView;
    private final RacingCarGame racingCarGame;

    public RacingCarController(final RacingCarGame racingCarGame, final InputView inputView, final OutputView outputView){
        this.racingCarGame = racingCarGame;
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void run(){
        outputView.printCarNamesInputMessage();
        List<String> parsedCarNames = inputView.getInputCarNames();

        outputView.printAttemptInputMessage();
        int attempt = inputView.getInputAttempt();

        RacingCarGameResult gameResult = racingCarGame.start(parsedCarNames,attempt);

        // 게임 실행 결과 출력
        // 게임 승자 출력
    }
}
