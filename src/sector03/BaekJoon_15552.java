package sector03;


import java.io.*;
import java.util.StringTokenizer;

public class BaekJoon_15552 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int totalCount = Integer.parseInt(br.readLine());

        for(int i = 0; i < totalCount; i ++)  {
            String temp[] = br.readLine().split(" ");
            int a = Integer.parseInt(temp[0]);
            int b = Integer.parseInt(temp[1]);

            String sum = String.valueOf(a+b);

            bw.write( sum+ "\n");
        }
        bw.flush();
        bw.close();
     }
}
