package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_10824 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String arr[] = new String[4];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < 4; i++) {

            arr[i] = st.nextToken();
        }
        long a = Long.parseLong(arr[0] + arr[1]);
        long b = Long.parseLong(arr[2] + arr[3]);

        sb.append(a + b);

        System.out.println(sb);
    }
}
