package inoutput;

import java.util.Scanner;

public class plusPrint_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+b);

            if(a + b == 0) {
                break;
            }
        }
        sc.close();
    }
}
