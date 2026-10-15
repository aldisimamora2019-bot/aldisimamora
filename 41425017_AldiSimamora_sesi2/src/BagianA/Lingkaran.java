/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianA;

/**
 *
 * @author LENOVO
 */

/*
NIM: 41425017
Nama: Aldi Simamora
*/

import java.util.Scanner;
 
public class Lingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PI = 3.14;
 
        System.out.print("Masukkan jari-jari: ");
        double r = input.nextDouble();
 
        if (r < 0) {
            System.out.println("Error: jari-jari tidak boleh negatif.");
        } else {
            double luas = PI * r * r;
            double keliling = 2 * PI * r;
            System.out.println("Luas: " + luas);
            System.out.println("Keliling: " + keliling);
        }
    }
}

 // 1.Mengapa kita perlu validasi r < 0?
/* Karena secara fisik/matematis, jari-jari lingkaran tidak mungkin bernilai 
negatif. Tanpa validasi, program tetap akan menghitung luas dan keliling dengan
angka negatif, menghasilkan output yang tidak masuk akal (misalnya luas negatif),
padahal user jelas salah input. */

// 2.Dalam aplikasi nyata, di mana validasi input sangat penting?
/*  Form pendaftaran (validasi umur tidak boleh negatif), sistem perbankan(validasi 
jumlah transfer tidak boleh negatif/nol), sistem kasir (validasi jumlah barang tidak
boleh negatif), dan input data medis ( validasi berat/tinggi badan pasien).
*/