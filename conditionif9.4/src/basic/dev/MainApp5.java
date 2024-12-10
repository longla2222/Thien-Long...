package basic.dev;

import java.util.Scanner;

public class MainApp5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		 // Nhập ba cạnh a, b, c
        System.out.print("Nhập cạnh a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập cạnh b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập cạnh c: ");
        double c = scanner.nextDouble();

        // Kiểm tra điều kiện của tam giác
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Ba cạnh này tạo thành một tam giác.");
        } else {
            System.out.println("Ba cạnh này không tạo thành một tam giác.");
        }
    }
}
