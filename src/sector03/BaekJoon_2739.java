package sector03;

import java.util.Scanner;

public class BaekJoon_2739 {


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int a = sc.nextInt();


        for(int i =1; i<10 ; i++) {
            int b = a*i;
            System.out.printf("%d * %d = %d\n" , a , i ,b);
        }
    }

}
