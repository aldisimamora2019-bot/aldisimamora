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
 
public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        
        String[] items = new String[20];
        int count = 0;
 
        int pilihan = 0;
 
        System.out.println("=== Daftar Belanja ===");
 
        
        do {
            
            System.out.println("1. Tambah item");
            System.out.println("2. Hapus item");
            System.out.println("3. Tampilkan semua item");
            System.out.println("4. Cari item");
            System.out.println("5. Keluar");
            System.out.println();
            System.out.print("Pilihan: ");
            pilihan = Integer.parseInt(scanner.nextLine());
 
            switch (pilihan) {
                case 1:
                    tambahItem(scanner, items, count);
                    count++; 
                    break;
 
                case 2:
                    count = hapusItem(scanner, items, count);
                    break;
 
                case 3:
                    tampilkanItem(items, count);
                    break;
 
                case 4:
                    cariItem(scanner, items, count);
                    break;
 
                case 5:
                    System.out.println("Terima kasih!");
                    break;
 
                default:
                    System.out.println("Pilihan tidak valid!");
            }
 
            System.out.println(); 
 
        } while (pilihan != 5);
 
        scanner.close();
    }
 
    
    public static void tambahItem(Scanner scanner, String[] items, int count) {
        System.out.print("Masukkan item: ");
        String item = scanner.nextLine();
        items[count] = item;
        System.out.println(item + " berhasil ditambahkan!");
    }
 
    
    public static void tampilkanItem(String[] items, int count) {
        System.out.println("Daftar belanja:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + items[i]);
        }
    }
 
    
    public static void cariItem(Scanner scanner, String[] items, int count) {
        System.out.print("Cari item: ");
        String keyword = scanner.nextLine();
 
        boolean ditemukan = false;
        for (int i = 0; i < count; i++) {
            if (items[i].equalsIgnoreCase(keyword)) {
                System.out.println(items[i] + " ditemukan pada posisi " + (i + 1));
                ditemukan = true;
                break; // hentikan pencarian setelah ketemu
            }
        }
 
        if (!ditemukan) {
            System.out.println(keyword + " tidak ditemukan dalam daftar.");
        }
    }
 
    
    public static int hapusItem(Scanner scanner, String[] items, int count) {
        System.out.print("Hapus item pada posisi: ");
        int posisi = Integer.parseInt(scanner.nextLine());
 
        
        if (posisi < 1 || posisi > count) {
            System.out.println("Posisi tidak valid!");
            return count;
        }
 
        int index = posisi - 1; 
        String namaItem = items[index];
 
        
        for (int i = index; i < count - 1; i++) {
            items[i] = items[i + 1];
        }
        items[count - 1] = null; 
 
        System.out.println(namaItem + " berhasil dihapus!");
        return count - 1;
    }
}

/* Apa yang terjadi jika ada nilai yang diinput di luar rentang 0-100? 
Program tidak memvalidasi input, jadi nilai negatif atau >100 tetap diterima, 
ikut dihitung ke rata-rata, dan bisa muncul sebagai nilai max/min yang tidak valid. 
Solusi: tambahkan validasi (misalnya if/while) yang menolak input di luar 0-100.
*/

/*Bagaimana cara memodifikasi program untuk menangani jumlah nilai yang dinamis?
Array grades ukurannya tetap (5). Solusinya: minta jumlah data dulu lalu buat new 
double[n], atau gunakan ArrayList<Double> agar bisa menambah data tanpa batas tetap.
*/

