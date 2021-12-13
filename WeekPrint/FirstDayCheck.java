public class FirstDayCheck {
    public static int[][] calender = {
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0},
    };
    public static int[] monthDaysArr = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    private int month = InputCheckDays.month;
    private int leapYear = InputCheckDays.leapYear;
    private int doomsDays = InputCheckDays.doomsDays;

    InputCheckDays inputCheckDays = new InputCheckDays();

    void firstDaysCheck(){
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
