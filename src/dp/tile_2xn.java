package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tile_2xn {

    static int[] dp = new int[1001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        dp[1] = 1;
        dp[2] = 2;

        int n = Integer.parseInt(br.readLine());

        br.close();

        System.out.println(fibonacci(n));
    }

    static int fibonacci(int N) {
        dp[N] = fibonacci(N - 2) + fibonacci(N - 1);
        dp[N] %= 10007;
        return dp[N];
    }
}
