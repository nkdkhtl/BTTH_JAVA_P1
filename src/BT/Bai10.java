package BT;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bai10 {
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("***SO CHO SO GA***");
			System.out.print("Nhap tong cho va ga: ");
			int s = Integer.parseInt(bf.readLine());
			System.out.print("Nhap tong so chan: ");
			int chan = Integer.parseInt(bf.readLine());
			int cho = (chan - s*2)/2;
			int ga = s - cho;
			
			System.out.printf("So ga la:%d\n",ga);
			System.out.printf("So cho la:%d\n",cho);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
