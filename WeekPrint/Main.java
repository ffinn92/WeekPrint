import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //설계

        //1. year 연도를 입력받는다.

        //2. 윤년인지 파악한다.

        //3. 둠스데이가 몇요일인지 계산한다.
        //3-1. yearTen = year % 100 // 10의 자리수
        //3-2. 알고 싶은 연도의 십의자리수를 12로 나누고 해당 몫과 나머지를 더한다 = (yearTen % 12) + (yearTen / 12)
        //3-3. 첫번째에서 나온 나머지를 4로 나눈 몫을 더해준다 = (yearTen % 12) + (yearTen / 12) + ((yearTen / 12) / 4)
        //3-4. 그 년도의 앵커데이를 더해준다 = (yearTen % 12) + (yearTen / 12) + ((yearTen / 12) / 4) + 앵커데이(2,0,5,3중 하나)
        // # 엥커데이 구하는 로직
        // yearTen % 4 = 0 -> 2
        // yearTen % 4 = 1 -> 0
        // yearTen % 4 = 2 -> 5
        // yearTen % 4 = 3 -> 3
        //3-5. 모든 더한 값을 7로 나눈 나머지가 둠스데이의 요일이다.
        // ((yearTen % 12) + (yearTen / 12) + ((yearTen / 12) / 4) + 앵커데이(2,0,5,3중 하나)) % 7 = 둠스데이 요일(0,1,2,3,4,5,6)

        //4. 입력한 해당월의 둠스데이 요일에서 각 월마다 로직을 구현하여 n월 1일 시작 배열좌표를 설정한다.
        //  ex) 입력월 : 7월 // 둠스데이 일요일(0) // 7월의 둠스데이는 7월 11일 // 7월 1일은 7월 11일 - 7일 = 7월 4일(일요일) - 3일 = 7월 1일은 목요일

        //5. 4번에서 정한 n월 1일 배열좌표 int[0][x]를 해당월 일자만큼 반복하여 일수를 넣어준다.
        //  ex) 위 4번의 예시대로 배열좌표가 int[0][4] (목요일)이면 7월은 총 31이므로
        //  int[][] calender = new int[5][7];
        //  firstDays = 4;
        //  monthDays = 31;
        //  int repeat = 1;
        //  int lastDays = 0;

        //  for(int i = 0 ; i < 5 ; i ++){
        //      for(int j = 4 ; j < 7 ; j++){
        //         calender[i][j] = repeat;
        //         repeat++;
        //          if(repeat == monthdays){
        //              lastDaysX = i
        //              lastDaysY = j
        //              break;
        //          }
        //      }
        //  }




        //6. swich case문으로 week이 1,2,3,4,5 각 주차입력일때의 값을 출력해준다.
        //1주차는 int[0][4] ~ int[1][0]
        //2주차는 int[1][1] ~ int[2][0]
        //3주차는 int[2][1] ~ int[3][0]
        //4주차는 int[3][1] ~ int[4][0]
        //5주차는 int[4][1] ~ int[lastDaysX][lastDaysY]

        //출력예시는 sout(week + "주차는" + " " + int[0][4] + "일부터" + int[1][0] "일까지 입니다.");



        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        int month = sc.nextInt();
        int week = sc.nextInt();

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
