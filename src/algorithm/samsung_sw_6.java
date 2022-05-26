package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class samsung_sw_6 {
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            br.readLine();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[101];
            for (int j = 0; j < 1000; j++) {
                arr[Integer.parseInt(st.nextToken())]++;
            }
            int temp = 0;
            int cnt = 0;
            for (int j = 0; j <= 100; j++) {
                if (arr[j] >= cnt) {
                    temp = j;
                    cnt = arr[j];
                }
            }
            System.out.printf("#%d %d\n",i,temp);
        }
    }
}
