package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2011 {

    static Integer dp[];
    static int mod = 1000000;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();


        dp = new Integer[str.length() + 1];
        dp[0] = dp[1] = 1;

        if (str.charAt(0) == '0') {
            System.out.println(0);
        } else {
            System.out.println(recur(str));
        }
    }

    static int recur(String str) {
        int n = str.length();
        if (dp[n] == null) {
            for (int i = 2; i <= n; i++) {
                int now = i - 1;
                if (str.charAt(now) > '0') {
                    dp[i] = dp[i - 1];
                }
                int su = (str.charAt(now - 1) - '0') * 10 + (str.charAt(now) - '0');
                if (su >= 10 && su <= 26) {
                    dp[i] = (dp[i] + dp[i - 2]) % mod;
                }
            }
        }
        return dp[n];
    }
}
