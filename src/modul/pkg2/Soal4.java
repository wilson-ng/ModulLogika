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
public class Soal4 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float nilaiAngka, tugas, uts, uas;
        String nilaiHuruf = "";
        
        System.out.println("Program menghitung nilai Huruf dari TGS, UTS dan UAS");
        System.out.print("Nilai Tugas [20%]: ");
        tugas = input.nextFloat();
        
        System.out.print("Nilai UTS [30%]: ");
        uts = input.nextFloat();
        
        System.out.print("Nilai UAS [50%]: ");
        uas = input.nextFloat();
        
        nilaiAngka = (float)((0.2 * tugas) + (0.3 * uts) + (0.5 * uas));
        
        if (nilaiAngka <= 100 && nilaiAngka > 90 ) {
            nilaiHuruf = "A";
        } else if (nilaiAngka <= 90 && nilaiAngka > 80) {
            nilaiHuruf = "B+";
        } else if (nilaiAngka <= 80 && nilaiAngka > 70) {
            nilaiHuruf = "B";
        } else if (nilaiAngka <= 70 && nilaiAngka > 60) {
            nilaiHuruf = "C+";
        } else if (nilaiAngka <= 60 && nilaiAngka > 50) {
            nilaiHuruf = "C";
        } else if (nilaiAngka <= 50 && nilaiAngka >= 0) {
            nilaiHuruf = "D";
        }
        
        System.out.println("Nilai huruf = " + nilaiHuruf);
    }
}
