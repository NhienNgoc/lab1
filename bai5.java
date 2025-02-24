package lap1;
import java.util.Scanner;
public class Bai5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        int a = scanner.nextInt();
        
        System.out.print("Nhập số thứ hai: ");
        int b = scanner.nextInt();
        
        System.out.print("Nhập số thứ ba: ");
        int c = scanner.nextInt();

        int soNhoNhat;
        if (a <= b && a <= c) {
            soNhoNhat = a;
        } else if (b <= a && b <= c) {
            soNhoNhat = b;
        } else {
            soNhoNhat = c;
        }
        System.out.println("Số nhỏ nhất là: " + soNhoNhat);
        scanner.close();
    }
}

