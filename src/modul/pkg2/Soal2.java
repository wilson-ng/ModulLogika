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
public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float sisiSatu, sisiDua, sisiTiga;
        
        System.out.print("Masukkan sisi pertama : ");
        sisiSatu = input.nextFloat();
        
        System.out.print("Masukkan sisi kedua : ");
        sisiDua = input.nextFloat();
        
        System.out.print("Masukkan sisi ketiga : ");
        sisiTiga = input.nextFloat();
        
        if (sisiSatu == sisiDua && sisiDua == sisiTiga) {
            System.out.println("Termasuk kubus");
        } else {
            System.out.println("Bukan kubus");
        }   
    }
}
