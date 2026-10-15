/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_week_2_sesi_1;

/**
 *
 * @author LENOVO
 */
public class OOPRunner {
    public static void main(String[] args) {
        // Memanggil class Demo
        Demo demo = new Demo(5, 3);
        System.out.println("Hasil Demo.addition(): " + demo.addition());

        // Memanggil class Kalkulator (implementasi interface Operasi)
        Kalkulator kalkulator = new Kalkulator();
        System.out.println("Hasil Kalkulator.tambah(): " + kalkulator.tambah(10, 20));
    }
}
