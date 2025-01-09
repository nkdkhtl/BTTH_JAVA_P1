package BT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bai5 {
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("***GIAI PT BAC 1***");
			System.out.print("Nhap so thu nhat: ");
			double a = Double.parseDouble(bf.readLine());
			System.out.print("Nhap so thu hai: ");
			double b = Double.parseDouble(bf.readLine());
			
			if (a==0 && b==0) {
				System.out.println("Phuong trinh co vo so nghiem");
			} else if (a==0 && b != 0) {
				System.out.println("Phuong trinh vo nghiem");
			} else {
				System.out.printf("Phuong trinh co 1 nghiem duy nhat: %.2f",-b/a);
			}
			System.out.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
