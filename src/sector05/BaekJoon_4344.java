package sector05;

import java.util.Scanner;

public class BaekJoon_4344 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int [] scoreArray;

        for(int i=0; i<count; i++) {

            int studentCount = sc.nextInt();
            scoreArray = new int[studentCount];

            double sum = 0;

            for(int j = 0 ; j< studentCount; j ++) {
                scoreArray[j] = sc.nextInt();
                sum += scoreArray[j];
            }

            double average = sum/studentCount;
            double averageStudent = 0;

            for(int j = 0; j < studentCount; j++) {
                if(scoreArray[j] > average){
                    averageStudent++;
                }
            }

            System.out.printf("%.3f%%\n",(averageStudent/studentCount)*100);

        }
    }
}
