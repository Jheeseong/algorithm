package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1912 {

    static int arr[];
    static Integer dp[];
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        arr = new int[T];
        dp = new Integer[T];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < T; i++) {
            recur(i);
        }


        int max = dp[0];

        for (int i = 1; i < T; i++) {
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }

    static int recur(int n) {
        if (dp[n] == null) {
            if (n == 0) {
                dp[0] = arr[0];
            }else {
                dp[n] = Math.max(recur(n-1) + arr[n], arr[n]);
            }

        }
        return dp[n];
    }
}
