package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_2133 {

    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        dp = new int[n + 1];

        dp[0] = 1;

        System.out.println(fibonacci(n));
        br.close();


    }

    static int fibonacci(int N) {
        if (N % 2 == 0) {
            for (int i = 2; i <= N; i += 2) {
                dp[i] = dp[i - 2] * 3;
                for (int j = i - 4; j >= 0; j -= 2) {
                    dp[i] += dp[j] * 2;
                }
            }
        }
        return dp[N];
    }
}
