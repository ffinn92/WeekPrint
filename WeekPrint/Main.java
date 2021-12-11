import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        int month = sc.nextInt();
        int week = sc.nextInt();

        int leapYear = 0;


        if ((year % 4 == 0) && (year % 100 != 0)) { //윤년일때
            leapYear = 1;
        } else if (year % 400 == 0) { //윤년일때
            leapYear = 1;
        } else { //평년일때
            leapYear = 0;
        }

    

    }

}
