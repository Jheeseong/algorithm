package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class boj_11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        long n = Long.parseLong(st.nextToken());
        long T = Long.parseLong(st.nextToken());

        ArrayList<Character> list = new ArrayList<>();
        while (n > 0) {
            if (n % T < 10) {
                list.add((char) (n % T + '0'));
            } else {
                list.add((char) (n % T - 10 + 'A'));
            }
            n /= T;
        }
        Collections.reverse(list);
        for (char res : list) {
            sb.append(res);
        }
        System.out.println(sb);
    }
}
