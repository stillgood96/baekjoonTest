package sector04;

import java.util.Scanner;

public class BaekJoon_1110 {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int changingNumber = firstNumber;
        int count=0; int a, b;

        while(true){
            a = changingNumber/10;
            b = changingNumber%10;

            changingNumber = b *10 + (a+b) % 10;
            count++;
            if(firstNumber == changingNumber) break;
        }

        System.out.println(count);
    }


    }
