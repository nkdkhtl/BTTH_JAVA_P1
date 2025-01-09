package BT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bai2 {
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("GIAI PHUONG TRINH");
			System.out.print("Nhap x: ");
			int x = Integer.parseInt(bf.readLine());
			System.out.printf("y = 2*x = %d\n",2*x);
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
