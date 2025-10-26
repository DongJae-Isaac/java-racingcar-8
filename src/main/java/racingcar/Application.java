package racingcar;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        InputHandler inputHandler = new InputHandler();
        String input = inputHandler.getCarInput();
        int round = inputHandler.getRoundsInput();

        Cars cars = new Cars(input);

        Racing racing = new Racing(cars, round);

        WinnerHandler winnerHandler = new WinnerHandler(cars);
        winnerHandler.findWinner();
        winnerHandler.getWinner();

    }
}
