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
public class baitap9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int n;
        int souoc;
        
        Scanner QN=new Scanner(System.in);
        System.out.println("Nhap so n:");
        n=QN.nextInt();
        souoc=0;
        
        for(int i=1;i<=n;i++){
            if(n%i==0){
                souoc++;
            }
        }
        System.out.println("So uoc cua "+n+" la "+souoc);
    }
    
}
