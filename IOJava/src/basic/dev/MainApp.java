package basic.dev;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		int a = 10;
		float f = 5.5689f;
//      System.out.format("%s - %d - %.2f", str, a, f).println();
        System.out.println(
        		String.format("%s - %d - %.2f", str, a, f)
        );
      
	}

}
