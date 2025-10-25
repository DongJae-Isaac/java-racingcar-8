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
