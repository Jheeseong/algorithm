package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class samsung_sw_9 {
    static int arr[][];
    static int N;
    static int dx[] = {0, 1, 0, -1};
    static int dy[] = {1, 0, -1, 0};

    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int tn = 1; tn <= T; tn++) {
            N = Integer.parseInt(br.readLine());

            arr = new int[N][N];
            int cnt = 1;

            int i = 0, j = 0, d = 0;

            while (cnt <= N * N) {
                int nx = i + dx[d];
                int ny = j + dy[d];
                if (nx < 0 || nx >= N || ny < 0 || ny >= N || arr[nx][ny] != 0) {
                    d = (d + 1) % 4;
                    nx = i + dx[d];
                    ny = j + dy[d];
                }
                arr[i][j] = cnt++;
                i = nx;
                j = ny;
            }
            System.out.println("#" + tn);
            for (int n = 0; n < N; n++) {
                for (int m = 0; m < N; m++) {
                    System.out.print(arr[n][m] + " ");
                }
                System.out.println();
            }
        }
    }

}
