package DoiNgoaiTe;

import java.util.Scanner;

public class DoiNgoaiTe {

	public static void main(String[] args) {
	
	        Scanner scanner = new Scanner(System.in);
	        
	        // Tỷ giá hối đoái (Giả định)
	        final double exchangeRate = 23000; // 1 USD = 23,000 VND

	        System.out.println("Chương trình đổi ngoại tệ giữa USD và VND.");
	        System.out.println("1. Đổi USD sang VND");
	        System.out.println("2. Đổi VND sang USD");
	        System.out.print("Chọn lựa chọn (1 hoặc 2): ");
	        int choice = scanner.nextInt();

	        if (choice == 1) {
	            // Đổi USD sang VND
	            System.out.print("Nhập số USD: ");
	            double usd = scanner.nextDouble();
	            double vnd = usd * exchangeRate;
	            System.out.println(usd + " USD = " + vnd + " VND");
	        } else if (choice == 2) {
	            // Đổi VND sang USD
	            System.out.print("Nhập số VND: ");
	            double vnd = scanner.nextDouble();
	            double usd = vnd / exchangeRate;
	            System.out.println(vnd + " VND = " + usd + " USD");
	        } else {
	            System.out.println("Lựa chọn không hợp lệ.");
	        }

	        scanner.close();

	}

}
