package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class samsung_sw_10 {
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        boolean check = false;
        for (int i = 1; i <= T; i++) {
            String s = String.valueOf(i);
            for (int j = 0; j < s.length(); j++) {
                int num = s.charAt(j) - '0';
                if ((s.charAt(j) - '0') == 3 || (s.charAt(j) - '0') == 6 || (s.charAt(j) - '0') == 9) {
                    sb.append("-");
                    check = true;
                }
            }
            if (!check) {
                sb.append(i);
            }
            check = false;
            sb.append(" ");
        }
        System.out.println(sb);

    }

}
