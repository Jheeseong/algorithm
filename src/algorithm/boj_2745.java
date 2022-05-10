package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class boj_2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < N.length(); i++) {
            list.add(N.charAt(i));
        }

        int res = 0;
        Collections.reverse(list);
        for (int i = 0; i <= list.size() -1; i++) {
            if (list.get(i) <= '9') {
                res += Math.pow(B, i) * (list.get(i) - '0');
            }else {
                res += Math.pow(B, i) * (list.get(i) - 'A' + 10);
            }
        }
        sb.append(res);
        System.out.println(res);
    }
}
