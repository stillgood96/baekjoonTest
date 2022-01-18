package sector03;

import org.omg.CosNaming._BindingIteratorImplBase;

import java.util.Scanner;

public class BaekJoon_10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        for(int i = 1; i<= count; i ++ ) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a+b);
        }

    }
}
