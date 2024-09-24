package Bai_NhapxuatThongtin;

import java.util.Scanner;

public class Bai_NhapxuatThongtin {

	public static void main(String[] args) {
		
			System.out.println("-------NHAP XUAT-------");
			
			//Khai báo các biến chứa dữ liệu nhập vào
			String hoTen;
			int tuoi;
			double chieuCao;
			double canNang;
			// Tạo đối tượng của lớp Scanner để nhập dữ liệu
			Scanner banPhim; // khai báo
			banPhim = new Scanner(System.in);// xin mới
			// Đọc dữ liệu từ bàn phím, cất vào các biến tương ứng
			
			// In ra hướng dẫn cho User biết,cần làm gì:
			System.out.print("Họ tên? ");
			hoTen= banPhim.nextLine(); 
			System.out.print("Tuổi? ");
			tuoi = banPhim.nextInt();
			System.out.print("Chiều cao (m)? ");
			chieuCao = banPhim.nextDouble();
			System.out.print("Cân nặng (kg)? ");
			canNang = banPhim.nextDouble();
			
			// Xuất thông tin
			System.out.println("===========================");
			System.out.println("Name: " + hoTen);
			System.out.println("Age: " + tuoi);
			System.out.println("Weight: " + canNang);
			System.out.println("Height: " + chieuCao);
			System.out.println("===========================");

	}

}
