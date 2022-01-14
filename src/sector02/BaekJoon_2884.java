package sector02;

import javax.print.attribute.IntegerSyntax;
import java.util.Scanner;

public class BaekJoon_2884 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();



        if(b-45 <0 ) {
            if(a  == 0) {
                a = 24;
            }
            System.out.printf("%d %d", a-1 , 60 + (b-45));
        }else {
            System.out.printf("%d %d", a , b-45);
        }

    }
}
