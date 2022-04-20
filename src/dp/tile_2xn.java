package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tile_2xn {

    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        dp = new int[n + 1];

        for (int i = 0; i < n + 1; i++) {
            dp[i] = -1;
        }

        dp[1] = 1;
        dp[2] = 2;
        System.out.println(fibonacci(n));
        br.close();


    }

    static int fibonacci(int N) {
        if (dp[N] == -1) {
            dp[N] = fibonacci(N - 2) + fibonacci(N - 1) % 10007;
        }
        return dp[N];
    }
}
