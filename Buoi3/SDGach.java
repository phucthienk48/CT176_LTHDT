package Buoi3;

import java.util.Scanner;

public class SDGach {
	public static void main(String args[]) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong cac loai gach: ");
		n = sc.nextInt();
		Gach gach[] = new Gach[n];
		for(int i=0;i<n;i++) {
			gach[i] = new Gach();	
			System.out.println("------");
			System.out.println("Nhap thong tin vien gach "+ (i+1)+": ");
			gach[i].nhap();
		}
		System.out.println("---******************---");
		System.out.println("Danh sach gach vua nhap: ");
		for(int i=0;i<n;i++)
			gach[i].in();
		System.out.println("---******************---");
		double giaThapNhat=gach[0].giaHopGach()/gach[0].maxArea();
		int loaiGachRe = 0;
		for(int i=0;i<n;i++) {
			if(gach[i].giaHopGach()/gach[i].maxArea() < giaThapNhat) {
				giaThapNhat = gach[i].giaHopGach()/gach[i].maxArea();
				loaiGachRe = i;
			}
		}
		System.out.println("Loai gach co chi phi re nhat: ");
		gach[loaiGachRe].in();
		System.out.println("---******************---");
		System.out.println("Gia tien theo tung loai gach khi lot 1 dien tich 5x20m: ");
		for(int i=0;i<n;i++) {
			System.out.print("Loai: ");
			gach[i].inMSG();
			System.out.println(": "+ gach[i].soLuongHop(500, 2000)*(int)gach[i].giaHopGach());
			System.out.println("------");
			
		}
	sc.close();
	}
	
}