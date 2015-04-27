/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg2;

import java.util.Scanner;

/**
 *
 * @author Wilson Ng
 */
public class Modul1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int angka;
        String jenis = "";
        
        System.out.print("Masukkan angka bulat positif atau negatif: ");
        angka = input.nextInt();
        
        if (angka < 0) {
            jenis = "Negatif";
        } else {
            jenis = "Positif";
        }
        
        System.out.println("Angka " + angka + " merupakan angka " + jenis);
    }
}
