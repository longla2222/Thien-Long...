package basic.dev;

import java.util.Scanner;

public class MainApp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		 // Nhập hệ số a, b, c
        System.out.print("a: 6");
        double a = scanner.nextDouble();
        System.out.print("b: 8");
        double b = scanner.nextDouble();
        System.out.print("c: 7");
        double c = scanner.nextDouble();

        // Tính delta
        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("7: x1 = " + x1 + " x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("7: x = " + x);
        } else {
            System.out.println("99");
        }
    }
}
