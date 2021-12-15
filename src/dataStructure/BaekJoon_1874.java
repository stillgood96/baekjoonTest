package dataStructure;

import java.util.Scanner;
import java.util.Stack;

public class BaekJoon_1874 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        int count = sc.nextInt();

        int max = 0;

        while(count-- >0) {

            int val = sc.nextInt();

            if(val > max) {

                for(int i = max +1; i<=val; i++) {
                    stack.push(i);
                    sb.append('+').append('\n');
                }
                max = val;
            }else if(stack.peek() != val) {
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append('-').append('\n');

        }
        System.out.println(sb);

    }
}
