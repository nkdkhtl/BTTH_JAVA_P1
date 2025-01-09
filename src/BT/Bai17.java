package BT;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bai17 {
	public static void multiplicationTable(int k) {
		if (k==0) {
			for (int i = 2;i<=9;i++) {
				for(int j = 1;j<=10;j++) {
					System.out.printf("%dx%d=%d\n",i,j,i*j);					
				}
				System.out.printf("\n");
			}
		} else {
			
			for(int j = 1;j<=10;j++) {
				System.out.printf("%dx%d=%d\n",k,j,k*j);					
			}
			System.out.printf("\n");
			
		}
	}
	public static void main(String[] args) {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("NHAP BANG CUU CHUONG");
			System.out.print("Nhap k: ");
			int k = Integer.parseInt(bf.readLine());
			System.out.println("BANG CUU CHUONG");
			multiplicationTable(0);
			System.out.printf("Bang cuu chuong cua %d\n",k);
			multiplicationTable(k);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
