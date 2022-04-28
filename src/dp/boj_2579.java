package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2579{
    static Integer dp[];
    static int cost[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        dp = new Integer[T + 1];
        cost = new int[T + 1];

        for (int i = 1; i <= T; i++) {
            cost[i] = Integer.parseInt(br.readLine());
        }
        dp[0] = cost[0];
        dp[1] = cost[1];

        if (T >= 2) {
            dp[2] = cost[1] + cost[2];
        }
            System.out.println(recur(T));
    }

    static int recur(int n) {
        if (dp[n] == null){
            dp[n] = Math.max(recur(n - 2), recur(n - 3) + cost[n - 1]) + cost[n];
        }
        return dp[n];
    }
}
