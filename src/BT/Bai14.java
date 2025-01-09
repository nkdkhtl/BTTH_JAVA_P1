package BT;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bai14 {
	public static void printEven(int n) {
		int counter = 1;
		for (int i = 1;i<n;i+=2) {
			System.out.printf("%d ",i);
			counter++;
			if (counter==10) {
				System.out.printf("\n");
				counter = 1;
			}
		}
		
	}
	
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("***IN SO LE DUOI N***");
			System.out.print("Nhap so n: ");
			int n = Integer.parseInt(bf.readLine());
			printEven(n);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
