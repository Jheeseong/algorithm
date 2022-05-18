package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj_2331 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        ArrayList list = new ArrayList<Integer>();
        list.add(A);

        while (true) {
            int temp = (int) list.get(list.size() - 1);

            int res = 0;

            while (temp != 0) {
                res += (int) Math.pow(temp % 10, (double) P);
                temp /= 10;
            }

            if (list.contains(res)) {
                int ans = list.indexOf(res);
                System.out.println(ans);
                break;
            }

            list.add(res);
        }




    }
}
