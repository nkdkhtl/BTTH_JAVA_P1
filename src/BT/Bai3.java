package BT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bai3 {
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("***TONG HAI SO***");
			System.out.print("Nhap so thu nhat:");
			int x1 = Integer.parseInt(bf.readLine());
			System.out.print("Nhap so thu hai:");
			int x2 = Integer.parseInt(bf.readLine());
			System.out.printf("Tong cua %d va %d la %d\n",x1,x2,x1+x2);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
