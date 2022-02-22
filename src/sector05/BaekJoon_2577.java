package sector05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class BaekJoon_2577 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String result = Integer.toString(a*b*c);

        char [] numRange = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};


        for(int i =0; i<numRange.length; i++) {
            int count = 0;

            for(int j =0; j<result.length(); j++) {
                if(numRange[i] == result.charAt(j)) {
                    count++;
                }
            }
            System.out.println(count);
        }



    }

}
