/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_week2_sesi1;

/**
 *
 * @author LENOVO
 */
public class TypeCastingDemo {
    public static void main(String[] args) {
        // Implicit Casting (Widening)
        int myInt1 = 9;
        double myDouble1 = myInt1;
        System.out.println("Implicit (int ke double): " + myDouble1);

        // Explicit Casting (Narrowing)
        double myDouble2 = 9.78;
        int myInt2 = (int) myDouble2;
        System.out.println("Explicit (double ke int): " + myInt2);
    }
}