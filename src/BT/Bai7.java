package BT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bai7 {
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("***CAC HAM LUONG GIAC***");
			System.out.print("Nhap vao 1 goc: ");
			double angle = (Double.parseDouble(bf.readLine()));
			double radAngle= Math.toRadians(angle);
			
			System.out.printf("Sin(%.2f) = %f\n",angle,Math.sin(radAngle));
			System.out.printf("Cos(%.2f) = %f\n",angle,Math.cos(radAngle));
			System.out.printf("Tan(%.2f) = %f\n",angle,Math.tan(radAngle));
			System.out.printf("Cot(%.2f) = %f\n",angle,1/Math.tan(radAngle));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
