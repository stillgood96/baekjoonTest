package sector05;

import java.util.Scanner;

public class BaekJoon_10818 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int min =1000001;
        int max= -1000001;

        for(int i = 0; i < count ; i++) {
            int num = sc.nextInt();
            if(num < min) min = num;
            if(num > max) max = num;
        }
        System.out.println(min + " " + max);
        System.out.printf("%d %d", min , max); // 대체 이건 왜안되는거임 ?


    }
}
