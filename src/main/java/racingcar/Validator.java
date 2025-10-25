package racingcar;

public class Validator {

    public void validateRound(int round) {
        if(round < 0) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_ROUND_NUMBER.getMessage());
        }
    }

    public void validateCarName(String car) {
        validateCarNameLength(car);
        validateCarIsEmpty(car);
    }

    public void validateCarNameLength(String car) {
        if(car.length() > 5) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_CAR_NAME_LENGTH.getMessage());
        }
    }

    public void validateCarIsEmpty(String car) {
        if(car.isEmpty()){
            throw new IllegalArgumentException(ErrorMessage.EMPTY_CAR_NAME.getMessage());
        }
    }
}
