package inoutput;

import java.io.*;

public class starLine_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        br.close();

        for (int i = 1; i <= n; i++) {
            for (int a = 0; a < n-i; a++) {
                bw.write(" ");
            }
            for (int b = 0; b < i; b++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
