package sector01;

import java.util.Scanner;

public class BaekJoon_2588 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        for(int i = b.length() ; i> 0 ;) {
            --i;
            char test = b.charAt(i);
            String test2 = "" + test;
            System.out.println(Integer.parseInt(a) * Integer.parseInt(test2));
        }
        System.out.println(Integer.parseInt(a) * Integer.parseInt(b));
    }
}
