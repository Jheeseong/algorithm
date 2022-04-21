package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tile_2xn {

    static Long[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        dp = new Long[1001];

        for (int i = 0; i < n + 1; i++) {
            dp[i] = null;
        }

        dp[1] = 1L;
        dp[2] = 2L;
        System.out.println(fibonacci(n));
        br.close();


    }

    static Long fibonacci(int N) {
        if (dp[N] == null) {
            dp[N] = fibonacci(N - 2) + fibonacci(N - 1);
            dp[N] %= 10007;
        }
        return dp[N];
    }
}
