package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        String str = st.nextToken();
        int arr[] = new int[26];
        for (int i = 0; i < str.length(); i++) {
            arr[(int) str.charAt(i) - 97] += 1;
        }

        for (int i = 0; i < 26; i++) {
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
    }
}
