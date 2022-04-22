package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class stairs_number {

    static Long[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        br.close();

        dp = new Long[N][10];

        for (int i = 0; i < 10; i++) {
            dp[0][i] = 1L;
        }

        long result = 0;

        for (int i = 1; i <= 9; i++) {
            result += recur(N - 1, i);
        }
        System.out.println(result % 1000000000);

    }

    static long recur(int digit, int val) {

        if (digit == 0) {
            return dp[digit][val];
        }
        if (dp[digit][val] == null) {
            if (val == 0) {
                dp[digit][val] = recur(digit -1, 1);
            } else if (val == 9) {
                dp[digit][val] = recur(digit - 1, 8);
            } else {
                dp[digit][val] = recur(digit - 1, val - 1) + recur(digit - 1, val + 1);
            }
        }
        return dp[digit][val] % 1000000000;
    }
}
