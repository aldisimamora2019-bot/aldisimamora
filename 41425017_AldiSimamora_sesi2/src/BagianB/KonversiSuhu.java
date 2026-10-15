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

public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Konversi dari Celsius ke Fahrenheit
        System.out.print("Masukkan suhu dalam Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheitHasil = (celsius * 9 / 5) + 32;
        System.out.printf("%.1f C = %.1f F%n", celsius, fahrenheitHasil);

        // Konversi dari Fahrenheit ke Celsius
        System.out.print("Masukkan suhu dalam Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsiusHasil = (fahrenheit - 32) * 5 / 9;
        System.out.printf("%.1f F = %.2f C%n", fahrenheit, celsiusHasil);

        scanner.close();
    }
}
