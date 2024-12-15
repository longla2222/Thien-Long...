package basic.dev;

import java.util.Scanner;

public class MainApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap 1 so nguyen n:");
		int n = sc.nextInt();
		int sum = 0;
		int i = 1;
		
		while ( i < n) {
			if (i % 3 == 0) {
			}
			i++;
		}
		
		System.out.println("Tinh tong so chia het cho 3 be hon" + n + sum);
	}

}
