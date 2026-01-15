/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec5random;

import java.util.*;

public class baitap5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int random = rd.nextInt(10) + 1;
        int count = 0;
        int guess;

        do {
            System.out.print("Nhap so (1-10): ");
            guess = sc.nextInt();
            count++;
        } while (guess != random);

        System.out.println("So ngau nhien la: " + random);
        System.out.println("So lan doan: " + count);
    }
}