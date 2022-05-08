package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_11655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            int code = str.charAt(i) + 13;
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                if (code > 'Z') {
                    code -= 26;
                }
                sb.append((char)code);
            } else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
                if (code > 'z') {
                    code -= 26;
                }
                sb.append((char) code);
            } else {
                sb.append((char) str.charAt(i));
            }
        }
        System.out.println(sb);


    }
}
