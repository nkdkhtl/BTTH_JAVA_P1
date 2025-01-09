package BT;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bai8 {
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try {
			
			System.out.println("***TINH DIEN TINH TAM GIAC***");
			System.out.print("Nhap canh a:");
			double a = Double.parseDouble(bf.readLine());
			System.out.print("Nhap canh b:");
			double b = Double.parseDouble(bf.readLine());
			System.out.print("Nhap canh c:");
			double c = Double.parseDouble(bf.readLine());
			
			double p = (a+b+c)/2;
			if (p*(p-a)*(p-b)*(p-c) > 0) {
				double dt = Math.sqrt(p*(p-a)*(p-b)*(p-c));
				System.out.printf("Dien tich cua tam giac la %.2f",dt);
			} else {
				System.out.println("Khong tao thanh tam giac");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
