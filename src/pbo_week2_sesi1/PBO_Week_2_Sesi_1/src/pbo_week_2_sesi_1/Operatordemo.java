/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_week_2_sesi_1;

/**
 *
 * @author LENOVO
 */
public class OperatorDemo {
    public static void main(String[] args) {
        // Arithmetic Operators
        int sum = 3 + 4;      // 7
        int diff = 10 - 3;    // 7
        int prod = 7 * 3;     // 21
        double q = 20.0 / 3;  // 6.666...
        int r = 7 % 3;        // 1
        System.out.println("sum=" + sum + " diff=" + diff + " prod=" + prod + " q=" + q + " r=" + r);

        // Compound assignment
        int x = 10;
        x += 5; // x = 15
        System.out.println("x setelah += 5 : " + x);

        // Dampak tipe data pada pembagian
        double d = 10.0 / 3;  // 3.333...
        int i = 10 / 3;       // 3 (truncation)
        System.out.println("d=" + d + " i=" + i);

        // Math utility
        double p = Math.pow(2, 3); // 8.0
        double s = Math.sqrt(64);  // 8.0
        System.out.println("p=" + p + " s=" + s);

        // Equality & Relational Operators
        int a = 5;
        boolean ok = (a == 5); // true
        System.out.println("ok=" + ok);

        // Conditional Operators (&&, ||, !)
        boolean r1 = (5 > 3) && (7 < 10); // true
        boolean r2 = (5 < 3) || (7 < 10); // true
        boolean r3 = !(5 > 3);            // false
        System.out.println("r1=" + r1 + " r2=" + r2 + " r3=" + r3);

        // Bitwise Operators
        int and = 5 & 3; // 1
        int or  = 5 | 3; // 7
        int xor = 5 ^ 3; // 6
        System.out.println("and=" + and + " or=" + or + " xor=" + xor);
    }
}
