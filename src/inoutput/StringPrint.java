package inoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringPrint {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        while((str=br.readLine()) != null) {
            if(str.length() > 100) {
                break;
            }else{
                System.out.println(str);
            }
        }
    }
}
