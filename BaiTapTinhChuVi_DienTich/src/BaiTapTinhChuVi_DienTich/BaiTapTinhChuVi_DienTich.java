package BaiTapTinhChuVi_DienTich;

import java.util.Scanner;

public class BaiTapTinhChuVi_DienTich {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Tính chu vi và diện tích hình chữ nhật
        System.out.println("Tính chu vi và diện tích hình chữ nhật:");
        System.out.print("Nhập chiều dài: ");
        double length = scanner.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double width = scanner.nextDouble();

        double rectangleArea = length * width;
        double rectanglePerimeter = 2 * (length + width);

        System.out.println("Diện tích hình chữ nhật: " + rectangleArea);
        System.out.println("Chu vi hình chữ nhật: " + rectanglePerimeter);

        // Tính chu vi và diện tích hình tròn
        System.out.println("\nTính chu vi và diện tích hình tròn:");
        System.out.print("Nhập bán kính: ");
        double radius = scanner.nextDouble();

        double circleArea = Math.PI * radius * radius;
        double circleCircumference = 2 * Math.PI * radius;

        System.out.println("Diện tích hình tròn: " + circleArea);
        System.out.println("Chu vi hình tròn: " + circleCircumference);

        scanner.close();

	}

}
