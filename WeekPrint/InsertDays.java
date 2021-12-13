public class InsertDays {
    public static int lastDayX;
    public static int lastDayY;

    private int inputDays;
    private int[][] calender = FirstDayCheck.calender;


    void insertDays() {
        for (int i = 0; i < 1; i++) {
            for (int j = InputCheckDays.doomsDays; j < 7; j++) {
                inputDays++;
                calender[i][j] = inputDays;
            }
        }

        Loop1:
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                inputDays++;
                calender[i][j] = inputDays;
                if (inputDays == (FirstDayCheck.monthDaysArr[InputCheckDays.month - 1])) {
                    lastDayX = i;
                    lastDayY = j;
                    inputDays = 0;
                    break Loop1;
                }
            }
        }
    }
}
