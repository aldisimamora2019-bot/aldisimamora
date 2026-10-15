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

public class SisaBagiPangkat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int a = scanner.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int b = scanner.nextInt();

        // Operator % menghasilkan sisa pembagian a oleh b
        int sisaBagi = a % b;

        // Math.pow mengembalikan double, hasil a dipangkatkan b
        double pangkat = Math.pow(a, b);

        System.out.println("Sisa bagi: " + sisaBagi);

        // Dicast ke (int) karena hasil Math.pow untuk bilangan bulat
        // tidak memiliki desimal, sesuai contoh output "343" bukan "343.0"
        System.out.println("Pangkat: " + (int) pangkat);

        scanner.close();
    }
}
