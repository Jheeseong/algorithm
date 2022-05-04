package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            sb.append(solve(str)).append('\n');
        }
        System.out.println(sb);
    }

    public static String solve(String str) {
        int cnt = 0;
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == '(') {
                cnt++;
            } else if (cnt == 0) {
                return "NO";
            } else {
                cnt--;
            }
        }
        if (cnt == 0) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
