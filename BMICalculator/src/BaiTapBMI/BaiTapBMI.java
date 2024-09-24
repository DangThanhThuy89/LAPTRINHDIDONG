package BaiTapBMI;

import java.util.Scanner;

public class BaiTapBMI {

	public static void main(String[] args) 
	{
		Scanner banPhim = new Scanner(System.in);
		//Nhập họ tên
		System.out.print("Họ tên: ");
		String hoTen = banPhim.nextLine();
		//Nhập chiều cao
		System.out.print("Chiều cao (m): ");
		double chieuCao = banPhim.nextDouble();
		//Nhập cân nặng
		System.out.print("Cân nặng (kg): ");
		double canNang = banPhim.nextDouble();
		
		// Tính chỉ số BMI
		double bmi = canNang/(chieuCao*chieuCao);
		
		// In thông tin ra
		System.out.println("Bạn " + hoTen);
		System.out.println("Có chỉ số BMI = " + bmi);
		
		String thngBao;
		if (bmi<18.5)
			thongBao = "Thiếu cân";
		else if (bmi<25)
			thongBao = "Cân nặng bình thường";
		else if (bmi<30)
			thongBao = "Thừa cân, tiền béo phì";
		else if (bmi<35)
			thongBao = "Béo phì độ 1";
		else if (bmi<40)
			thongBao = "Béo phì độ 2";
		else thongBao = "Béo phì độ 3 (Bệnh lý)";
		
		System.out.println(thongBao);


	}

}
