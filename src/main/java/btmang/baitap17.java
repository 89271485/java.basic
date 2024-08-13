/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btmang;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class baitap17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double []a;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("cho biet so phan tu:");
        n = sc.nextInt();
        a = new double [n];
        //Nhap
        nhapMang(a, sc);
        //a.xuat mang ra man hinh
        System.out.println("\nMang so thuc");
        xuatMang(a);
        //b.Tinh tong mang
        double tb = tinhTB(a);
        System.out.print("\nNhap gia tri trung binh" + tb);
        //c.Dem duong le trong mang
        double min = timMin(a);
        System.out.print("\nPhan tu nho nhat:" + min);
    }
    public static void nhapMang(double [] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("Cho biet gia tri a[" + i + "]:");
            a[i] = sc.nextInt();
        }
    }
    public static void xuatMang(double [] a) {
        for (double item : a) {
            System.out.print(item + " ");
        }
    }
    public static int tinhTB (double [] a) {
        double sum = 0;
        for (double x : a) {
            sum += x; //s=s+x;
        }
        double average = sum /a.length;
        return (int) average;
    }
    public static int timMin(double [] a) {

     double min = a[0];
        for (double x : a) {
            if (x > min) {
                min = x;
            }
        }
        return (int) min;
    }
}
