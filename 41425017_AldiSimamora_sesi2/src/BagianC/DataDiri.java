/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianC;

/**
 *
 * @author LENOVO
 */
/*
NIM: 41425017
Nama: Aldi Simamora
*/

import java.util.Scanner;

public class DataDiri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Semua data diri sekarang diambil dari input Scanner,
        // bukan nilai hardcode seperti sebelumnya
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan umur: ");
        int umur = scanner.nextInt();

        System.out.print("Masukkan tinggi badan (cm): ");
        double tinggi = scanner.nextDouble();

        System.out.print("Apakah anda mahasiswa? (true/false): ");
        boolean isMahasiswa = scanner.nextBoolean();

        System.out.println();
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Tinggi: " + tinggi + " cm");
        System.out.println("Status Mahasiswa: " + isMahasiswa);

        // Casting double ke int untuk melihat efek pembulatan (pemotongan desimal)
        int tinggiBulat = (int) tinggi;
        System.out.println("Tinggi (dibulatkan): " + tinggiBulat + " cm");

        scanner.close();
    }
}
