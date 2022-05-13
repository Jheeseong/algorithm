package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_6588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int Max = 1000000;
        boolean[] prime = new boolean[Max + 1];

        prime[0] = true;
        prime[1] = true;

        for (int i = 2; i <= Math.sqrt(Max); i++) {
            if (prime[i] == true) {
                continue;
            }
            for (int j = i * i; j < Max + 1; j = j + i) {
                prime[j] = true;
            }
        }

        while (true) {
            int n = Integer.parseInt(br.readLine());
            boolean ok = true;
            if (n == 0)
                break;
            for (int i = 2; i <= n / 2; i++) {
                if (prime[i] ==false && prime[n - i] == false) {
                    System.out.println(n + " = " + i + " + " + (n - i));
                    ok = false;
                    break;
                }
            }
            if (ok) {
                System.out.println("Goldbach's conjecture is wrong.");
            }
        }
    }
}
