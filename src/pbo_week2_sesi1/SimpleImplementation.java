/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_week2_sesi1;

/**
 *
 * @author LENOVO
 */
public class SimpleImplementation {
    public static void main(String[] args) {
        int[] nilai = {80, 90, 75, 88};
        int total = 0;

        // Enhanced for loop (for-each)
        for (int n : nilai) {
            total += n;
        }

        // Explicit casting ke double
        double rata = (double) total / nilai.length;
        System.out.println("Rata-rata = " + rata);
    }
}
