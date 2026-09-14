/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_week2_sesi1;

/**
 *
 * @author LENOVO
 */
public class ArrayMultiDemo {
    public static void main(String[] args) {
        String[][] names = {
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Smith", "Jones"}
        };

        System.out.println(names[0][0] + names[1][0]); // Mr. Smith
        System.out.println(names[0][2] + names[1][1]); // Ms. Jones
    }
}