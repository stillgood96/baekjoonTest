package sector03;

import java.util.Scanner;

public class BaekJoon_11022 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();

        for(int i = 1; i<=total; i++) {
            int first = sc.nextInt();
            int second = sc.nextInt();
            int result = first + second;

            System.out.printf("Case #%d: %d + %d = %d\n", i, first,second, result);
        }
    }
}
