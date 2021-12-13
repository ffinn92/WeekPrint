import java.util.Scanner;

public class InputCheckDays {
    Scanner sc = new Scanner(System.in);

    public static int month;
    public static int week;
    public static int leapYear;
    public static int doomsDays;

    private int year;

    void userInput() {
        System.out.println("연도를 입력하세요.");
        year = sc.nextInt();
        System.out.println("월를 입력하세요.");
        month = sc.nextInt();
        System.out.println("주차를 입력하세요.");
        week = sc.nextInt();
    }

    void leapYear() {
        if ((year % 4 == 0) && (year % 100 != 0)) { //윤년일때
            leapYear = 1;
        } else if (year % 400 == 0) { //윤년일때
            leapYear = 1;
        } else { //평년일때
            leapYear = 0;
        }
    }

    void doomsDays() {
        int yearTen = year % 100;
        int yearThounds = (year - yearTen) / 100;

        int ankerday = 0;
        if (yearThounds % 4 == 0) {
            ankerday = 2;
        } else if (yearThounds % 4 == 1) {
            ankerday = 0;
        } else if (yearThounds % 4 == 2) {
            ankerday = 5;
        } else if (yearThounds % 4 == 3) {
            ankerday = 3;
        }

        doomsDays = ((yearTen % 12) + (yearTen / 12) + ((yearTen % 12) / 4) + ankerday) % 7;
    }
}
