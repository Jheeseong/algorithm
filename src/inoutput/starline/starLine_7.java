package inoutput.starline;

import java.io.*;

public class starLine_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                bw.write(" ");
            }
            for (int j = 1; j <= i; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= i; j++) {
                bw.write(" ");
            }
            for (int j = 1; j <= n-i; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
