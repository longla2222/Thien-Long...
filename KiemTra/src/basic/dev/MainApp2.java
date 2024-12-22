package basic.dev;

import java.util.Scanner;

public class MainApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Nhap n");
		n =sc.nextInt();
		if(n % 2 == 0) {
			System.out.println("So le");
		}else {
			System.out.println("So chan");
		}
	}
}
