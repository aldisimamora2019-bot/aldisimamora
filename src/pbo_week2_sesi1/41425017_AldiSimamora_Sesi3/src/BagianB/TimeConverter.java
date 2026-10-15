/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianB;

/**
 *
 * @author LENOVO
 */

// Nama : Aldi Simamora
// NIM : 41425017

import java.util.Scanner;
 
public class TimeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("=== Konverter Waktu ===");
        System.out.println("1. Detik ke HH:MM:SS");
        System.out.println("2. HH:MM:SS ke detik");
        System.out.println();
        System.out.print("Pilihan: ");
        int pilihan = Integer.parseInt(scanner.nextLine());
 
        if (pilihan == 1) {
           
            System.out.print("Masukkan jumlah detik: ");
            int totalDetik = Integer.parseInt(scanner.nextLine());
 
            String hasil = detikKeFormatWaktu(totalDetik);
            System.out.println("Hasil: " + hasil);
 
        } else if (pilihan == 2) {
            
            System.out.print("Masukkan waktu (HH:MM:SS): ");
            String waktu = scanner.nextLine();
 
            int totalDetik = waktuKeDetik(waktu);
            System.out.println("Hasil: " + totalDetik + " detik");
 
        } else {
            System.out.println("Pilihan tidak valid!");
        }
 
        scanner.close();
    }
 
   
    public static String detikKeFormatWaktu(int totalDetik) {
        int jam = totalDetik / 3600;
        int menit = (totalDetik % 3600) / 60;
        int detik = totalDetik % 60;
 
       
        return String.format("%02d:%02d:%02d", jam, menit, detik);
    }
 
    
    public static int waktuKeDetik(String waktu) {
        String[] bagian = waktu.split(":");
 
        int jam = Integer.parseInt(bagian[0]);
        int menit = Integer.parseInt(bagian[1]);
        int detik = Integer.parseInt(bagian[2]);
 
        return (jam * 3600) + (menit * 60) + detik;
    }
}
