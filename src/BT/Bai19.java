package BT;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bai19 {
	public static boolean isPerfectNum(double num) {
		if (num<1) return false;
		double sum = 0;
		for (int i = 1;i<=num/2;i++) {
			sum+=i;
		}
		return sum == num;
	}
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("***TIM TONG SO HOAN HAO***");
			System.out.print("Nhap n: ");
			int n = Integer.parseInt(bf.readLine());
			System.out.print("Nhap x: ");
			double x = Double.parseDouble(bf.readLine());
			double[] arr = new double[n+1];
			for (int i = 0;i<n;i++) {
				System.out.printf("Nhap so thu %d: ",i+1);
				 arr[i] = Double.parseDouble(bf.readLine());
			}
			 System.out.println("Cac phan tu la so hoan hao trong mang:");
			for (double value :arr) {
				if (value == (int) value && isPerfectNum((int) value)) {
	                System.out.print((int) value + " ");
	            }
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
