package sector03;

import java.util.Scanner;

public class BaekJoon_2525 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minutes = sc.nextInt();
        int timmer = sc.nextInt();

        int plusHour = (minutes + timmer) /60;
        int plusMinutes = (minutes + timmer) % 60;

        if(hour + plusHour >= 24) {
            hour = hour + plusHour -24;
        }else{
            hour += plusHour;
        }

        System.out.printf("%d %d", hour , plusMinutes);

    }
}
