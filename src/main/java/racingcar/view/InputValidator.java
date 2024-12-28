package racingcar.view;

import racingcar.constant.ErrorMessage;

import java.util.HashSet;
import java.util.Set;

public class InputValidator {
    private final String DELIMITER = ",";

    public void validateCarNamesFormat(String carNames) {
        validateNullValue(carNames);

        String[] names = carNames.split(DELIMITER);
        Set<String> hashSet = new HashSet<>();

        for(String name : names) {
            validateCarName(name);
            validateDuplicateName(hashSet,name);
            hashSet.add(name);
        }
    }

    private void validateNullValue(String input){
        if(input.trim().isEmpty()) {
            throw new IllegalArgumentException(ErrorMessage.NULL_ERROR_MESSAGE);
        }
    }

    private void validateCarName(String carName){
        if(carName.isEmpty()) {
            throw new IllegalArgumentException(ErrorMessage.CAR_NAME_IS_NULL_ERROR_MESSAGE);
        }
    }

    private void validateDuplicateName(Set<String> hashSet, String carName){
        if(hashSet.contains(carName)) {
            throw new IllegalArgumentException(ErrorMessage.CAR_NAME_IS_DUPLICATE_ERROR_MESSAGE);
        }
    }
}
