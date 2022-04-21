package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sum_number_1 {

    static Long[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        dp = new Long[1001];

        for (int k = 1; k <= T; k++) {
            int n = Integer.parseInt(br.readLine());

            for (int i = 0; i < n + 1; i++) {
                dp[i] = null;
            }

            dp[1] = 1L;
            dp[2] = 2L;
            dp[3] = 4L;

            System.out.println(fibonacci(n));

        }
        br.close();
    }

    static Long fibonacci(int N) {
        if (dp[N] == null) {
            dp[N] = fibonacci(N - 3) + fibonacci(N - 2) + fibonacci(N - 1);
            dp[N] %= 10007;
        }
        return dp[N];
    }
}
