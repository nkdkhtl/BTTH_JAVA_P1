package GUI;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import BT.Bai1;
import BT.Bai10;
import BT.Bai11;
import BT.Bai12;
import BT.Bai13;
import BT.Bai14;
import BT.Bai15;
import BT.Bai16;
import BT.Bai17;
import BT.Bai18;
import BT.Bai2;
import BT.Bai3;
import BT.Bai4;
import BT.Bai5;
import BT.Bai6;
import BT.Bai7;
import BT.Bai8;
import BT.Bai9;

public class GUI {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int k = 0;
        do {
            try {
                System.out.print("\nChon bai tap muon chay(1->18, 0 to exit): ");
                k = Integer.parseInt(bf.readLine());

                switch (k) {
                    case 1:
                        Bai1.main(null);
                        break;
                    case 2:
                        Bai2.main(null);
                        break;
                    case 3:
                        Bai3.main(null);
                        break;
                    case 4:
                        Bai4.main(null);
                        break;
                    case 5:
                        Bai5.main(null);
                        break;
                    case 6:
                        Bai6.main(null);
                        break;
                    case 7:
                        Bai7.main(null);
                        break;
                    case 8:
                        Bai8.main(null);
                        break;
                    case 9:
                        Bai9.main(null);
                        break;
                    case 10:
                        Bai10.main(null);
                        break;
                    case 11:
                        Bai11.main(null);
                        break;
                    case 12:
                        Bai12.main(null);
                        break;
                    case 13:
                        Bai13.main(null);
                        break;
                    case 14:
                        Bai14.main(null);
                        break;
                    case 15:
                        Bai15.main(null);
                        break;
                    case 16:
                        Bai16.main(null);
                        break;
                    case 17:
                        Bai17.main(null);
                        break;
                    case 18:
                        Bai18.main(null);
                        break;
                    case 0:
                        System.out.println("Thoat chuong trinh!");
                        break;
                    default:
                        System.out.println("Hay chon tu 1->18, hoac 0 de thoat");
                }
            } catch (Exception e) {
            	e.printStackTrace();
            }
        } while (k != 0);
    }
}
