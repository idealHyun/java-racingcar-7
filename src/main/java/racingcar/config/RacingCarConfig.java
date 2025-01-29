package racingcar.config;

import racingcar.controller.RacingCarController;
import racingcar.service.RacingCarGame;
import racingcar.util.generator.impl.RacingCarGeneratorImpl;
import racingcar.view.InputParser;
import racingcar.view.InputValidator;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public abstract class RacingCarConfig {
    public static RacingCarController createController() {
        return new RacingCarController(creatGame(), creatInputView(), new OutputView());
    }

    private static InputView creatInputView(){
        return new InputView(new InputValidator(),new InputParser());
    }

    private static RacingCarGame creatGame(){
        return new RacingCarGame(new RacingCarGeneratorImpl());
    }
}
