package lap1;
import java.util.Scanner;
public class bai8{
public static voi main (string []args){
Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên: ");  
        int n = scanner.nextInt();  

        int chusodautien = Math.abs(n);  
        while (chusodautien >= 10) {  
            chusodautien /= 10;  
        }  

       
        int chusotancung = Math.abs(n) % 10;  

          
        System.out.println("Chữ số đầu tiên: " + chusodautien);  
        System.out.println("Chữ số tận cùng: " + chusotancung);  

         
        scanner.close();  
    }  
}

