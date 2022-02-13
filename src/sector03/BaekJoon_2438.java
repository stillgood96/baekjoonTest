package sector03;

import java.util.Scanner;

import static sun.misc.Version.print;

public class BaekJoon_2438 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalCount = sc.nextInt();

        for(int i=1; i<=totalCount; i++) {

            for(int j = 0; j<i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
