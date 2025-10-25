package racingcar;

import java.util.List;

public class Printer {
    public void printRounds(String name, int position) {
        String parsedPosition = parsePosition(position);
        System.out.println(name + " : " + parsedPosition);
    }

    public void printResultMessage() {
        System.out.println("실행 결과");
    }

    public String parsePosition(int position) {
        String distance = "-";
        return distance.repeat(position);
    }

    // 각 라운드 끝나고 빈 줄 출력
    public void printBlankedLine() {
        System.out.println();
    }

    public void printWinner(List<String> winner) {
        System.out.println("최종 우승자 : " + String.join(", ", winner));
    }
}
