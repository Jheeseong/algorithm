package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int arr[] = new int[26];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        String str = st.nextToken();

        for (int i = 0; i < str.length(); i++) {
            if (arr[(int) str.charAt(i) - 97] == -1) {
                arr[(int) str.charAt(i) - 97] = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
    }
}
