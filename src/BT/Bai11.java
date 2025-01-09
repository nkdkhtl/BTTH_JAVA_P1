package BT;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bai11 {
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("***TINH DIEN TICH HINH THANG***");
			System.out.print("Nhap day lon a: ");
			double a = Double.parseDouble(bf.readLine());
			System.out.print("Nhap day nho b: ");
			double b = Double.parseDouble(bf.readLine());
			System.out.print("Nhap chieu cao h: ");
			double h = Double.parseDouble(bf.readLine());
			
			double S = ((a+b)*h)/2.0;
			System.out.printf("Dien tich hinh thang la %.2f",S);
		} catch(Exception e) {
			e.printStackTrace();
		}
 	}
}
