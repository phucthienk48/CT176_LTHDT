package Buoi4;

import java.util.Scanner;

import Buoi3.SinhVien;

public class SinhVienCNTT extends SinhVien {
	Scanner sc = new Scanner(System.in);
	String taikhoan, matkhau, email;
	public SinhVienCNTT(){
		super();
		taikhoan = new String();
		matkhau = new String();
		email = new String();
	}
	public SinhVienCNTT(SinhVienCNTT sv) {
		super(sv);
		taikhoan = new String(sv.taikhoan);
		matkhau = new String(sv.matkhau);
		email = new String(sv.email);
	}
	public void nhap() {
		super.nhap();
		System.out.println("nhap tai khoan: ");
		taikhoan = sc.nextLine();
		System.out.println("nhap mat khau: ");
		matkhau = sc.nextLine();
		System.out.println("nhap email");
		email = sc.nextLine();
	}
	public void in() {
		super.in();
		System.out.println("tai khoan: "+taikhoan+";mat khau: "+matkhau+"\nemail: "+email);
	}
	public String toString() {
		return super.toString()+ "tai khoan: "+taikhoan+";mat khau: "+matkhau+"\nemail: "+email;
	}
	public void doiMK(String newpass) {
		matkhau = new String(newpass);
	}
	public String getEmail() {
		return email;
	}
	public String getTK() {
		return taikhoan;
	}
}





