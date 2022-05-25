package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class samsung_sw_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            String s = "";
            String s2 = "";
            ArrayList<Integer> list = new ArrayList<>();
            s = br.readLine();
            int arr[] = new int[s.length()];
            for (int j = 0; j < s.length(); j++) {
                list.add((int) s.charAt(j) - '0');
            }
            int a = 2;
            int cnt = 0;
            while (true) {
                s2 = String.valueOf(Integer.valueOf(s) * a);
                if (s2.length() > list.size()) {
                    break;
                }
                if (list.get(0) == 0) {
                    break;
                }
                for (int j = 0; j < list.size(); j++) {
                    for (int k = 0; k < list.size(); k++) {
                        if ((s2.charAt(j) - '0') == list.get(k)) {
                            arr[j] += 1;
                        }
                    }
                }
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == 1) {
                        cnt++;
                    }
                }
                if (cnt == list.size()) {
                    System.out.println("#" + i + " possible");
                    break;
                } else {
                    a++;
                    cnt = 0;
                    arr = new int[list.size()];
                }
            }
            if (cnt != list.size()) {
                System.out.println("#" + i + " impossible");
            }
        }
    }
}
