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
public class baitap7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double thang, nam;
        double songay;
        Scanner sc = new Scanner(System.in);
        //b1 doc thang, nam thu nguoi dung
        System.out.println("=====CHUONG TRINH TINH SO NGAY CUA THANG===");
        System.out.print("cho biet thang:");
        thang = sc.nextInt();
        System.out.print("cho biet nam:");
        nam = sc.nextInt();
        //b2 xet thang cua nam de tinh so ngay
        if (thang==1 || thang==3 || thang==5|| thang== 7 || thang==8 ||thang==10 || thang ==12) {
            songay=31;
        } else if (thang==4 || thang==6 || thang==9 || thang==11) {
              songay=30;
        }else {
            if(nam%4==0) {
                songay=29;
            }else {
                songay=28;
            }
        }

        //b3 xuat ket qua
        System.out.print("thang " + thang +" co "+ songay + " songay ");
    }
    
}
