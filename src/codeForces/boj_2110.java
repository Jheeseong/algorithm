package codeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_2110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        long max = 0;

        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        Arrays.sort(arr);

        max++;
        long min = 0;
        long mid = 0;

        while (min < max) {
            mid = (max + min) / 2;

            int cnt = 1;
            long lastHouse = arr[0];

            for (int i = 0; i < arr.length; i++) {
                int locate = arr[i];

                if (locate - lastHouse >= mid) {
                    cnt++;
                    lastHouse = locate;
                }
            }

            if (cnt < C) {
                max = mid;
            } else {
                min = mid + 1;
            }

        }
        System.out.println(min - 1);
    }
}
