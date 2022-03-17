package sector05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BaekJoon_8958 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = Integer.parseInt(sc.nextLine());

        for(int i=0; i< count; i++) {

            int startScore = 0;
            int totalScore = 0;

            String val = sc.nextLine();

            for(int j = 0; j < val.length(); j++) {
                if(val.charAt(j) == 'O') {
                    startScore++;
                    totalScore += startScore;
                }else {
                    startScore = 0;
                }
            }
            System.out.println(totalScore);
        }
    }
}
