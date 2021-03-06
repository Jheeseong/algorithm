package inoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringGetBytes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        int sum = 0;
        for(byte value : br.readLine().getBytes()) {
            System.out.println((value - '0'));
            sum += (value - '0');
        }
        System.out.println(sum);
    }
}
