/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cautrucrenhanh;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class BaiTap1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          double  a, b;
          String kq="";
          Scanner sc= new Scanner(System.in);
        //b1. nhap he so a,b;
           System.out.println("==phuong trình bac 1===");
           System.out.print("Cho biet he so a:");
           a = sc.nextDouble();
           System.out.print("cho biet he so b:");
           b = sc.nextDouble();
            //b2 giai phuong trinh
           if(a==0){
           if (b ==0){
            kq="phuong trinh vo so nghiem";
            }else{
              kq="phuong trinh vo nghiem";
            }
          }else{
            kq="phuong trinh có nghiem x =" + (-b/a);
           }
            //b3
             System.out.print(kq);   
    }
    
}
