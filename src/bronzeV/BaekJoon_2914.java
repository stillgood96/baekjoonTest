package bronzeV;

import java.util.Scanner;

public class BaekJoon_2914 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int list = sc.nextInt();
        int avg = sc.nextInt();

        System.out.println( list *( avg -1) + 1);

    }
}
