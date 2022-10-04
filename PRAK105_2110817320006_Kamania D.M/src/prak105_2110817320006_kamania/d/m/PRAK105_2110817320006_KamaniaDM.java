package prak105_2110817320006_kamania.d.m;

import java.util.Scanner;

public class PRAK105_2110817320006_KamaniaDM {
       
   public static void main(String[] args) {
        double r, t, volume;
        final double PHI = 3.14;
        
        Scanner scanInput = new Scanner(System.in);
        
        System.out.print("Masukkan jari-jari: ");
        r = scanInput.nextDouble();
        System.out.print("Masukkan tinggi: ");
        t = scanInput.nextDouble();
        
        volume = (PHI * r * r) * t;
        
        System.out.println("Volume tabung dengan jari-jari "+r+" cm dan tinggi "+t+" cm adalah "+volume+ " m3");
    }
}