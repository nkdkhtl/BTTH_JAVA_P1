package BT;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bai18 {
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("***TIM TONG SO LIEN TIEP BANG X***");
			System.out.print("Nhap n: ");
			int n = Integer.parseInt(bf.readLine());
			System.out.print("Nhap x: ");
			double x = Double.parseDouble(bf.readLine());
			double[] arr = new double[n+1];
			for (int i = 0;i<n;i++) {
				System.out.printf("Nhap so thu %d: ",i+1);
				 arr[i] = Double.parseDouble(bf.readLine());
			}
			
			for (int i = 0;i<n-1;i++) {
				 if (arr[i]+arr[i+1]==x) {
					 System.out.printf("%.2f + %.2f = %.2f\n",arr[i],arr[i+1],x);
				 }
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
