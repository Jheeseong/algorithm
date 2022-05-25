package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class samsung_sw_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int a= 1; a <= 10; a++){
            StringTokenizer st =new StringTokenizer(br.readLine());
            int T = Integer.parseInt(st.nextToken());

            int arr[] = new int[T];
            int res = 0;
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < T; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            for (int i = 2; i < T - 2; i++) {
                int left = Math.max(arr[i - 1], arr[i - 2]);
                int right = Math.max(arr[i + 1], arr[i + 2]);
                if (arr[i] > left && arr[i] > right) {
                    int deb = arr[i] - Math.max(left, right);
                    res += deb;
                }
            }
            System.out.println("#" + a + " " + res);

        }
    }
}
