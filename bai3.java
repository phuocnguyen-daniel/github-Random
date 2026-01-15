
package lec5random;

import java.util.*;

public class bai3 {
    public static void main(String[] args) {
        Random rd = new Random();
        int so = rd.nextInt(80 - 3 + 1) + 3;
        System.out.println("So ngau nhien: " + so);

        if (so % 2 == 0) {
            System.out.println("Day la so chan");
        } else {
            System.out.println("Day la so le");
        }
    }
}
