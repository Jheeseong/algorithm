package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class samsung_sw_5 {
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int i, j;

        for(i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];
            long sum = 0;
            int n;
            int idx;

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            idx = N - 1;
            n = arr[idx];
            for(j = N - 2; j >= 0; j--) {
                if(arr[j] > n) {
                    idx = j;
                    n = arr[j];
                }
                else
                    sum += arr[idx] - arr[j];
            }

            System.out.println("#" + (i + 1) + " " + sum);
        }
    }
}
