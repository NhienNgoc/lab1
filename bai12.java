    package lap1;
    import java.util.Scanner;
    public class bai12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số: ");
        int so = scanner.nextInt();
        // Hàm kiểm tra số đối xứng
        public static boolean kiemTraSoDoiXung(int n) {
        int goc = n;
        int daoNguoc = 0;
        // Dùng biến tạm để thao tác với giá trị tuyệt đối của n (để xử lý số âm)
        int temp = Math.abs(n);
        // Vòng lặp đảo ngược số
        while (temp != 0) {
            int soDu = temp % 10;          // Lấy chữ số cuối
            daoNguoc = daoNguoc * 10 + soDu; // Xây dựng số đảo ngược
            temp /= 10;                    // Loại bỏ chữ số cuối vừa xử lý
        }
        // So sánh số đảo ngược với giá trị tuyệt đối của số ban đầu
        return daoNguoc == Math.abs(goc);
        }
        
        if (kiemTraSoDoiXung(so)) {
            System.out.println(so + " là số đối xứng.");
        } else {
            System.out.println(so + " không phải là số đối xứng.");
        }
        scanner.close();
    }
}
