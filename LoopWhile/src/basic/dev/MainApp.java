package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int tong = 0;
		while(i <= 100) {
		i++;
			tong += i; tong = tong + i;
			System.out.println(i);
			
		}
		System.out.println("Tong"  + tong);
	}
}
