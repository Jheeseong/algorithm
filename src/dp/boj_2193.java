package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_2193 {

    static long dp[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());


        dp = new long[91];

        for (int i = 0; i < N + 1; i++) {
            dp[i] = 0;
        }

        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 1;

        System.out.println(fibonacci(N));

    }

    static long fibonacci(int n) {
        if (dp[n] == 0) {
            for (int i = 0; i <= n - 2; i++) {
                dp[n] += fibonacci(i);
            }
        }
        return dp[n];
    }
}
