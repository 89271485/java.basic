/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vonglap;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class baitap11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        int sodao;
        Scanner sc = new  Scanner(System.in);
        System.out.print("cho biet n:");
        n = sc.nextInt();
        
        sodao= timsodao(n);
        if (sodao==n) {
            System.out.println(n+" la doi xung");
        }else {
            System.out.println(n +"la so khong doi xung");
        }
        
    }
    private static int timsodao(int n){
        int sodao=0;
        while (n>0) {
            sodao = sodao*10 + n%10;
            n = n/10;
        }
        return sodao;
    }
}
