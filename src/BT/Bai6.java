package BT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bai6 {
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("***GIAI VA BIEN LUAN PHUONG TRINH BAC 2***");
			System.out.print("Nhap a: ");
			double a = Double.parseDouble(bf.readLine());
			System.out.print("Nhap b: ");
			double b = Double.parseDouble(bf.readLine());
			System.out.print("Nhap c: ");
			double c = Double.parseDouble(bf.readLine());
			
			double delta = Math.pow(b, 2) - 4*a*c;
			double x1,x2;
			if (a == 0 && b == 0 && c ==0) {
				System.out.println("Phuong trinh co vo so nghiem");
				return;
			} else if (a == 0 && b != 0 && c != 0) {
				System.out.println("Phuong trinh co 1 nghiem");
				x1 = -c/b;
				System.out.printf("x = %.2f",x1);
				return;
			}
			if (delta>0) {
				System.out.println("Phuong trinh co 2 nghiem phan biet");
				x1 = (-b+Math.sqrt(delta))/(2*a);
				x2 = (-b-Math.sqrt(delta))/(2*a);
				System.out.printf("x1 = %.2f\n",x1);
				System.out.printf("x2 = %.2f\n",x2);
			} else if (delta==0) {
				System.out.println("Phuong trinh co nghiem kep");
				x1 = -b/(2*a);
				x2 = -b/(2*a);
				System.out.printf("x1 = x2 = %.2f\n",x1);
			} else {
				System.out.println("Phuong trinh vo nghiem");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
