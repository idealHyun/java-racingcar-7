package racingcar.domain;

public class RacingCar {
    private String name;
    private int distance;

    public RacingCar(String name) {
        validate(name);
        this.name = name;
        this.distance = 0;
    }

    private void validate(String name) {
        // TODO : name이 5자 초과할 경우 에러 발생
    }

    public void forwardDistance(){
        distance+=1;
    }

    public int getDistance() {
        return distance;
    }

}
