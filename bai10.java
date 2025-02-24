package lap1;
import java.util.Scanner;
public class bai10{
public static int countDigits(double number) {
        number = Math.abs(number); // Đảm bảo số không âm
        
        String numStr = String.valueOf(number);
        numStr = numStr.replace(".", ""); // Loại bỏ dấu chấm thập phân nếu có
        
        return numStr.length(); // trả về số, chữ sốsố
    }
        double num = 12345.67;
        public static void main(String[] args) {
        System.out.println("Số chữ số trong " + num + " là: " + countDigits(num));
        scanner.close();
    }

}