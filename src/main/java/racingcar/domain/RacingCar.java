package racingcar.domain;

import racingcar.constant.ErrorMessage;

public class RacingCar {
    private String name;
    private int distance;

    public RacingCar(String name) {
        validate(name);
        this.name = name;
        this.distance = 0;
    }

    private void validate(String name) {
        if(name.length() >= 6 || name.isEmpty()) {
            throw new IllegalArgumentException(ErrorMessage.CAR_NAME_LENGTH_ERROR_MESSAGE);
        }
    }

    public void forwardDistance(){
        distance+=1;
    }

    public int getDistance() {
        return distance;
    }

}
