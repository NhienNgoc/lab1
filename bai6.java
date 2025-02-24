package lap1;
import java.util.Scanner;
public class Bai6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập cạnh a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập cạnh b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập cạnh c: ");
        double c = scanner.nextDouble();

        // Kiểm tra tính hợp lệ của tam giác
        // Điều kiện để a, b, c là 3 cạnh của tam giác:
        // 1) a, b, c > 0
        // 2) a + b > c, a + c > b, b + c > a
        if (a > 0 && b > 0 && c > 0 
            && a + b > c 
            && a + c > b 
            && b + c > a) {
            System.out.println("Tam giác hợp lệ.");
        } else {
            System.out.println("Tam giác không hợp lệ.");
        }
        scanner.close();
    }
}
