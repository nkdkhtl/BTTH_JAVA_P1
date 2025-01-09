package BT;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bai15 {
	public static void main(String[] args) {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("***DANH GIA HOC LUC***");
			double diem=-1;
			do {
				System.out.print("Nhap diem (0<=x<=10): ");				
				diem = Double.parseDouble(bf.readLine());				
			} while(diem<0 ||diem>10);
			
			if (diem<5) {
				System.out.println("Hoc luc Yeu");
			} else if (diem >=5 && diem<6) {
				System.out.println("Hoc luc Trung binh");
			} else if (diem >=6 && diem<7) {
				System.out.println("Hoc luc Trung binh kha");
			} else if (diem >=7 && diem<8) {
				System.out.println("Hoc luc Kha");
			} else if (diem >=8 && diem<9) {
				System.out.println("Hoc luc Gioi");
			} else {
				System.out.println("Hoc luc Xuat sac");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	
	
	}

}
