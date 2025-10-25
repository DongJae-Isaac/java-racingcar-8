package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Racing {
    private final Cars cars;
    Printer printer = new Printer();
    Validator validator = new Validator();

    public Racing(Cars cars, int round) {
        this.cars = cars;
        validator.validateRound(round);
        race(round);
    }

    public void race(int round) {
        printer.printResultMessage();
        for(int i = 0; i < round; i++) {
            moveAllCars();
        }
    }

    public void moveAllCars() {
        for(Car car : cars.getCars()) {
            int random = Randoms.pickNumberInRange(0, 9);
            car.moveCar(random);
            // 각 라운드가 끝난 후 출력
            printer.printRounds(car.getName(), car.getPosition());
        }
        printer.printBlankedLine();
    }
}
