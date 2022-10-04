package prak102_2110817320006_kamania.d.m;

import java.util.Scanner;

public class PRAK102_2110817320006_KamaniaDM {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int i = 0;
        int input = keyboard.nextInt();
        
        while (i <= 6) {
            int t;
            if (input % 2 == 0) {
                t = (input / 2) -1;
                System.out.print(" " + t + " " );
            } else {
                System.out.print(input);
            }
            input++;
            i++;
        }
       keyboard.close();
    }
    
}
