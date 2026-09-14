/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_week2_sesi1;

/**
 *
 * @author LENOVO
 */
public class Array1DDemo {
    public static void main(String[] args) {
        // Deklarasi dan Alokasi
        int[] anArray = new int[10];
        anArray[0] = 100;
        anArray[1] = 200;

        // Shortcut Inisialisasi
        int[] anArrayShortcut = {100, 200, 300, 400};

        System.out.println("Elemen anArray 0: " + anArray[0]);
        System.out.println("Elemen anArray 1: " + anArray[1]);
        System.out.println("Elemen Shortcut 0: " + anArrayShortcut[0]);
        System.out.println("Elemen Shortcut 1: " + anArrayShortcut[1]);
    }
}
