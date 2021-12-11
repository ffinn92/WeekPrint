import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("연도를 입력하세요.");
        int year = sc.nextInt();
        System.out.println("월를 입력하세요.");
        int month = sc.nextInt();
        System.out.println("주차를 입력하세요.");
        int week = sc.nextInt();

        //윤년, 평년 판단하기
        int leapYear = 0;
        if ((year % 4 == 0) && (year % 100 != 0)) { //윤년일때
            leapYear = 1;
        } else if (year % 400 == 0) { //윤년일때
            leapYear = 1;
        } else { //평년일때
            leapYear = 0;
        }

        //둠스데이의 요일 구하기
        int yearTen = year % 100;
        int yearThounds = year - yearTen;

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

        int doomsDays = ((yearTen % 12) + (yearTen / 12) + ((yearTen % 12) / 4) + ankerday) % 7;
        //0,1,2,3,4,5,6 = 일,월,화,수,목,금,토
        //3,3,3,3,3,3,3

        //1월일때 1일 시작요일 구하기(둠스데이는 1월3일 윤년일땐 1월4일
        int inputDays = 0;
        int[][] calender = {
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
        };

        int[] monthDaysArr = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        switch (month) {
            case 1:
                doomsDays = january(leapYear, doomsDays, monthDaysArr);
                break;
            case 2:
                doomsDays = february(leapYear, doomsDays, monthDaysArr);
                break;
            case 3:
                doomsDays = march(leapYear, doomsDays, monthDaysArr);
                break;
            case 4:
                doomsDays = april(leapYear, doomsDays, monthDaysArr);
                break;
            case 5:
                doomsDays = may(leapYear, doomsDays, monthDaysArr);
                break;
            case 6:
                doomsDays = june(leapYear, doomsDays, monthDaysArr);
                break;
            case 7:
                doomsDays = july(leapYear, doomsDays, monthDaysArr);
                break;
            case 8:
                doomsDays = august(leapYear, doomsDays, monthDaysArr);
                break;
            case 9:
                doomsDays = september(leapYear, doomsDays, monthDaysArr);
                break;
            case 10:
                doomsDays = october(leapYear, doomsDays, monthDaysArr);
                break;
            case 11:
                doomsDays = november(leapYear, doomsDays, monthDaysArr);
                break;
            case 12:
                doomsDays = december(leapYear, doomsDays, monthDaysArr);
                break;

        }


        int monthDays = monthDaysArr[month - 1];
        int lastDayX = 0;
        int lastDayY = 0;

        for (int i = 0; i < 1; i++) {
            for (int j = doomsDays; j < 7; j++) {
                inputDays++;
                calender[i][j] = inputDays;
            }
        }

        Loop1 :
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                inputDays++;
                calender[i][j] = inputDays;
                if (inputDays == monthDays) {
                    lastDayX = i;
                    lastDayY = j;
                    break Loop1;
                }
            }
        }

        switch (week) {
            case 1:
                System.out.println(week + "주차는" + " " + calender[0][doomsDays] + "일부터" + calender[1][0] + "일까지 입니다.");
                break;
            case 2:
                System.out.println(week + "주차는" + " " + calender[1][1] + "일부터" + calender[2][0] + "일까지 입니다.");
                break;
            case 3:
                System.out.println(week + "주차는" + " " + calender[2][1] + "일부터" + calender[3][0] + "일까지 입니다.");
                break;
            case 4:
                if (calender[4][0] == 0) {
                    System.out.println(week + "주차는" + " " + calender[3][1] + "일부터" + calender[3][6] + "일까지 입니다.");
                    break;
                } else {
                    System.out.println(week + "주차는" + " " + calender[3][1] + "일부터" + calender[4][0] + "일까지 입니다.");
                    break;
                }
            case 5:
                if (calender[4][1] == 0) {
                    System.out.println(week + "주차는" + " " + "해당 월에 존재하지 않습니다.");
                    break;
                } else {
                    System.out.println(week + "주차는" + " " + calender[4][1] + "일부터" + calender[lastDayX][lastDayY] + "일까지 입니다.");
                    break;
                }

        }
    }

    private static int january(int leapYear, int doomsDays, int[] monthDaysArr) {
        //0,1,2,3,4,5,6 = 일,월,화,수,목,금,토
        if (leapYear == 0) { //1월 3일 -2
            monthDaysArr[1] = 28;
            switch (doomsDays) {
                case 0:
                    doomsDays = 5;
                    break;
                case 1:
                    doomsDays = 6;
                    break;
                case 2:
                    doomsDays = 0;
                    break;
                case 3:
                    doomsDays = 1;
                    break;
                case 4:
                    doomsDays = 2;
                    break;
                case 5:
                    doomsDays = 3;
                    break;
                case 6:
                    doomsDays = 4;
                    break;
            }
        } else { //1월 4일 -3
            monthDaysArr[1] = 29;
            switch (doomsDays) {
                case 0:
                    doomsDays = 4;
                    break;
                case 1:
                    doomsDays = 5;
                    break;
                case 2:
                    doomsDays = 6;
                    break;
                case 3:
                    doomsDays = 0;
                    break;
                case 4:
                    doomsDays = 1;
                    break;
                case 5:
                    doomsDays = 2;
                    break;
                case 6:
                    doomsDays = 3;
                    break;
            }
        }
        return doomsDays;
    }

    private static int february(int leapYear, int doomsDays, int[] monthDaysArr) {
        //0,1,2,3,4,5,6 = 일,월,화,수,목,금,토
        if (leapYear == 0) { //2월 7일 -6
            monthDaysArr[1] = 28;
            switch (doomsDays) {
                case 0:
                    doomsDays = 1;
                    break;
                case 1:
                    doomsDays = 2;
                    break;
                case 2:
                    doomsDays = 3;
                    break;
                case 3:
                    doomsDays = 4;
                    break;
                case 4:
                    doomsDays = 5;
                    break;
                case 5:
                    doomsDays = 6;
                    break;
                case 6:
                    doomsDays = 0;
                    break;
            }
        } else { //2월 8일 -7
            monthDaysArr[1] = 29;
            switch (doomsDays) {
                case 0:
                    doomsDays = 0;
                    break;
                case 1:
                    doomsDays = 1;
                    break;
                case 2:
                    doomsDays = 2;
                    break;
                case 3:
                    doomsDays = 3;
                    break;
                case 4:
                    doomsDays = 4;
                    break;
                case 5:
                    doomsDays = 5;
                    break;
                case 6:
                    doomsDays = 6;
                    break;
            }
        }
        return doomsDays;
    }

    private static int march(int leapYear, int doomsDays, int[] monthDaysArr) {
        //0,1,2,3,4,5,6 = 일,월,화,수,목,금,토
        if (leapYear == 0) { //3월 7일 -6
            monthDaysArr[1] = 28;
            switch (doomsDays) {
                case 0:
                    doomsDays = 1;
                    break;
                case 1:
                    doomsDays = 2;
                    break;
                case 2:
                    doomsDays = 3;
                    break;
                case 3:
                    doomsDays = 4;
                    break;
                case 4:
                    doomsDays = 5;
                    break;
                case 5:
                    doomsDays = 6;
                    break;
                case 6:
                    doomsDays = 0;
                    break;
            }
        }
        return doomsDays;
    }

    private static int april(int leapYear, int doomsDays, int[] monthDaysArr) {
        //0,1,2,3,4,5,6 = 일,월,화,수,목,금,토
        if (leapYear == 0) { //4월 4일 -3
            monthDaysArr[1] = 28;
            switch (doomsDays) {
                case 0:
                    doomsDays = 4;
                    break;
                case 1:
                    doomsDays = 5;
                    break;
                case 2:
                    doomsDays = 6;
                    break;
                case 3:
                    doomsDays = 0;
                    break;
                case 4:
                    doomsDays = 1;
                    break;
                case 5:
                    doomsDays = 2;
                    break;
                case 6:
                    doomsDays = 3;
                    break;
            }
        }
        return doomsDays;
    }

    private static int may(int leapYear, int doomsDays, int[] monthDaysArr) {
        //0,1,2,3,4,5,6 = 일,월,화,수,목,금,토
        if (leapYear == 0) { //5월 9일 -8(-7 + -1)
            monthDaysArr[1] = 28;
            switch (doomsDays) {
                case 0:
                    doomsDays = 6;
                    break;
                case 1:
                    doomsDays = 0;
                    break;
                case 2:
                    doomsDays = 1;
                    break;
                case 3:
                    doomsDays = 2;
                    break;
                case 4:
                    doomsDays = 3;
                    break;
                case 5:
                    doomsDays = 4;
                    break;
                case 6:
                    doomsDays = 5;
                    break;
            }
        }
        return doomsDays;
    }

    private static int june(int leapYear, int doomsDays, int[] monthDaysArr) {
        //0,1,2,3,4,5,6 = 일,월,화,수,목,금,토
        if (leapYear == 0) { //6월 6일 -5
            monthDaysArr[1] = 28;
            switch (doomsDays) {
                case 0:
                    doomsDays = 2;
                    break;
                case 1:
                    doomsDays = 3;
                    break;
                case 2:
                    doomsDays = 4;
                    break;
                case 3:
                    doomsDays = 5;
                    break;
                case 4:
                    doomsDays = 6;
                    break;
                case 5:
                    doomsDays = 0;
                    break;
                case 6:
                    doomsDays = 1;
                    break;
            }
        }
        return doomsDays;
    }

    private static int july(int leapYear, int doomsDays, int[] monthDaysArr) {
        //0,1,2,3,4,5,6 = 일,월,화,수,목,금,토
        if (leapYear == 0) { //7월 11일 -10 ( -7 + -3 )
            monthDaysArr[1] = 28;
            switch (doomsDays) {
                case 0:
                    doomsDays = 4;
                    break;
                case 1:
                    doomsDays = 5;
                    break;
                case 2:
                    doomsDays = 6;
                    break;
                case 3:
                    doomsDays = 0;
                    break;
                case 4:
                    doomsDays = 1;
                    break;
                case 5:
                    doomsDays = 2;
                    break;
                case 6:
                    doomsDays = 3;
                    break;
            }
        }
        return doomsDays;
    }

    private static int august(int leapYear, int doomsDays, int[] monthDaysArr) {
        //0,1,2,3,4,5,6 = 일,월,화,수,목,금,토
        if (leapYear == 0) { //8월 8일 -7 ( -7 + -1 )
            monthDaysArr[1] = 28;
            switch (doomsDays) {
                case 0:
                    doomsDays = 6;
                    break;
                case 1:
                    doomsDays = 0;
                    break;
                case 2:
                    doomsDays = 1;
                    break;
                case 3:
                    doomsDays = 2;
                    break;
                case 4:
                    doomsDays = 3;
                    break;
                case 5:
                    doomsDays = 4;
                    break;
                case 6:
                    doomsDays = 5;
                    break;
            }
        }
        return doomsDays;
    }

    private static int september(int leapYear, int doomsDays, int[] monthDaysArr) {
        //0,1,2,3,4,5,6 = 일,월,화,수,목,금,토
        if (leapYear == 0) { //9월 5일 -4
            monthDaysArr[1] = 28;
            switch (doomsDays) {
                case 0:
                    doomsDays = 3;
                    break;
                case 1:
                    doomsDays = 4;
                    break;
                case 2:
                    doomsDays = 5;
                    break;
                case 3:
                    doomsDays = 6;
                    break;
                case 4:
                    doomsDays = 0;
                    break;
                case 5:
                    doomsDays = 1;
                    break;
                case 6:
                    doomsDays = 2;
                    break;
            }
        }
        return doomsDays;
    }

    private static int october(int leapYear, int doomsDays, int[] monthDaysArr) {
        //0,1,2,3,4,5,6 = 일,월,화,수,목,금,토
        if (leapYear == 0) { //10월 10일 -9(-7 + -2)
            monthDaysArr[1] = 28;
            switch (doomsDays) {
                case 0:
                    doomsDays = 5;
                    break;
                case 1:
                    doomsDays = 6;
                    break;
                case 2:
                    doomsDays = 0;
                    break;
                case 3:
                    doomsDays = 1;
                    break;
                case 4:
                    doomsDays = 2;
                    break;
                case 5:
                    doomsDays = 3;
                    break;
                case 6:
                    doomsDays = 4;
                    break;
            }
        }
        return doomsDays;
    }

    private static int november(int leapYear, int doomsDays, int[] monthDaysArr) {
        //0,1,2,3,4,5,6 = 일,월,화,수,목,금,토
        if (leapYear == 0) { //11월 7일 -6
            monthDaysArr[1] = 28;
            switch (doomsDays) {
                case 0:
                    doomsDays = 1;
                    break;
                case 1:
                    doomsDays = 2;
                    break;
                case 2:
                    doomsDays = 3;
                    break;
                case 3:
                    doomsDays = 4;
                    break;
                case 4:
                    doomsDays = 5;
                    break;
                case 5:
                    doomsDays = 6;
                    break;
                case 6:
                    doomsDays = 0;
                    break;
            }
        }
        return doomsDays;
    }

    private static int december(int leapYear, int doomsDays, int[] monthDaysArr) {
        //0,1,2,3,4,5,6 = 일,월,화,수,목,금,토
        if (leapYear == 0) { //12월 12일 -11 ( -7 + -4 )
            monthDaysArr[1] = 28;
            switch (doomsDays) {
                case 0:
                    doomsDays = 3;
                    break;
                case 1:
                    doomsDays = 4;
                    break;
                case 2:
                    doomsDays = 5;
                    break;
                case 3:
                    doomsDays = 6;
                    break;
                case 4:
                    doomsDays = 0;
                    break;
                case 5:
                    doomsDays = 1;
                    break;
                case 6:
                    doomsDays = 2;
                    break;
            }
        }
        return doomsDays;
    }


}


