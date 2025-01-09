package BT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bai1 {
	public static void main(String[] args) {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("***HELLO JAVA***");
			System.out.print("Nhap ten cua ban: ");
			String name = bf.readLine();
			
			System.out.println("Welcome to");
			System.out.println("Java Programming!");
			System.out.println("Program by " + name);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
