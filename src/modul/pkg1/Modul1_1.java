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
public class Modul1_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float alas, tinggi;

        System.out.println("Menghitung luas segitiga");

        System.out.print("Masukkan Alas Segitiga : ");
        alas = input.nextFloat();

        System.out.print("Masukkan Tinggi Segitiga : ");
        tinggi = input.nextFloat();

        System.out.print("Luas Segitiga = " + alas * tinggi / 2);

    }    
}
