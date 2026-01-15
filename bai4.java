/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec5random;

import java.util.*;

public class bai4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.print("Nhap so thuc (1-100): ");
        double user = sc.nextDouble();

        double random = 1.0 + rd.nextDouble() * 99.0;
        System.out.println("So ngau nhien: " + random);

        if (user > random) {
            System.out.println("So ban nhap LON hon so ngau nhien");
        } else if (user < random) {
            System.out.println("So ban nhap NHO hon so ngau nhien");
        } else {
            System.out.println("Hai so BANG nhau");
        }
    }
}