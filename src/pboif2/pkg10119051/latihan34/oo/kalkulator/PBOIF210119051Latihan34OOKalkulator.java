/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119051.latihan34.oo.kalkulator;

import data.Kalkulator;
import java.util.Scanner;


/**
 *
 * @author RYP
 * NAMA   : Rahmayudhi Prakoso
 * KELAS  : PBOIF2
 * NIM    : 10119051
 * Deskripsi Program : Program ini berisi program Kalkulator
 */
public class PBOIF210119051Latihan34OOKalkulator {

    
    public static void main(String[] args) {
        
        //
        Kalkulator kal = new Kalkulator();
        
        //
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("==========Aplikasi Kalkulator Bilangan=========");
        System.out.println("Masukan Angka ke-1 : ");
        kal.value1 = keyboard.nextDouble();
        
        System.out.println("Masukan Angka ke-2 : ");
        kal.value2 = keyboard.nextDouble();
        
        //
        System.out.println("");
        System.out.println("Hasil Pertambahan : " + kal.tambahBilangan());
        
        System.out.println("Hasil Pengurangan : " + kal.kurangBilangan());
        
        System.out.println("Hasil Perkalian : " + kal.kaliBilangan());
        
        System.out.println("Hasil Pembagian : " + kal.bagiBilangan());
        
        System.out.println("Hasil Sisa : " + kal.sisaBilangan());
        
        
        
        
        
    
    }
    
}
