package lap1;
import java.util.Scanner;
public class bai1111 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    public static int daoNguoc( int so){ 
    int soDaoNguoc = 0;

        while (so != 0) {
            int chuSo = so % 10;
            if (soDaoNguoc > Int.MAX_VALUE / 10 || soDaoNguoc < Int.MIN_VALUE / 10) {
                return 0; 
            }
            soDaoNguoc = soDaoNguoc * 10 + chuSo;
            so /= 10;
        }
        return soDaoNguoc;
    }
    
    public static void main(String[] args) {
        int so = 12345;
        System.out.println("Số đảo ngược: " + daoNguoc(so)); 
        Scanner.close();
    }
}
}
