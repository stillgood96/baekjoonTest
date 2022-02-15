package sector04;

import java.util.Scanner;

public class BaekJoon_10951 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        while(sc.hasNext() ) {
            int a = sc.nextInt();
            int b= sc.nextInt();
            if(a+b == 0)break;
            System.out.println(a+b);
        }
    }
}
