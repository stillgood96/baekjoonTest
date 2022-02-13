package sector03;

import java.util.Scanner;

public class BaekJoon_10871 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int listCount = sc.nextInt();
        int compareNum = sc.nextInt();
        int [] numArray = new int[listCount];

        for(int i =0; i< listCount; i++) {
            numArray[i] = sc.nextInt();
        }

        for(int i=0; i<listCount; i++){
            if(numArray[i] < compareNum) {
                System.out.printf(String.valueOf(numArray[i]) + " ");
            }
        }
    }
}
