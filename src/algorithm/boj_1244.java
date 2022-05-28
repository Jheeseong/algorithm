package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class boj_1244 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < T; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int sex = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());

            if (sex == 1) {
                for (int j = 0; j < T; j++) {
                    if ((j + 1) % num == 0) {
                        if (list.get(j) == 1) {
                            list.set(j, 0);
                        } else {
                            list.set(j, 1);
                        }
                    }
                }
            }
            if (sex == 2) {
                for (int j = 1; j <= T / 2; j++) {
                    if ((num - 1) - j >= 0 && (num - 1) + j < list.size()) {
                        if (list.get((num - 1) - j) == list.get((num - 1) + j)) {
                            if (list.get((num - 1) - j) == 1) {
                                list.set((num - 1) - j, 0);
                                list.set((num - 1) + j, 0);
                            } else {
                                list.set((num - 1) - j, 1);
                                list.set((num - 1) + j, 1);
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (list.get(num - 1) == 1) {
                    list.set(num - 1, 0);
                } else {
                    list.set(num - 1, 1);
                }
            }
        }
        StringBuilder sb =new StringBuilder();
        for (int i = 0; i < T; i++) {
            sb.append(list.get(i)).append(" ");
            if ((i + 1) % 20 == 0) {
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}
