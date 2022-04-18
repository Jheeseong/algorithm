package inoutput.starline;

import java.io.*;

public class starLine_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                bw.write(" ");
            }
            bw.write("*");
            for (int k = 1; k <= 2 * i - 3; k++) {
                bw.write(" ");
            }
            if (i != 1) {
                bw.write("*");
            }
            bw.write("\n");
        }
        for (int i = 1; i <= 2 * n - 1; i++) {
            bw.write("*");
        }
        bw.flush();
        bw.close();
    }
}
