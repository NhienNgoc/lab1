
package lap1;
import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập nhiệt độ (°F): ");
        double doFdoF = scanner.nextDouble();
        
        double doCdoC = (doFdoF - 32) / 1.8;
        
        System.out.printf("Nhiệt độ tương ứng: %.2f°C\n", doC);
        
        scanner.close();
    }
}
