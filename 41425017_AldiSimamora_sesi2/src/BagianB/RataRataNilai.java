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
 
public class RataRataNilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // Meminta 3 nilai ujian dari pengguna
        System.out.print("Masukkan nilai 1: ");
        double nilai1 = scanner.nextDouble();
 
        System.out.print("Masukkan nilai 2: ");
        double nilai2 = scanner.nextDouble();
 
        System.out.print("Masukkan nilai 3: ");
        double nilai3 = scanner.nextDouble();
 
        // Menghitung total lalu dibagi jumlah nilai untuk mendapatkan rata-rata
        double rataRata = (nilai1 + nilai2 + nilai3) / 3;
 
        // %.2f membulatkan tampilan menjadi 2 angka di belakang koma
        System.out.printf("Rata-rata: %.2f%n", rataRata);
 
        scanner.close();
    }
}
