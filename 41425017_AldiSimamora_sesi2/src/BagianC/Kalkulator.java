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

public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt();

        System.out.println("Tambah: " + (a + b));
        System.out.println("Kurang: " + (a - b));
        System.out.println("Kali: " + (a * b));
        System.out.println("Bagi: " + ((double) a / b));

        // Tambahan: modulus (sisa bagi)
        System.out.println("Modulus: " + (a % b));

        // Tambahan: perpangkatan a^b, dicast ke int karena hasil Math.pow
        // untuk bilangan bulat tidak memiliki desimal
        double pangkat = Math.pow(a, b);
        System.out.println("Pangkat: " + (int) pangkat);

        input.close();
    }
}
