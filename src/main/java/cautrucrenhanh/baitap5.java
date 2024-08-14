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
public class baitap5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double SoKm;
        double Tongtien;
        
        Scanner QN=new Scanner(System.in);
        System.out.println("Nhap so Km");
        SoKm=QN.nextDouble();
        
       
         if (SoKm <= 1) {
            Tongtien = SoKm * 15000;
        } else if (SoKm <= 5) {
            Tongtien = 15000 + (SoKm - 1) * 13500;
        } else  {
            Tongtien = 15000 + 4 * 13500 + (SoKm - 5) * 11000;
        }
        
        // Áp dụng giảm giá 10% nếu số km trên 120
        if (SoKm > 120) {
            Tongtien *= 0.9; // giảm 10%
        }
         System.out.println("So tien phai tra la:"+Tongtien+"VNĐ");
    }
    
}
