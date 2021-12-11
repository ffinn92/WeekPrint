import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        int month = sc.nextInt();
        int week = sc.nextInt();

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





        int[][] calender = new int[5][7];
        int leapYear = 0;
        int monthDays = 0;

        int []nomalMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        int []leapMonth = {31,29,31,30,31,30,31,31,30,31,30,31};


        if ((year % 4 == 0) && (year % 100 != 0)) { //윤년일때
            leapYear = 1;
        } else if (year % 400 == 0) { //윤년일때
            leapYear = 1;
        } else { //평년일때
            leapYear = 0;
        }



    }

}
