/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cautrucrenhanh;
import java.util.Scanner;
/**
 *
 * @author HUU LUAN
 */
public class baitap4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int n;
        
        Scanner QN=new Scanner(System.in);
        System.out.println("Tim so chan le");
        System.out.println("Nhap so n:");
        n=QN.nextInt();
        
        if(n%2==0){
            System.out.println("La so chan");
        }else{
            System.out.println("La so le");
            }
    }
    
}
