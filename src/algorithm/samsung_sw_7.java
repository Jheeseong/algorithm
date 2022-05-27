package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class samsung_sw_7 {
    static String[][] arr;
    static boolean[][] visit;
    static int T;
    static int N;
    static int minX,minY,maxX,maxY,done;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            N = Integer.parseInt(br.readLine());
            arr = new String[N][N];
            visit = new boolean[N][N];

            for (int j = 0; j < N; j++) {
                String s = br.readLine();
                for (int k = 0; k < N; k++) {
                    arr[j][k] = String.valueOf(s.charAt(k));
                }
            }
            int cnt = 0;

            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    if (arr[j][k].contains("#") && !visit[j][k]) {
                        bfs(j,k);
                        cnt++;
                    }
                }
            }
            if (maxX - minX == maxY - minY && cnt == 1 && (maxX - minX + 1)*(maxX - minX + 1) == done) {
                System.out.println("#" + i + " yes");
            } else {
                System.out.println("#" + i + " no");
            }
        }
    }

    public static void bfs(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i,j});
        visit[i][j] = true;
        minX = N;
        minY = N;
        maxX = 0;
        maxY = 0;
        done = 0;

        while (!queue.isEmpty()) {
            int curX = queue.peek()[0];
            int curY = queue.peek()[1];
            queue.poll();
            done++;

            for (int n = 0; n < 4; n++) {
                int nx = curX + dx[n];
                int ny = curY + dy[n];

                if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
                    if (arr[nx][ny].contains("#") && !visit[nx][ny]) {
                        queue.offer(new int[]{nx, ny});
                        visit[nx][ny] = true;
                        minX = Math.min(minX, nx);
                        minY = Math.min(minY, ny);
                        maxX = Math.max(maxX, nx);
                        maxY = Math.max(maxY, ny);
                    }
                }
            }
        }
    }
}
