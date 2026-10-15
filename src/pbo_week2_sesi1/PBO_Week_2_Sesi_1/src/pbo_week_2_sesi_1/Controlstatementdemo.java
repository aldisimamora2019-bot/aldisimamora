/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_week_2_sesi_1;

/**
 *
 * @author LENOVO
 */
public class ControlStatementDemo {
    public static void main(String[] args) {

        // ---------- If-Then & If-Then-Else ----------
        int age = 20;
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        }

        int age2 = 15;
        if (age2 >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        int marks = 75;
        if (marks >= 85) {
            System.out.println("Grade A");
        } else if (marks >= 70) {
            System.out.println("Grade B");
        } else {
            System.out.println("Grade C");
        }

        // ---------- Switch Statement ----------
        int month = 8;
        String name;
        switch (month) {
            case 1: name = "January"; break;
            case 8: name = "August"; break;
            default: name = "Invalid"; break;
        }
        System.out.println("Bulan: " + name);

        // ---------- While & Do-While ----------
        System.out.println("While loop:");
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        System.out.println("Do-while loop:");
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= 5);

        // ---------- For & Enhanced For ----------
        System.out.println("For loop:");
        for (int k = 1; k <= 5; k++) {
            System.out.println(k);
        }

        System.out.println("Enhanced for:");
        int[] nums = {1, 2, 3, 4, 5};
        for (int n : nums) {
            System.out.println(n);
        }

        // ---------- Branching: break (unlabeled) ----------
        int[] arr = {32, 87, 3, 589, 12};
        int target = 12;
        int idx = -1;
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] == target) {
                idx = k;
                break;
            }
        }
        System.out.println("Index target ditemukan di: " + idx);

        // ---------- Branching: break berlabel ----------
        int[][] matrix = {{1, 2}, {3, 12}, {5, 6}};
        boolean found = false;
        search:
        for (int m = 0; m < matrix.length; m++) {
            for (int n = 0; n < matrix[m].length; n++) {
                if (matrix[m][n] == target) {
                    found = true;
                    break search;
                }
            }
        }
        System.out.println("Ditemukan di matrix? " + found);

        // ---------- Branching: continue ----------
        int count = 0;
        String s = "peter piper picked";
        for (int k = 0; k < s.length(); k++) {
            if (s.charAt(k) != 'p') continue;
            count++;
        }
        System.out.println("Jumlah huruf p: " + count);

        // ---------- Branching: return (dipanggil lewat method lain) ----------
        System.out.println("Hasil cekPositif(-5): " + cekPositif(-5));
        System.out.println("Hasil cekPositif(5): " + cekPositif(5));
    }

    static String cekPositif(int x) {
        if (x < 0) return "Negatif";
        return "Positif";
    }
}
