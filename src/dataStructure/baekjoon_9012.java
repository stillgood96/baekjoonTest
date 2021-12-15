package dataStructure;

import java.util.Scanner;
import java.util.Stack;

// 괄호
public class baekjoon_9012 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int count =Integer.parseInt(sc.nextLine());

        boolean check = true;


        while(count-- > 0) {
            Stack<Character> stack =new Stack<>();
            String value = sc.nextLine();


            for( int i = 0; i < value.length(); i ++) {

                if(value.charAt(i) == '('){
                    stack.push(value.charAt(i));
                }else if(value.charAt(i) == ')') {
                    if(stack.empty()){
                        check=false;
                        break;
                    }
                    stack.pop();
                }
            }

            if(check && stack.size() == 0) {
                sb.append("YES").append("\n");
            }else {
                check = true;
                sb.append("NO").append("\n");
            }
        }

        System.out.println(sb);

    }
}
