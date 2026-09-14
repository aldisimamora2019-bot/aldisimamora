/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_week2_sesi1;

/**
 *
 * @author LENOVO
 */
public class ForLoopDemo {
    public static void main(String[] args) {
        // Standard For Loop
        System.out.println("--- Standard For ---");
        for (int k = 1; k <= 5; k++) {
            System.out.println(k);
        }

        // Enhanced For Loop
        System.out.println("--- Enhanced For ---");
        int[] nums = {1, 2, 3, 4, 5};
        for (int n : nums) {
            System.out.println(n);
        }
    }
}