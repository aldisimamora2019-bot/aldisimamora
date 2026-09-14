/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_week2_sesi1;

/**
 *
 * @author LENOVO
 */
public class BranchingDemo {
    public static void main(String[] args) {
        // Unlabeled Break
        int[] a = {32, 87, 3, 589, 12};
        int target = 12;
        int idx = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                idx = i;
                break;
            }
        }
        System.out.println("Target ditemukan di indeks: " + idx);

        // Labeled Break
        int[][] m = {{1, 2}, {3, 12}};
        boolean found = false;
        search:
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == target) {
                    found = true;
                    break search;
                }
            }
        }
        System.out.println("Status pencarian berlabel: " + found);

        // Continue
        int count = 0;
        String s = "Peter piper picked a peck of pickled peppers";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'p') continue;
            count++;
        }
        System.out.println("Jumlah huruf 'p': " + count);
    }
}