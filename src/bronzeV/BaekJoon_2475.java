package bronzeV;

import java.util.Scanner;

public class BaekJoon_2475 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt =0;
        for(int i =0; i<5; i++) {
            cnt += Math.pow(sc.nextInt(),2);
        }
        System.out.println(cnt%10);
    }
}
