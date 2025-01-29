package racingcar.util.generator.impl;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.util.generator.RandomNumberGenerator;

public class RandomNumberGeneratorImpl implements RandomNumberGenerator {
    @Override
    public int generateRandomNumber() {
        return Randoms.pickNumberInRange(0,9);
    }
}
