package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class samsung_sw_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            String s = br.readLine();
            int n = Integer.parseInt(s);
            int[] check = new int[9];
            int[] num1 = new int[10];
            int[] num2;

            for (int j = 0; j < s.length(); j++) {
                num1[Integer.parseInt(s.substring(j, j + 1))]++;
            }

            int a= 2;
            for (int j = 0; j < 9; j++) {
                if (String.valueOf(n * a).length() == s.length()) {
                    check[j] = n * a;
                    a++;
                } else {
                    check[j] = 0;
                    break;
                }
            }

            boolean t = false;
            for (int j = 0; j < 9; j++) {
                num2 = new int[10];
                for (int k = 0; k < String.valueOf(check[j]).length(); k++) {
                    num2[Integer.parseInt(String.valueOf(check[j]).substring(k, k + 1))]++;
                }
                if (Arrays.equals(num1, num2)) {
                    t = true;
                    break;
                }
            }
            System.out.printf("#%d %s\n", i , t == true ? "possible" : "impossible");
        }
    }
}
