/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianD;

/**
 *
 * @author LENOVO
 */
/*
NIM: 41425017
Nama: Aldi Simamora
*/

import java.util.Scanner;

public class PalindromeVokal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kata: ");
        String kata = scanner.nextLine();

        // Ubah ke huruf kecil semua supaya pengecekan tidak case-sensitive
        String kataBersih = kata.toLowerCase();

        // Cek apakah kata adalah palindrome
        boolean palindrome = isPalindrome(kataBersih);

        // Hitung jumlah huruf vokal dalam kata
        int jumlahVokal = hitungVokal(kataBersih);

        System.out.println();
        if (palindrome) {
            System.out.println(kata + " adalah palindrome.");
        } else {
            System.out.println(kata + " bukan palindrome.");
        }
        System.out.println("Jumlah huruf vokal: " + jumlahVokal);

        scanner.close();
    }

    // Mengecek palindrome dengan membandingkan karakter dari depan dan belakang
    // secara bersamaan, mendekat ke tengah
    public static boolean isPalindrome(String str) {
        int kiri = 0;
        int kanan = str.length() - 1;

        while (kiri < kanan) {
            if (str.charAt(kiri) != str.charAt(kanan)) {
                return false;
            }
            kiri++;
            kanan--;
        }

        return true;
    }

    // Menghitung jumlah huruf vokal (a, i, u, e, o) dalam string
    public static int hitungVokal(String str) {
        int jumlah = 0;
        String vokal = "aiueo";

        for (int i = 0; i < str.length(); i++) {
            char huruf = str.charAt(i);
            if (vokal.indexOf(huruf) != -1) {
                jumlah++;
            }
        }

        return jumlah;
    }
}