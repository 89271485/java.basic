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
public class BaiTap2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      double toan,van,anh;
      double dtb;
      
     // buoc1. nhap diem toan, van, anh
     Scanner sc = new Scanner(System.in);
     System.out.println("==phuong trình bac 1===");
           System.out.print("Cho biet diem toan:");
           toan = sc.nextDouble();
           System.out.print("cho biet diem van:");
           van = sc.nextDouble();
           System.out.print("cho biet diem anh:");
           anh = sc.nextDouble();
           //b2.tinh trung binh
           dtb = (toan+van+anh)/3;
           //b3. xet hoc luc
           String kq="";
           if (dtb<4) {
               kq="yeu";
            } else if(dtb<=6.5){
                kq="trung binh";
            }else if(dtb<=8){
                kq="khá";
            }else {
              kq="giỏi";
            }
    
        //b4 xuát ket qua
        System.out.println("DTB:"+dtb +" - hoc luc:"+kq) ;
    }
}
