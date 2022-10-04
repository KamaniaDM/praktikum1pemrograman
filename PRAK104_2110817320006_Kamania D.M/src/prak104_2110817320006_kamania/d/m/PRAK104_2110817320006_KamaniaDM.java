package prak104_2110817320006_kamania.d.m;

import java.util.Scanner;

public class PRAK104_2110817320006_KamaniaDM {

    public static void main(String[] args) {

       Scanner keyboard = new Scanner(System.in);
       
       int Andi1, Budi1, Andi2, Budi2, Andi3, Budi3;
       int pointAndi = 0, pointBudi= 0;
       
       System.out.println("+++++INPUT+++++");
       System.out.print("Kartu Andi: ");
       Andi1 = keyboard.nextInt();
       Andi2 = keyboard.nextInt();
       Andi3 = keyboard.nextInt();
       keyboard.nextLine();
       int [] Andi = {Andi1, Andi2, Andi3};
       
       System.out.print("Kartu Budi : ");
       Budi1 = keyboard.nextInt();
       Budi2 = keyboard.nextInt();
       Budi3 = keyboard.nextInt();
       keyboard.nextLine();
       int [] Budi = {Budi1, Budi2, Budi3};
       
       if ((Budi1 >= 2 && Budi1 <= 10) && (Budi2 >= 2 && Budi2 <= 10)&& (Budi3 >= 2 && Budi3 <= 10)&&
               (Andi1 >= 2 && Andi1 <= 10) && (Andi2 >= 2 && Andi2 <= 10)&& (Andi3 >= 2 && Andi3 <= 10)) {
           int i = 0;
           while (i <= 2) {
               if (Andi[i]>Budi[i]) {
                   pointAndi++;
               } else if (Budi[i]>Andi[i]) {
                   pointBudi++;
               }
               i++;
           }
           System.out.println("OUTPUT");
           if (pointAndi>pointBudi) {
               System.out.println("Andi");
               }
           if (pointAndi<pointBudi) {
               System.out.println("Budi");
               }
           if (pointAndi==pointBudi) {
               System.out.println("Seri");
               }
                   
               }
           }
      
}
