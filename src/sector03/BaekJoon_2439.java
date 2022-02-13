package sector03;

import java.util.Scanner;

public class BaekJoon_2439 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        for(int i = 1; i<=count; i++) {

            for(int j = 1; j<= count-i; j++) {
                System.out.printf(" ");
            }

            for(int t = 0; t < i; t++) {
                System.out.printf("*");
            }


            System.out.println(" ");
        }
    }
}
