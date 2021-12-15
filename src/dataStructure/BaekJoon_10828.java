package dataStructure;

import java.util.Scanner;

public class BaekJoon_10828 {

    static int [] stack;
    static int size = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        stack = new int[n];

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i< n; i++) {

            String inputValue = sc.next();
            switch (inputValue) {
                case "push" :
                    push(sc.nextInt());
                    break;
                case "pop" :
                    sb.append(pop()).append('\n');
                    break;
                case "size" :
                    sb.append(size()).append('\n');
                    break;
                case "empty" :
                    sb.append(empty()).append('\n');
                    break;
                case "top" :
                    sb.append(top()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }


    static void push(int x) {
        stack[size] = x;
        size++;
    }

    static int pop() {
        if(size ==0) {
            return -1;
        }else {
            int result= stack[size-1];
            stack[size-1] = 0;
            size--;
            return result;
        }


    }

    static int size() {
        return size;
    }

    static int empty() {
        if(size==0){
            return 1;
        }else{
            return 0;
        }
    }

    static int top() {
        if(size ==0){
            return -1;
        }else {
            return stack[size-1];
        }
    }
}
