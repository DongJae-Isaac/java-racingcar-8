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

    /**
     * 자동차 객체마다 랜덤 숫자를 뽑아서 자동차를 움직인다
     * 각 라운드가 끝날때마다 자동차의 이름과 이동한 거리를 출력한다
     */
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
