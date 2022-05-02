package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class boj_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < T; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);

        for (int value : list) {
            sb.append(value).append("\n");
        }
        System.out.println(sb);
    }
}
