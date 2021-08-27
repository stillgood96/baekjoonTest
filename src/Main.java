
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    int startNum;
    int endNum = 0;

    ArrayList<Integer> stack = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void start() {

        startNum = sc.nextInt();

        while(endNum < startNum) {
            String input = sc.nextLine();
            switch (input) {
                case "push" :
                    int input2 = sc.nextInt();
                    push(input2);
                    break;
                case "pop" :
                    pop();
                    break;
                case "size" :
                    size();
                    break;
                case "empty" :
                    empty();
                    break;
                case "top" :
                    top();
                    break;
            }
        }
    }

    public void push(int num) {
        stack.add(num);
        endNum++;
    }

    public void pop() {
        if(stack.size() ==0) {
            System.out.println(-1);
        }else {
            int lastNum = stack.size() - 1;
            System.out.println(stack.get(lastNum));
            stack.remove(lastNum);
        }
        endNum++;
    }

    public void size() {
        System.out.println(stack.size());
        endNum++;
    }

    public void empty() {
        int num = 0;
        if(stack.size() ==0) {
            num += 1;
        }
        System.out.println(num);
        endNum++;
    }

    public void top() {
        int num = -1;
        int last = stack.size();
        if(last != 0) {
            --last;
            System.out.println(stack.get(last));
        }else {
            System.out.println(num);
        }
        endNum++;
    }







    public static void main(String[] args) {
        Main main = new Main();


        main.start();



    }

}
