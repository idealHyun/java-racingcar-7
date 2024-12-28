package racingcar.controller;

import racingcar.service.RacingCarGame;
import racingcar.view.InputView;
import racingcar.view.OutputView;

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

    }
}
