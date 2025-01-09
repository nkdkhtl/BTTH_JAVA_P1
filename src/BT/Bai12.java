package BT;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bai12 {
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("***TINH CV,DT HINH TRON***");
			System.out.print("Nhap ban kinh R: ");
			double R = Double.parseDouble(bf.readLine());
			double chuvi = 2*Math.PI*R;
			double dientich = Math.PI*R*R;
			System.out.printf("Chu vi hinh tron la %.2f\n",chuvi);
			System.out.printf("Dien tich hinh tron la %.2f\n",dientich);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
