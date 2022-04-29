package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_9461 {
    static Long dp[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        dp = new Long[101];

        dp[1] = 1L;
        dp[2] = 1L;
        dp[3] = 1L;
        dp[4] = 2L;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            sb.append(recur(Integer.parseInt(br.readLine()))).append('\n');
        }
        System.out.println(sb);
    }

    static long recur(int n) {
        if (dp[n] == null) {
            dp[n] = recur(n - 2) + recur(n - 3);
        }
        return dp[n];
    }
}
