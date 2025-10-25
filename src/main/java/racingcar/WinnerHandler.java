package racingcar;

import java.util.ArrayList;
import java.util.List;

public class WinnerHandler {
    private final List<Car> cars;
    private List<String> winner;
    Printer printer;

    public WinnerHandler(Cars cars){
        this.cars = cars.getCars();
        this.winner = new ArrayList<>();
        this.printer = new Printer();
    }


    public int getMax(List<Car> cars) {
        int max = 0;
        for (Car car : cars) {
            if(car.getPosition() > max){
                max = car.getPosition();
            }
        }
        return max;
    }

    public void findWinner() {
        int max = getMax(cars);

        for (Car car : cars) {
            if(car.getPosition() == max){
                this.winner.add(car.getName());
            }
        }
    }

    public void getWinner() {
        printer.printWinner(this.winner);
    }
}
