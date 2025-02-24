package lap1;
import java.util.Scanner;
public class Bai9{
public static void main(String[] args) {
    // Hàm tính tổng các chữ số bằng đệ quy
    public static int tongChuSo(int so) {
        if (so == 0) 
        return 0;
        return (so % 10) + tongChuSo(so / 10);
    }

    // Hàm tính tích bằng đệ quy
    public static int tichChuSo(int so) {
        if (so == 0) return 1;
        return (so % 10) * tichChuSo(so / 10);
    }
        System.out.println("Tổng các chữ số: " + tongChuSo);
        System.out.println("Tích các chữ số: " + tichChuSo);
    }
}

