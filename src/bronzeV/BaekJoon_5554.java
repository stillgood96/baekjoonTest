package bronzeV;

import java.util.Scanner;

public class BaekJoon_5554 {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);


        int sec = sc.nextInt();
        sec += sc.nextInt();
        sec += sc.nextInt();
        sec += sc.nextInt();

        System.out.println(sec/60);
        System.out.println(sec%60);

    }
}
