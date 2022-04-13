package inoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringPrint_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int i =0;
        for(byte value : br.readLine().getBytes()) {
            System.out.print((char) value);
            if(i % 10 == 9) {
                System.out.println();
            }
            i++;
        }
    }
}
