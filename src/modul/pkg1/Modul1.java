/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg1;

import java.util.Scanner;

/**
 *
 * @author Wilson Ng
 */
public class Modul1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Masukkan Suhu Celcius = ");
        float suhuCelcius, suhuKonversi;
        int pilihan;
        String suhuTujuan;
        
        Scanner input = new Scanner(System.in);
        suhuCelcius = input.nextFloat();
        
        System.out.println("Konversi ke:");
        System.out.println("1. Farenheit:");
        System.out.println("2. Reamur:");
        System.out.print("Pilihan : ");
        pilihan = input.nextInt();
        
        if (pilihan == 1) {
            suhuTujuan = "Farenheit";
            suhuKonversi = ((9 * suhuCelcius) / 5) + 32;
        } else {
            suhuTujuan = "Reamur";
            suhuKonversi = (4 * suhuCelcius) / 5;
        }
        
        System.out.println("Suhu Celcius di konversikan ke " + suhuTujuan + 
                " = " + suhuKonversi);
    }
    
}
