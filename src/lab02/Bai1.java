/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai1 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner x =  new Scanner(System.in);
      System.out.print("Nhập hệ số bậc 2, a = ");
      // declare a is a parameter
        float a = Bai1.scanner.nextFloat();
        System.out.print("Nhập hệ số bậc 1, b = ");
      // declare b is a parameter
        float b = Bai1.scanner.nextFloat();
        System.out.print("Nhập hằng số tự do, c = ");
      // declare c is a parameter
        float c = Bai1.scanner.nextFloat();
        Bai1.giaiPTBac2(a, b, c);
    }
     
    public static void giaiPTBac2(float a, float b, float c) {
        // check parameter
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-c / b));
            }
            return;
        }
        // count delta
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        // count nghiệm
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
}
