package sector05;

import java.util.Scanner;

public class BaekJoon_1546 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        double [] score = new double [count];
        double maxScore = 0;

        for(int i = 0; i<count; i++) {
            score[i] = sc.nextInt();

            if(maxScore < score[i]){
                maxScore = score[i];
            }
        }

        double [] average = new double[count];
        double sum = 0;
        for(int i = 0; i < count; i++) {
            average[i] = score[i]/maxScore*100;
            sum += average[i];
        }

        System.out.println(sum/count);
    }
}
