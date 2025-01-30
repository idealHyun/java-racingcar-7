package racingcar.domain;

import racingcar.constant.ErrorMessage;

public class RacingCar {
    private static final String LINE_MARK = "-";
    private final String name;
    private int distance;

    public RacingCar(String name) {
        validate(name);
        this.name = name;
        this.distance = 0;
    }

    private void validate(String name) {
        if(name.length() >= 6 || name.isEmpty()) {
            throw new IllegalArgumentException(ErrorMessage.CAR_NAME_IS_OVER_MAX_LENGTH);
        }
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    public void forwardDistance(){
        distance+=1;
    }

    public String getState(){
        return String.format("%s : %s",name,LINE_MARK.repeat(distance));
    }
}
