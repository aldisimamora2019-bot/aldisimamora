/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianC;

/**
 *
 * @author LENOVO
 */

import java.util.Scanner;
 
public class CreditCardValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Masukkan nomor kartu: ");
        String input = scanner.nextLine();

        String bersih = input.replace("-", "");

        if (bersih.length() != 16) {
            System.out.println("Nomor kartu tidak valid!");
            System.out.println("Harus 16 digit.");
 
        } else if (!hanyaAngka(bersih)) {
            System.out.println("Nomor kartu tidak valid!");
            System.out.println("Hanya boleh berisi angka dan tanda hubung.");
 
        } else if (!(bersih.charAt(0) == '4' || bersih.charAt(0) == '5' || bersih.charAt(0) == '6')) {
            System.out.println("Nomor kartu tidak valid!");
            System.out.println("Harus dimulai dengan 4, 5, atau 6.");
 
        } else if (!formatHubungValid(input)) {
            System.out.println("Nomor kartu tidak valid!");
            System.out.println("Tanda hubung harus ditempatkan setiap 4 digit.");
 
        } else {
            System.out.println("Nomor kartu valid.");
        }
 
        scanner.close();
    }
 
   
    public static boolean hanyaAngka(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
 
    
    public static boolean formatHubungValid(String input) {
        if (!input.contains("-")) {
            return true; 
        }
 
        String[] kelompok = input.split("-");
 
        
        if (kelompok.length != 4) {
            return false;
        }
 
        for (String bagian : kelompok) {
            if (bagian.length() != 4) {
                return false;
            }
        }
 
        return true;
    }
}
 
