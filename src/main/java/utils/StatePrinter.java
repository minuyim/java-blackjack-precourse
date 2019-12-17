package utils;

import java.util.List;

public class StatePrinter {
    public static void printInitDrawMessage(List<String> strings) {
        System.out.println("\n딜러와 " + String.join(", ", strings + "에게 각 2장의 카드를 나누어 주었습니다."));
    }

    public static void printDealerBlackJack() {
        System.out.println("\n딜러가 블랙잭입니다!");
    }

    public static void printEarningMessage() {
        System.out.println("\n## 최종수익");
    }

    public static void printEarning(String name, double earning) {
        System.out.println(name + " : " + earning);
    }

    public static void printDealerDrawMessage() {
        System.out.println("\n딜러의 점수가 16이하라 한 장의 카드를 더 받았습니다.");
    }
}
