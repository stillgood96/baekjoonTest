package sector05;

import java.util.Scanner;

public class BaekJoon_2562 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int maxNum = 0;
        for(int i = 1; i <= 9; i++) {
            int nowNum = sc.nextInt();

            if(i == 0) {
                maxNum = nowNum;
            }
            if(i > 0 && maxNum < nowNum){
                maxNum = nowNum ;
                count = i;
            }
        }
        System.out.println(maxNum);
        System.out.println(count);

    }
}
