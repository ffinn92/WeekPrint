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
    public static int doomsDays;

    void firstDaysCheck() {
        switch (InputCheckDays.month) {
            case 1:
                doomsDays = january(InputCheckDays.leapYear, InputCheckDays.doomsDays, monthDaysArr);
                break;
            case 2:
                doomsDays = february(InputCheckDays.leapYear, InputCheckDays.doomsDays, monthDaysArr);
                break;
            case 3:
                doomsDays = march(InputCheckDays.leapYear, InputCheckDays.doomsDays, monthDaysArr);
                break;
            case 4:
                doomsDays = april(InputCheckDays.leapYear, InputCheckDays.doomsDays, monthDaysArr);
                break;
            case 5:
                doomsDays = may(InputCheckDays.leapYear, InputCheckDays.doomsDays, monthDaysArr);
                break;
            case 6:
                doomsDays = june(InputCheckDays.leapYear, InputCheckDays.doomsDays, monthDaysArr);
                break;
            case 7:
                doomsDays = july(InputCheckDays.leapYear, InputCheckDays.doomsDays, monthDaysArr);
                break;
            case 8:
                doomsDays = august(InputCheckDays.leapYear, InputCheckDays.doomsDays, monthDaysArr);
                break;
            case 9:
                doomsDays = september(InputCheckDays.leapYear, InputCheckDays.doomsDays, monthDaysArr);
                break;
            case 10:
                doomsDays = october(InputCheckDays.leapYear, InputCheckDays.doomsDays, monthDaysArr);
                break;
            case 11:
                doomsDays = november(InputCheckDays.leapYear, InputCheckDays.doomsDays, monthDaysArr);
                break;
            case 12:
                doomsDays = december(InputCheckDays.leapYear, InputCheckDays.doomsDays, monthDaysArr);
                break;

        }
    }

    private static int january(int leapYear, int doomsDays, int[] monthDaysArr) {
        //0,1,2,3,4,5,6 = ???,???,???,???,???,???,???
        if (leapYear == 0) { //1??? 3??? -2
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
        } else { //1??? 4??? -3
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
        //0,1,2,3,4,5,6 = ???,???,???,???,???,???,???
        if (leapYear == 0) { //2??? 7??? -6
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
        } else { //2??? 8??? -7
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
        //0,1,2,3,4,5,6 = ???,???,???,???,???,???,???
        if (leapYear == 0) { //3??? 7??? -6
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
        }else if(leapYear == 1) { //3??? 7??? -6
            monthDaysArr[1] = 29;
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
        //0,1,2,3,4,5,6 = ???,???,???,???,???,???,???
        if (leapYear == 0) { //4??? 4??? -3
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
        }else if(leapYear == 1) { //4??? 4??? -3
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

    private static int may(int leapYear, int doomsDays, int[] monthDaysArr) {
        //0,1,2,3,4,5,6 = ???,???,???,???,???,???,???
        if (leapYear == 0) { //5??? 9??? -8(-7 + -1)
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
        }else if(leapYear == 1) { //5??? 9??? -8(-7 + -1)
            monthDaysArr[1] = 29;
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
        //0,1,2,3,4,5,6 = ???,???,???,???,???,???,???
        if (leapYear == 0) { //6??? 6??? -5
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
        }else if(leapYear == 1) { //6??? 6??? -5
            monthDaysArr[1] = 29;
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
        //0,1,2,3,4,5,6 = ???,???,???,???,???,???,???
        if (leapYear == 0) { //7??? 11??? -10 ( -7 + -3 )
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
        }else if (leapYear == 1) { //7??? 11??? -10 ( -7 + -3 )
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

    private static int august(int leapYear, int doomsDays, int[] monthDaysArr) {
        //0,1,2,3,4,5,6 = ???,???,???,???,???,???,???
        if (leapYear == 0) { //8??? 8??? -7 ( -7 )
            monthDaysArr[1] = 28;
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
        }else if(leapYear == 1) { //8??? 8??? -7 ( -7 )
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

    private static int september(int leapYear, int doomsDays, int[] monthDaysArr) {
        //0,1,2,3,4,5,6 = ???,???,???,???,???,???,???
        if (leapYear == 0) { //9??? 5??? -4
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
        }else if(leapYear == 1) { //9??? 5??? -4
            monthDaysArr[1] = 29;
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
        //0,1,2,3,4,5,6 = ???,???,???,???,???,???,???
        if (leapYear == 0) { //10??? 10??? -9(-7 + -2)
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
        } else if (leapYear == 1) {
            monthDaysArr[1] = 29;
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
        //0,1,2,3,4,5,6 = ???,???,???,???,???,???,???
        if (leapYear == 0) { //11??? 7??? -6
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
        } else if (leapYear == 1) { //11??? 7??? -6
            monthDaysArr[1] = 29;
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
        //0,1,2,3,4,5,6 = ???,???,???,???,???,???,???
        if (leapYear == 0) { //12??? 12??? -11 ( -7 + -4 )
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
        } else if (leapYear == 1) { //12??? 12??? -11 ( -7 + -4 )
            monthDaysArr[1] = 29;
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
