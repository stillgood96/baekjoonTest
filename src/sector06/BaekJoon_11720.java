package sector06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_11720 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        String list = br.readLine();
        int sum = 0;
        for(int i = 0; i < count; i++) {
            sum += list.charAt(i)-'0';
        }
        System.out.println(sum);



    }
}
