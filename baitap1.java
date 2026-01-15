
package lec5random;


import java.util.*;

public class baitap1 {
    public static void main(String[] args) {
        Random rd = new Random();
        int so = rd.nextInt(100) + 1;
        System.out.println("So nguyen ngau nhien (1-100): " + so);
    }
}
