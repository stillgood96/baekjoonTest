package sector03;

import java.util.Scanner;

public class BaekJoon_8393 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = 0;
        for(int i = 1; i <= a; i ++ ) {
            b += i;
        }
        System.out.println(b);
    }
}
