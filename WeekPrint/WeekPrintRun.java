import java.util.Scanner;

public class WeekPrintRun {
    FirstDayCheck firstDayCheck = new FirstDayCheck();
    InsertDays insertDays = new InsertDays();
    OutputPrint outputPrint = new OutputPrint();
    InputCheckDays inputCheckDays = new InputCheckDays();

    Scanner sc = new Scanner(System.in);

    void run(){
        inputCheckDays.userInput();
        inputCheckDays.leapYear();
        inputCheckDays.doomsDays();
        firstDayCheck.firstDaysCheck();
        insertDays.insertDays();
        outputPrint.print();
        reRun();
    }

    void reRun(){
        System.out.println("\n"+"다시 찾아보시겠습니까? Y/N");
        String yesOrNo = sc.next();

        if(yesOrNo.equals("Y")){
            run();
        }else if(yesOrNo.equals("N")){
            System.exit(0);
        }
    }
}
