package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class samsung_sw_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int res = 0;
            while (st.hasMoreTokens()) {
                int a = Integer.parseInt(st.nextToken());
                if (a % 2 == 1) {
                    res += a;
                }
            }
            System.out.println("#" + i +" "+  res);
        }
    }
}
