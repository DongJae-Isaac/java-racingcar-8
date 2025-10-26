package racingcar;
import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> cars;
    private static final Validator validator = new Validator();

    public Cars(String input) {
        String removedBlank = removeBlank(input);
        String[] name = removedBlank.split(",");
        this.cars =  createCars(name);
    }

    /**
     * 쉼표를 기준으로 분리된 자동차를 Car타입의 리스트로 변환
     * @param names 쉼표를 기준으로 분리된 자동차 이름 배열
     * @return Car클래스 타입을 가지는 리스트
     */
    public List<Car> createCars(String[] names) {
        List<Car> carsList = new ArrayList<>();
        for(String name : names) {
            validator.validateCarName(name);
            carsList.add(new Car(name));
        }
        return carsList;
    }

    // 공백 제거
    private String removeBlank(String input) {
        return input.replace(" ", "");
    }

    public List<Car> getCars() {
        return cars;
    }

}
