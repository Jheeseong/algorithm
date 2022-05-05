package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        sb.append(solve(str)).append('\n');

        System.out.println(sb);
    }

    public static int solve(String str) {
        int cnt = 0;
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                cnt++;
            } else if (str.charAt(i) == ')') {
                cnt--;
                if (str.charAt(i - 1) == '(') {
                    sum += cnt;
                } else {
                    sum += 1;
                }
            }
        }
        return sum;
    }
}
