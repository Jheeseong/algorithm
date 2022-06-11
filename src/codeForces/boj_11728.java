package codeForces;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_11728 {
    public static void main(String[] args) throws IOException, IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int size = n + m;
        int[] result = new int[size];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) { // 배열 A 넣기
            result[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = n; i < n + m; i++) { // 배열 B 넣기
            result[i] = Integer.parseInt(st.nextToken());

        }
        Arrays.sort(result); // 오름차순 정렬

        StringBuilder sb = new StringBuilder();
        for(int r:result) {
            sb.append(r).append(" ");
        }

        System.out.println(sb);
    }
}
