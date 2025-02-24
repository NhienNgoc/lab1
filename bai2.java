package lap1;
import java.util.Scanner;
public class bai2.java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        double chieurong = scanner.nextDouble();
        
        System.out.print("Nhập chiều cao hình chữ nhật: ");
        double chieucao = scanner.nextDouble();
        
        
        double dientich =( chieurong * chieucao );
        
        
        System.out.println("Diện tích hình chữ nhật: " + dientich);
        
        scanner.close();
    }
}
