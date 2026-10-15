package pbo_week_2_sesi_1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class ArrayDemo {
    public static void main(String[] args) {
        // Deklarasi & membuat array
        int[] anArray;
        anArray = new int[10];
        anArray[0] = 100;
        anArray[1] = 200;

        // Shortcut inisialisasi array
        int[] anArray2 = {100, 200, 300, 400};
        System.out.println(anArray2[0]); // 100
        System.out.println(anArray2[1]); // 200

        // Akses semua elemen pakai loop + .length
        for (int i = 0; i < anArray2.length; i++) {
            System.out.println("anArray2[" + i + "] = " + anArray2[i]);
        }

        // Array multidimensi
        String[][] names = {
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Smith", "Jones"}
        };
        System.out.println(names[0][0] + names[1][0]); // Mr. Smith
        System.out.println(names[0][2] + names[1][1]); // Ms. Jones
    }
}