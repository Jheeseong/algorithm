package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_10820 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = "";
        while ((str = br.readLine()) != null) {
            int arr[] = new int[4];
            for (int j = 0; j < str.length(); j++) {
                if ((int) str.charAt(j) >= 97) {
                    arr[0] += 1;
                } else if (65 <= (int) str.charAt(j) && (int) str.charAt(j) < 97) {
                    arr[1] += 1;
                } else if (48 <= (int) str.charAt(j) && (int) str.charAt(j) < 65) {
                    arr[2] += 1;
                } else if ((int) str.charAt(j) == 32){
                    arr[3] += 1;
                }
            }
            sb.append(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3]).append('\n');
        }
            System.out.println(sb);
        br.close();
    }
}
