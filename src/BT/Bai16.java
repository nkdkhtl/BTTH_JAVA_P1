package BT;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bai16 {
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("***KIEM TRA DAY TANG DAN HAY GIAM DAN***");
			System.out.print("Nhap n: ");
			int n = Integer.parseInt(bf.readLine());
			int[] arr = new int[n+1];
			for (int i = 0;i<n;i++) {
				System.out.printf("Nhap so thu %d: ",i+1);
				arr[i] = Integer.parseInt(bf.readLine());
			}
			boolean inc = true;
			boolean dec = true;
			for (int i = 0;i<n-1;i++) {
				if (arr[i] > arr[i+1]) {
					inc = false;
				} else  if (arr[i] < arr[i+1]){
					dec = false;
				}
			}
			
			String result = (inc) ? "Day tang dan" : (dec) ? "Day giam dan" : "Khong la day giam hay tang dan";
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
