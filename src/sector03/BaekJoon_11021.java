package sector03;

import java.util.Scanner;

public class BaekJoon_11021 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        for(int i=1; i<=test; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.printf("Case #%d: %d\n", i , a+b);
        }
    }
}
