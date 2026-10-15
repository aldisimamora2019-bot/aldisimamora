/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianB;

/**
 *
 * @author LENOVO
 */
/*
NIM: 41425017
Nama: Aldi Simamora
*/

import java.util.Scanner;

public class KasirSederhana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama barang: ");
        String namaBarang = scanner.nextLine();

        System.out.print("Masukkan harga barang: ");
        double hargaBarang = scanner.nextDouble();

        System.out.print("Masukkan jumlah beli: ");
        int jumlahBeli = scanner.nextInt();

        // Menghitung total belanja sebelum diskon
        double totalBelanja = hargaBarang * jumlahBeli;

        double totalAkhir = totalBelanja;
        double diskon = 0;

        // Jika total belanja mencapai 100.000 atau lebih, berikan diskon 10%
        if (totalBelanja >= 100000) {
            diskon = totalBelanja * 0.10;
            totalAkhir = totalBelanja - diskon;
        }

        System.out.println();
        System.out.println("Barang: " + namaBarang);
        System.out.println("Total belanja: " + totalBelanja);

        if (diskon > 0) {
            System.out.println("Diskon 10%: " + diskon);
            System.out.println("Total setelah diskon: " + totalAkhir);
        } else {
            System.out.println("Tidak mendapat diskon.");
            System.out.println("Total bayar: " + totalAkhir);
        }

        scanner.close();
    }
}
