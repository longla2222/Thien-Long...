package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		 // Nhập số nguyên
        System.out.print("Nhập một số nguyên: ");
        int number = scanner.nextInt();

        // Kiểm tra số nguyên dương hay âm
        if (number > 0) {
            System.out.println("Số này là số nguyên dương.");
        } else if (number < 0) {
            System.out.println("Số này là số nguyên âm.");
        } else {
            System.out.println("Số này là số 0.");
        }
    }
}
