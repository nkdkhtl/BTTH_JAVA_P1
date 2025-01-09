package BT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bai4 {
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("***TINH CV,DT TU GIAC VUONG***");
			System.out.print("Nhap canh thu nhat: ");
			double x = Double.parseDouble(bf.readLine());
			System.out.print("Nhap canh thu hai: ");
			double y = Double.parseDouble(bf.readLine());
			
			System.out.printf("Chu vi cua tu giac vuong: %.2f\n",(x+y)*2);
			System.out.printf("Dien tich cua tu giac vuong: %.2f\n",x*y);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
