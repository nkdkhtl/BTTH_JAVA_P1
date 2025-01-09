package BT;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bai9 {
	public static int factoring(int i) {
		if (i==1 || i == 0) {
			return 1;
		}
		return i*factoring(i-1);			
	}
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("***TINH S cho truoc***");
			System.out.print("Nhap x: ");
			double x = Double.parseDouble(bf.readLine());
			System.out.print("Nhap n: ");
			int n = Integer.parseInt(bf.readLine());
			double S = 0;
			for (int i = 1;i<=n;i++) {
				S+= Math.pow(x, i)/(factoring(i));
			}
			System.out.printf("S(%.0f,%d) = %.3f",x,n,S);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
