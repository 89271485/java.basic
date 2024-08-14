/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vonglap;
import java.util.Scanner;
/**
 *
 * @author HUU LUAN
 */
public class baitap8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int n;
       int tong;
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so n:");
        n=sc.nextInt();
        
        tong=0;
        
        for(int i=1;i<=n;i++){
            tong+=i;
        }
 System.out.println("Tổng các số nguyên từ 1 đến " +n  + " là: " + tong);
             
    }
    
}
