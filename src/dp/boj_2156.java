package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2156 {
    static Integer dp[];
    static int arr[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        dp = new Integer[T + 1];
        arr = new int[T + 1];

        for (int i = 1; i <= T; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            }

        dp[0] = arr[0];
        dp[1] = arr[1];

        if (T >= 2) {
            dp[2] = arr[1] + arr[2];
        }
        System.out.println(recur(T));
    }

    static int recur(int n) {

        if (dp[n] == null) {
            dp[n] = Math.max(Math.max(recur(n - 2), recur(n - 3) + arr[n - 1]) + arr[n], recur(n - 1));
        }
        return dp[n];
    }
}
