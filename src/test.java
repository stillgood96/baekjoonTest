import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String[] test = new String[num+1];
        //ArrayList<Integer> stack = new ArrayList<>();
        LinkedList<Integer> stack2 = new LinkedList<>();




        for(int i =0; i<num + 1; i++) {
            test[i] = sc.nextLine();

            if(test[i].contains("push")) {
                String output =test[i].substring(5);
                stack2.add(Integer.parseInt(output));
            }
            else if(test[i].contains("pop")) {

                if(stack2.toArray().length != 0) {
                    int lastNum = stack2.toArray().length -1;
                    System.out.println(stack2.toArray()[lastNum]);
                    stack2.remove(lastNum);
                }else if(stack2.toArray().length ==0) {
                    System.out.println(-1);
                }

            }
            else if(test[i].contains("size")) {
                System.out.println(stack2.toArray().length);
            }
            else if(test[i].contains("empty")){
                if(stack2.toArray().length ==0) {
                    System.out.println(1);
                }else {
                    System.out.println(0);
                }
            }
            else if(test[i].contains("top")){
                if(stack2.toArray().length ==0){
                    System.out.println(-1);
                }else{
                    int lastNum = stack2.toArray().length -1 ;
                    System.out.println(stack2.toArray()[lastNum]);
                }
            }
        }


    }

}
