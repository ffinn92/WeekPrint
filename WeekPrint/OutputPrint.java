public class OutputPrint {
    private int[][] calender = FirstDayCheck.calender;

    void print() {
        switch (InputCheckDays.week) {
            case 1:
                if (calender[0][0] == 0) {
                    System.out.println(InputCheckDays.week + "주차는" + " " + calender[0][FirstDayCheck.doomsDays] + "일부터 " + calender[1][0] + "일까지 입니다.");
                } else if (calender[0][0] != 0) {
                    System.out.println(InputCheckDays.week + "주차는" + " " + calender[0][FirstDayCheck.doomsDays] + "일부터 " + calender[0][0] + "일까지 입니다.");
                }
                break;
            case 2:
                if (calender[0][0] == 0) {
                    System.out.println(InputCheckDays.week + "주차는" + " " + calender[1][1] + "일부터 " + calender[2][0] + "일까지 입니다.");
                } else if (calender[0][0] != 0) {
                    System.out.println(InputCheckDays.week + "주차는" + " " + calender[0][1] + "일부터 " + calender[1][0] + "일까지 입니다.");
                }
                break;
            case 3:
                if (calender[0][0] == 0) {
                    System.out.println(InputCheckDays.week + "주차는" + " " + calender[2][1] + "일부터 " + calender[3][0] + "일까지 입니다.");
                } else if (calender[0][0] != 0) {
                    System.out.println(InputCheckDays.week + "주차는" + " " + calender[1][1] + "일부터 " + calender[2][0] + "일까지 입니다.");
                }
                break;
            case 4:
                if (calender[0][0] == 0) {
                    if (calender[4][0] == 0) {
                        System.out.println(InputCheckDays.week + "주차는" + " " + calender[3][1] + "일부터 " + calender[3][6] + "일까지 입니다.");
                    } else {
                        System.out.println(InputCheckDays.week + "주차는" + " " + calender[3][1] + "일부터 " + calender[4][0] + "일까지 입니다.");
                    }
                } else if (calender[0][0] != 0) {
                    System.out.println(InputCheckDays.week + "주차는" + " " + calender[2][1] + "일부터 " + calender[3][0] + "일까지 입니다.");
                }
                break;
            case 5:
                if (calender[0][0] == 0) {
                    if (calender[4][1] == 0) {
                        System.out.println(InputCheckDays.week + "주차는" + " " + "해당 월에 존재하지 않습니다.");
                    } else if (calender[5][0] == 0) {
                        System.out.println(InputCheckDays.week + "주차는" + " " + calender[4][1] + "일부터 " + calender[InsertDays.lastDayX][InsertDays.lastDayY] + "일까지 입니다.");
                    } else if (calender[5][1] != 0) {
                        System.out.println(InputCheckDays.week + "주차는" + " " + calender[4][1] + "일부터 " + calender[5][0] + "일까지 입니다.");
                    } else {
                        System.out.println(InputCheckDays.week + "주차는" + " " + calender[4][1] + "일부터 " + calender[5][0] + "일까지 입니다.");
                    }
                } else if (calender[0][0] != 0) {
                    if (calender[4][0] == 0) {
                        System.out.println(InputCheckDays.week + "주차는" + " " + calender[3][1] + "일부터 " + calender[3][6] + "일까지 입니다.");
                    } else {
                        System.out.println(InputCheckDays.week + "주차는" + " " + calender[3][1] + "일부터 " + calender[4][0] + "일까지 입니다.");
                    }
                }
                break;
            case 6:
                if (calender[0][0] == 0) {
                    if ((calender[5][0] == 0) || (calender[5][1] == 0)) {
                        System.out.println(InputCheckDays.week + "주차는" + " " + "해당 월에 존재하지 않습니다.");
                    } else {
                        System.out.println(InputCheckDays.week + "주차는" + " " + calender[5][1] + "일부터 " + calender[InsertDays.lastDayX][InsertDays.lastDayY] + "일까지 입니다.");
                    }
                } else if (calender[0][0] != 0) {
                    if (calender[4][1] != 0) {
                        System.out.println(InputCheckDays.week + "주차는" + " " + calender[4][1] + "일부터 " + calender[InsertDays.lastDayX][InsertDays.lastDayY] + "일까지 입니다.");
                    } else {
                        System.out.println(InputCheckDays.week + "주차는" + " " + "해당 월에 존재하지 않습니다.");
                    }
                }
                break;
        }
    }
}

