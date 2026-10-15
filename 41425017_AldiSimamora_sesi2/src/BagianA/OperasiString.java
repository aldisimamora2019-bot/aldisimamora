/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg41425017_aldisimamora_sesi2;

/**
 *
 * @author LENOVO
 */
/*
NIM: 41425017
Nama: Aldi Simamora
*/
 
import java.util.Scanner;
 
public class OperasiString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama lengkap: ");
        String nama = input.nextLine();
 
        System.out.println("Panjang string: " + nama.length());
        System.out.println("Huruf pertama: " + nama.charAt(0));
        System.out.println("Mengandung spasi? " + nama.contains(" "));
    }
}

// 1. Bagaimana jika nama yang diinput dengan lebih dari satu spasi?
/* .contains(" ") tetap akan menghasilkan true, karena method ini cuma mengecek 
ada atau tidaknya minimal satu spasi — tidak peduli berapa jumlahnya. Jadi baik
nama dengan satu spasi ("Ahmad Sahroni") maupun banyak spasi ("Ahmad Sahroni Uya")
hasilnya sama-sama true. */
