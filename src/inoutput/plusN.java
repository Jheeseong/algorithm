package inoutput;

import java.io.*;

public class plusN {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        br.close();

        for(int i=1; i<=n; i++) {
            bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
    }
}
