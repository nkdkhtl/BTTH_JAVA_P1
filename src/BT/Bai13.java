package BT;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bai13 {
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("***GIO PHUT GIAY ***");
			System.out.print("Nhap so giay: ");
			int seconds = Integer.parseInt(bf.readLine());
			int hours = seconds/3600;
			seconds -= hours*3600;
			int minutes = seconds/60;
			seconds -= minutes*60;
			
			System.out.printf("%02d:%02d:%02d",hours,minutes,seconds);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
