/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01;

/**
 *
 * @author Administrator
 */
import java.io.*;
import java.util.*;
import java.math.*;
import static lab01.bai6.songuyento;

public class Lab01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Chao cac ban");
        System.out.println("HELLO! I'm Nguyen Tan Thuan");
        System.out.println("This is my first java program");
    }   
}
class bai3
{
    public static void main (String[] arg)
    {
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien:");
        String masv = x.nextLine();
        
        System.out.print("Nhap ho ten sinh vien:");
        String hoten = x.nextLine();
        
        System.out.print("Nhap tuoi:");
        byte tuoi= x.nextByte();
        
        System.out.print("Nhap nam sinh:");
        int namsinh= x.nextInt();    
        
        System.out.print("Nhap diem trung binh:");
        float dtb= x.nextFloat();  
    }
}
class bai4
{
    public static void main (String[] arg)
    {
        Scanner n = new Scanner(System.in);
        System.out.print("Nhap x:");
        int x= n.nextInt(); 
        
        System.out.print("Nhap y:");
        int y= n.nextInt();
        
        int cong=x+y;
        int tru=x-y;
        int nhan=x*y;
        float chia=(float)x/y;
        System.out.print("x+y:"+cong);
        System.out.print("\nx-y:"+tru);
        System.out.print("\nx*y:"+nhan);
        System.out.print("\nx/y:"+chia);        
    }
}
class bai5
{
    public static void main (String[] arg)
    {
        Scanner n = new Scanner(System.in);
        System.out.print("Nhap a:");
        int a= n.nextInt(); 
        
        System.out.print("Nhap b:");
        int b= n.nextInt();
        
        System.out.println("USCLN của " + a + " và " + b + " là: " + USCLN(a, b));
        System.out.println("BSCNN của " + a + " và " + b + " là: " + BSCNN(a, b));
    }
      public static int USCLN(int a, int b) {
        int x = a;
        int y = b;
        while (x != y)
        {
            if (x > y)
            {
                x -= y;
            } 
            else 
            {
                y -= x;
            }
        }
        int uscln = x;
        return uscln;
    }

    public static int BSCNN(int a, int b) {
        return (a * b) / USCLN(a, b);
    }
}
class bai6
{
    public static void main (String[] arg)
    {
        Scanner n = new Scanner(System.in);
        System.out.print("Nhap n:");
        int a= n.nextInt();
        System.out.print("Cac so nguyen to nho hon "+a+":");      
        for (int i = 0; i < a; i++) {
            if (songuyento(i)) {
                System.out.print(i + " ");
            }
        }
    }
    
    public static boolean songuyento(int n)
    {
        if(n<2)
        {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for(int i=2;i<=squareRoot;i++)
        {
            if(n%i == 0) 
            {
                return false;
            }
        }
        return true;
    }
}
class bai7
{  
    public static void main(String[] args) {
        int[] a;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n: ");
        n = scanner.nextInt();
        /*khởi tạo mảng
         */
        a = new int[n];
        nhap(a,n);
        System.out.print("Xuat mang: ");
        xuat(a,n);
        
        System.out.print("Cac so nguyen to la: ");
        for (int i=0;i<n;i++) {
            if (nguyento(a[i])  )
                System.out.print(a[i] + " ");
        }
        System.out.println("");
        System.out.println("Max: " + max(a,n));

        System.out.print("Sap xep theo thu tu tang dan: ");
        sapxep(a,n);
        xuat(a,n);
    }
    public static void nhap(int a[],int n){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap vao mang: ");
        for (int i=0;i<n;i++)
            a[i] = scanner.nextInt();
    }
    public static void xuat(int a[],int n){
        for (int i=0;i<n;i++)
            System.out.print(a[i] + " ");
        System.out.println("");
    }
    public static int max(int a[],int n){
        int max = a[0];
        for (int i=1;i<n;i++){
            if (a[i] > max)
                max = a[i];
        }
        return max;
    }
    public static boolean nguyento(int n){
        if(n<=1) return false;
        for (int i = 2;i<= Math.sqrt(n); i++)
        {
            if(n%i==0) 
            return false;
        }
        return true;
    }
 
    public static void sapxep(int a[],int n){
        for (int i =0;i<n;i++)
            for (int j=0;j<n-1;j++){
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
    }
}