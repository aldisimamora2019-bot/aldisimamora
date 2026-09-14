/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_week2_sesi1;

/**
 *
 * @author LENOVO
 */
interface Operasi {
    int tambah(int a, int b);
}

class Kalkulator implements Operasi {
    @Override
    public int tambah(int a, int b) {
        return a + b;
    }
}

class Demo {
    int a, b;
    Demo(int a, int b) { 
        this.a = a; 
        this.b = b; 
    }
    int addition() { 
        return a + b; 
    }
}

public class NonPrimitiveDemo {
    public static void main(String[] args) {
        // Objek dari Class Demo
        Demo d = new Demo(5, 10);
        System.out.println("Hasil Demo Addition: " + d.addition());

        // Objek dari Interface Kalkulator
        Kalkulator k = new Kalkulator();
        System.out.println("Hasil Kalkulator: " + k.tambah(10, 20));

        // String
        String s1 = "Hello";
        String s2 = new String("Java");
        System.out.println(s1 + " " + s2);
    }
}