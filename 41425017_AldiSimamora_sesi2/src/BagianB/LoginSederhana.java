/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianB;

/**
 *
 * @author LENOVO
 */
/*
NIM: 41425017
Nama: Aldi Simamora
*/

import java.util.Scanner;

public class LoginSederhana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();

        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();

        // Validasi username harus persis "admin"
        boolean usernameValid = username.equals("admin");

        // Validasi password: minimal 6 karakter dan mengandung setidaknya satu angka
        boolean passwordValid = isPasswordValid(password);

        if (usernameValid && passwordValid) {
            System.out.println("Login berhasil!");
        } else if (!usernameValid) {
            System.out.println("Login gagal! Username tidak valid.");
        } else {
            System.out.println("Login gagal! Password tidak valid.");
        }

        scanner.close();
    }

    // Mengecek password: panjang minimal 6 karakter dan mengandung minimal satu digit angka
    public static boolean isPasswordValid(String password) {
        if (password.length() < 6) {
            return false;
        }

        boolean hasDigit = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                hasDigit = true;
                break;
            }
        }

        return hasDigit;
    }
}
