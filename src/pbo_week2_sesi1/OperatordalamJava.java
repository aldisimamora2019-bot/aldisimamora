/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_week2_sesi1;

/**
 *
 * @author LENOVO
 */
public class OperatorDemo {
    public static void main(String[] args) {
        // Arithmetic
        int sum = 3 + 4;
        int diff = 10 - 5;
        int prod = 7 * 3;
        double div = 10.0 / 3;
        int rem = 7 % 3;
        System.out.println("Arithmetic: " + sum + ", " + diff + ", " + prod + ", " + div + ", " + rem);

        // Compound Assignment & Math utility
        int x = 10;
        x += 5;
        double p = Math.pow(2, 3);
        double s = Math.sqrt(64);
        System.out.println("x: " + x + ", Pow: " + p + ", Sqrt: " + s);

        // Equality & Relational & Conditional
        int a = 5;
        boolean ok = (a == 5);
        boolean r1 = (5 > 3) && (7 < 10);
        boolean r2 = (5 < 3) || (7 < 10);
        boolean r3 = !(5 > 3);
        System.out.println("Relational/Logical: " + ok + ", " + r1 + ", " + r2 + ", " + r3);

        // Bitwise
        int and = 5 & 3; // 1
        int or = 5 | 3;  // 7
        int xor = 5 ^ 3; // 6
        System.out.println("Bitwise: " + and + ", " + or + ", " + xor);
    }
}
