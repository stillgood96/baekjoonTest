package sector05;

import java.util.HashSet;
import java.util.Scanner;

public class BaekJoon_3052 {

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);


        HashSet<Integer> hash = new HashSet<Integer>();


        for(int i=0; i<10; i++) {
            hash.add(Integer.parseInt(sc.nextLine())%42);
        }

        System.out.println(hash.size());
    }
}
