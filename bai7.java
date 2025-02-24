package lap1;
import java.util.Scanner;
public class bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập điểm Vật lý: ");
        double ly = scanner.nextDouble();
        
        System.out.print("Nhập điểm Hóa học: ");
        double hoa = scanner.nextDouble();
        
        System.out.print("Nhập điểm Sinh học: ");
        double sinh = scanner.nextDouble();
        
        System.out.print("Nhập điểm Toán: ");
        double toan = scanner.nextDouble();
        
        System.out.print("Nhập điểm Máy tính: ");
        double mayTinh = scanner.nextDouble();
        
        // Tổng điểm tối đa có thể đạt được (giả sử mỗi môn tối đa 100 điểm)
        double tongDiemToiDa = 500.0;
        
        // Tính tổng điểm và tỷ lệ phần trăm
        double tongDiem = ly + hoa + sinh + toan + mayTinh;
        double tyLePhanTram = (tongDiem / tongDiemToiDa) * 100;
        
        String hang;
        if (tyLePhanTram > 90) {
            hang = "A";
        } else if (tyLePhanTram > 80) {
            hang = "B";
        } else if (tyLePhanTram > 70) {
            hang = "C";
        } else if (tyLePhanTram > 60) {
            hang = "D";
        } else if (tyLePhanTram > 40) {
            hang = "E";
        } else {
            hang = "F";
        }
        
        System.out.println("Tổng điểm: " + tongDiem);
        System.out.printf("Tỷ lệ phần trăm: %.2f%%\n", tyLePhanTram);
        System.out.println("Hạng: " + hang);
        
        scanner.close();
    }
}
