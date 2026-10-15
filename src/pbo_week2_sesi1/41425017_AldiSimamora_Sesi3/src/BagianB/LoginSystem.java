/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagianB;

/**
 *
 * @author LENOVO
 */

// Nama : Aldi Simamora
// NIM : 41425017

import java.util.Scanner;
 
public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // Username dan password yang dianggap benar (akun "terdaftar")
        String correctUsername = "admin";
        String correctPassword = "password123";
 
        int attempts = 0;
        int maxAttempts = 3;
        boolean loginSuccess = false;
 
        System.out.println("=== Sistem Login ===");
 
       
        while (attempts < maxAttempts && !loginSuccess) {
            attempts++;
            System.out.println("Percobaan " + attempts + ":");
 
            System.out.print("Username: ");
            String username = scanner.nextLine();
 
            System.out.print("Password: ");
            String password = scanner.nextLine();
 
            
            boolean usernameValid = (username.length() >= 5 && username.length() <= 10);
 
           
            boolean passwordFormatValid = isPasswordFormatValid(password);
 
            
            if (!usernameValid) {
                System.out.println("Login gagal! Username harus antara 5-10 karakter.");
            } else if (!passwordFormatValid) {
                System.out.println("Login gagal! Password harus minimal 8 karakter dan mengandung angka.");
            } else {
                
                if (username.equals(correctUsername) && password.equals(correctPassword)) {
                    System.out.println("Login berhasil!");
                    loginSuccess = true;
                } else {
                    System.out.println("Login gagal! Password salah.");
                }
            }
 
            System.out.println(); // baris kosong pemisah antar percobaan
        }
 
       
        if (!loginSuccess) {
            System.out.println("Akun terkunci! Terlalu banyak percobaan gagal.");
        }
 
        scanner.close();
    }
 
    
    public static boolean isPasswordFormatValid(String password) {
        if (password.length() < 8) {
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
