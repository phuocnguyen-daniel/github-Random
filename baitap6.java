/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec5random;

import java.util.*;

public class baitap6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int random = rd.nextInt(100) + 1;
        int guess;

        while (true) {
            System.out.print("Nhap so doan (1-100): ");
            guess = sc.nextInt();

            if (guess == random) {
                System.out.println("Chuc mung! Ban doan dung 🎉");
                break;
            } else if (guess < random) {
                System.out.println("Lon hon");
            } else {
                System.out.println("Nho hon");
            }
        }
    }
}