package bronz5;

import java.util.Scanner;

public class baekjoon_1550 {
    // 16진수 값을 입력받고
    // 입력받은 값을 10진수로 출력하라.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        System.out.println(Integer.parseInt(input, 16));

    }
}
