package basic.dev;

import java.util.Scanner;

public class MainApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		  // Nhập số nguyên
        System.out.print("Nhập một số nguyên: ");
        int n = scanner.nextInt();

        // Kiểm tra chia hết cho 3 hoặc 5
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("Số này chia hết cho cả 3 và 5.");
        } else if (n % 3 == 0) {
            System.out.println("Số này chia hết cho 3.");
        } else if (n % 5 == 0) {
            System.out.println("Số này chia hết cho 5.");
        } else {
            System.out.println("Số này không chia hết cho 3 hoặc 5.");
        }
 
    }
}
