package DoiDonViDo;

import java.util.Scanner;

public class DoiDonViDo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Đổi km sang m
        System.out.println("Chương trình đổi đơn vị km sang m.");
        System.out.print("Nhập số km: ");
        double kilometers = scanner.nextDouble();
        double meters = kilometers * 1000;
        System.out.println(kilometers + " km = " + meters + " m");

        // Đổi byte sang bit
        System.out.println("\nChương trình đổi đơn vị byte sang bit.");
        System.out.print("Nhập số byte: ");
        long bytes = scanner.nextLong();
        long bits = bytes * 8;
        System.out.println(bytes + " byte = " + bits + " bit");

        scanner.close();

	}

}
