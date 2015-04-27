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
public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float nilaiSatu, nilaiDua, nilaiTiga, max;
        
        System.out.print("Masukkan nilai pertama : ");
        nilaiSatu = input.nextFloat();

        System.out.print("Masukkan nilai kedua : ");
        nilaiDua = input.nextFloat();
        
        System.out.print("Masukkan nilai ketiga : ");
        nilaiTiga = input.nextFloat();
        
        if (nilaiSatu > nilaiDua && nilaiSatu > nilaiTiga) {
            max = nilaiSatu;
        } else if (nilaiDua > nilaiTiga) {
            max = nilaiDua;
        } else {
            max = nilaiTiga;
        }
        
        System.out.println("Nilai tertinggi dari semua nilai adalah " + max);
    }
}
