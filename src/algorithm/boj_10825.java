package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_10825 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        String arr[][] = new String[T][4];

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
            arr[i][2] = st.nextToken();
            arr[i][3] = st.nextToken();
        }
        Arrays.sort(arr, (e1,e2) -> {
            if (Integer.parseInt(e1[1]) == Integer.parseInt(e2[1])) {
                if (Integer.parseInt(e1[2]) == Integer.parseInt(e2[2])) {
                    if (Integer.parseInt(e1[3]) == Integer.parseInt(e2[3])) {
                        return e1[0].compareTo(e2[0]);
                    }
                    return Integer.parseInt(e2[3])- Integer.parseInt(e1[3]);
                }
                return Integer.parseInt(e1[2]) - Integer.parseInt(e2[2]);
            }
            return Integer.parseInt(e2[1]) - Integer.parseInt(e1[1]);
        });

        for (int i = 0; i < T; i++) {
            sb.append(arr[i][0]).append("\n");
        }
        System.out.println(sb);
    }
}
