package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj_2667 {
    static int[][] arr;
    static boolean[][] checked;
    static int[] apart;
    static int dong;
    static int dx[] = {0, 0, 1, -1};
    static int dy[] = {1, -1, 0, 0};
    static int T;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        T = Integer.parseInt(br.readLine());

        arr = new int[T + 1][T + 1];
        checked = new boolean[T + 1][T + 1];
        apart = new int[25 * 25];
        for (int i = 0; i < T; i++) {
            String input = br.readLine();
            for (int j = 0; j < T; j++) {
                arr[i][j] = input.charAt(j) - '0';
            }
        }

        for (int i = 0; i < T; i++) {
            for (int j = 0; j < T; j++) {
                if (arr[i][j] == 1 && !checked[i][j]) {
                    bfs(i, j);
                    dong++;
                }
            }
        }
        Arrays.sort(apart);
        sb.append(dong).append('\n');
        for (int i = 0; i < apart.length; i++) {
            if (apart[i] == 0) {
                continue;
            } else {
                sb.append(apart[i]).append('\n');
            }
        }
        System.out.println(sb);

    }

    public static void bfs(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i,j});
        checked[i][j] = true;
        apart[dong]++;

        while (!queue.isEmpty()) {
            int curX = queue.peek()[0];
            int curY = queue.peek()[1];
            queue.poll();

            for (int n = 0; n < 4; n++) {
                int nx = curX + dx[n];
                int ny = curY + dy[n];

                if (nx >= 0 && ny >= 0 && nx < T && ny < T) {
                    if (arr[nx][ny] == 1 && !checked[nx][ny]) {
                        queue.offer(new int[]{nx, ny});
                        checked[nx][ny] = true;
                        apart[dong]++;
                    }
                }
            }
        }
    }
}
