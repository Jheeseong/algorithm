package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class uprise_number {

    static long[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        br.close();

        dp = new long[N + 1][10];

        for (int i = 0; i < 10; i++) {
            dp[1][i] = 1;
        }

        long result = 0;

        for (int i = 0; i < 10; i++) {
            result += recur(N, i);
        }
        System.out.println(result % 10007);
    }

    static long recur(int digit, int val) {
        if (digit == 1) {
            return dp[digit][val];
        }
        if (dp[digit][val] == 0){
            for (int i = 0; i <= 9; i++) {
                for (int j = i; j <= 9; j++) {
                    dp[digit][i] += recur(digit - 1, j);
                    dp[digit][i] %= 10007;
                }
            }
        }
        return  dp[digit][val] % 10007;
    }
}
