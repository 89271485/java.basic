/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btmang;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author ADMIN
 */
public class baitap19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int []a;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("cho biet so phan tu:");
        n = sc.nextInt();
        a = new int [n];
        //Nhap
        phatSinhMang(a);
        //a.xuat mang ra man hinh
        System.out.println("\nMang a:");
        xuatMang(a);
        
        sapXepTang(a);
        System.out.print("\nMang sap xep:");
        xuatMang(a);
        System.out.print("\nSo nguyen x:");
        int x = sc.nextInt();
        System.out.print("\nPhan tu la uoc so cua x:");
        lienKetUocSo(a, x);
    }
    public static void  phatSinhMang(int[] a) {
        Random rd = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rd.nextInt(50);
            
        }
    }
    public static void xuatMang(int[] a) {
        for (int x : a) {
            System.out.print(x + " ");
            
        }
    }
    public static void sapXepTang(int[] a) {
        Arrays.sort(a);
    }
    public static void lienKetUocSo(int[] a, int x) {
        for (int item  : a) {
            if (item>0 && item>0) {
            System.out.print(item + " ");
        }
        }
    }
}
