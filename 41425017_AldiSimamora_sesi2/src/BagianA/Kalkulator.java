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
    }
}

// 1. Mengapa pembagian in perlu di casting ke double?
/*=>Karen kalau dua-duanya int.Java melakukan pembagian bilangan bulat yang membuang
sisa desimalnya. Contoh:7/2 hasilnya 3, bukan 3.5. Dengan casting salah satu operand
ke double, Java otomatis melakukan pembagian desimal sehingga hasilnya akurat.*/

// 2. Apa resiko jika pembagi = 0?
/* Resiko tergantung apakah pembagiannya dilakukan dalam bentuk int atau double.*/

