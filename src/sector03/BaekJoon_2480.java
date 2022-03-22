package sector03;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] score = new int [3];
        int [] infoArray = new int[3];
        int top =0;
        Arrays.fill(score ,0);


        for(int i = 0; i< 3; i++) {
            score[i] = sc.nextInt();

            if(score[i] > top) {
                top = score[i];
            }

            switch (i) {
                case 1 :
                    infoArray[0] = (score[1] == score[0]) ?  score[1] : 0;
                    break;
                case 2 :
                    infoArray[1] = (score[2] == infoArray[0]) ? score[i] : 1;
                    if(infoArray[0] > 0 && infoArray[1] > 0) {

                        if(infoArray[0] == infoArray[1]) {
                            System.out.println(10000 +  (infoArray[1] * 1000));
                        }else {
                            System.out.println(1000 +  (infoArray[0] * 100));
                        }

                    }else{
                        System.out.println(top * 100);
                    }
                    break;
            }
        }




    }
}
