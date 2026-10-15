package pbo_week_2_sesi_1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class CastingDemo {
    public static void main(String[] args) {
        // Implicit casting (widening) - aman, otomatis
        int myInt = 9;
        double myDouble = myInt; // otomatis
        System.out.println("Implicit: int " + myInt + " -> double " + myDouble);

        // Explicit casting (narrowing) - manual, berisiko kehilangan data
        double myDouble2 = 9.78;
        int myInt2 = (int) myDouble2; // hasil 9, .78 hilang
        System.out.println("Explicit: double " + myDouble2 + " -> int " + myInt2);
    }
}
