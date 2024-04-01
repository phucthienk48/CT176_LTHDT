package Buoi4;

import java.util.Scanner;

public class SDSinhVienCNTT {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so luong sinh vien: ");
		int n = sc.nextInt();
		SinhVienCNTT ds[] = new SinhVienCNTT[n];
		for(int i=0; i<n; i++) {
			ds[i] = new SinhVienCNTT();
			System.out.println("nhap thong tin sinh vien " + (i+1)+":");
			ds[i].nhap();
			ds[i].nhapDiem();
		}
		String email = new String();
		System.out.println("nhap Email SV can tim: ");
		email = sc.next();
		for(int i=0; i<n; i++) {
			if(ds[i].getEmail().equals(email)) {
				System.out.println("Tai khoan ELCIT cua SV :"+ds[i].getTK());
				System.out.println("Ket qua hoc tap SV :");
				ds[i].in();
				ds[i].inDiem();
				System.out.println("Diem TB: "+ ds[i].diemTB());
				break;
			}
		}
	}
}
