/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec5random;

import java.util.*;
public class baitap2 {
    public static void main(String[] args) {
        Random rd = new Random();
        double so = 1.8 + rd.nextDouble() * (8.0 - 1.8);
        System.out.println("So thuc ngau nhien (1.8 - 8.0): " + so);
    }
}
