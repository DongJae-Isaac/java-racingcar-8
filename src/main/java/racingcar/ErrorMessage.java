package racingcar;

public enum ErrorMessage {
    INVALID_CAR_NAME_LENGTH("자동차 이름은 5글자까지만 가능합니다"),
    EMPTY_CAR_NAME("자동차 이름은 비어있을 수 없습니다"),
    INVALID_ROUND_NUMBER("라운드는 반드시 양수이어야 합니다"),
    ;

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
