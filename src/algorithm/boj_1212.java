package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1212 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String N = br.readLine();

        for (int i = 0; i < N.length(); i++) {
            int a = N.charAt(i) - '0';
            switch (a) {
                case 0:
                    sb.append("000"); break;
                case 1:
                    sb.append("001"); break;
                case 2:
                    sb.append("010"); break;
                case 3:
                    sb.append("011"); break;
                case 4:
                    sb.append("100"); break;
                case 5:
                    sb.append("101"); break;
                case 6:
                    sb.append("110"); break;
                case 7:
                    sb.append("111"); break;
            }
        }

        if (sb.charAt(0) == '0') sb.deleteCharAt(0);
        if (sb.charAt(0) == '0') sb.deleteCharAt(0);
        System.out.println(sb);
    }
}
