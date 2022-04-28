package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1699 {
    static int dp[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        dp = new int[T + 1];

        System.out.println(recur(T));
    }

    static int recur(int n) {
        for (int i = 1; i <= n; i++) {
            dp[i] = i;
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i-j*j] + 1);
            }
        }
        return dp[n];
    }
}
