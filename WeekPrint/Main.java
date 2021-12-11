import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        int month = sc.nextInt();
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
        int ankerday = 0;
        if(yearTen % 4 ==0){
            ankerday = 2;
        }else if(yearTen % 4 == 1){
            ankerday = 0;
        }else if(yearTen % 4 == 2){
            ankerday = 5;
        }else if(yearTen % 4 == 3){
            ankerday = 3;
        }
        int doomsDays = ((yearTen % 12) + (yearTen / 12) + ((yearTen / 12) / 4) + ankerday) % 7;
        //0,1,2,3,4,5,6 = 일,월,화,수,목,금,토

        //1월일때 1일 시작요일 구하기(둠스데이는 1월3일 윤년일땐 1월4일
        int[][] calender = {
                {0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0}
        };

        int []monthDaysArr = {31,0,31,30,31,30,31,31,30,31,30,31};
        if(leapYear == 0){ //1월 3일
            monthDaysArr[1] = 28;
            doomsDays -= 2;
        }else{ //1월 4일
            monthDaysArr[1] = 29;
            doomsDays -= 3;
        }

        int monthDays = monthDaysArr[month];





    }

}
