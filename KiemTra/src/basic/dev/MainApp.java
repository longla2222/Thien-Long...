package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int rong;
		int dai;
		System.out.println("Nhap chieu rong");
		rong = sc.nextInt();
		
		System.out.println("Nhap chieu dai ");
		dai = sc.nextInt();
		
		int dienTich = dai * rong;
		int chuVi = (dai + rong);
		
		System.out.println("Dien tich" + dienTich);
		System.out.println("Chu Vi" + dienTich);

	}

}
