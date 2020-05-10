package exam.cuoiki;

import java.util.Scanner;

public class KiemTraThongTinKhachHang {
	public static String hoTen() {
		String ho;
		String reHo;
		do {
		Scanner scan = new Scanner(System.in);

		System.out.print("Họ và tên:");
		ho = scan.nextLine();
		reHo = "[a-z A-Z]+";
		if (!ho.matches(reHo)) {
	    System.out.println("lỗi.\nVui lòng nhập chữ.");
		}
		
		}while(!ho.matches(reHo));
		return ho;

	
	}
	public static int ngay() {
    System.out.println("Ngay Tháng Nám Sinh");

		int ngay = 0;
		do {
			try {
         
				Scanner scan = new Scanner(System.in);
				System.out.print("Ngày: ");

				ngay = scan.nextInt();

			} catch (Exception e) {
				System.out.println("lỗi.\nVui lòng nhập số.");
			}
		} while (ngay == 0);
		return ngay;

	}

	public static int thang() {
		int thang = 0;
		do {
			try {
				Scanner scan = new Scanner(System.in);
				System.out.print("Tháng: ");
				thang = scan.nextInt();

			} catch (Exception e) {
				System.out.println("lỗi.\nVui lòng nhập số.");
			}
		} while (thang == 0);
		return thang;

	}

	public static int nam() {
		int nam = 0;
		do {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("Năm: ");
			nam = scan.nextInt();
		} catch (Exception e) {
			System.out.println("lỗi.\nVui lòng nhập số");
		}
		}while(nam == 0);
		return nam;
		
	}

	public static String soCanCuocCongDan() {
		String so;
		String reSo;
		do {
		Scanner scan = new Scanner(System.in);
		System.out.print("Số căn cước công dân: ");
		so = scan.nextLine();
		 reSo = "\\d{12}";
		if (so.matches(reSo)) {
			System.out.println("Số căn cước công dân: " + so);
		} else {
			System.out.println("Số căn cước công dân không hợp lệ.\nCăn cước công dân gồm 12 số !!" );
		}}while(!so.matches(reSo));
		return so;
	}

	public static String soDienThoai() {
		String phone;
		String rePhone;
		do {
		Scanner scan = new Scanner(System.in);
		System.out.print("Số điện thoại: ");
		phone = scan.nextLine();
	     rePhone = "0\\d{9,10}";
		if (phone.matches(rePhone)) {
			System.out.println("số điện thoại: " + phone);
		} else {
			System.out.println("số điện thoại không hợp lệ.\nVui long nhập đủ số điện thoại.");
		}
		}while(!phone.matches(rePhone));
		return phone;
	}

	public static int maTaiKhoan() {
		int ma = 0;
		do {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("Mã tài khoản: ");
			ma = scan.nextInt();
			System.out.println("mã tài khoản: " + ma);
		} catch (Exception e) {
			System.out.println("lỗi.\nVui lòng nhập số");
		}
		}while(ma == 0);
		return ma;

	}

	public static void tongHopThongTin() {
		
		Scanner scan = new Scanner(System.in);

		String hoten = hoTen();
		int ngay = ngay();
		int thang = thang();
		int nam = nam();
		String soCanCuocCongDan = soCanCuocCongDan();
		String soDienThoai = soDienThoai();
		int mataikhoan = maTaiKhoan();

		System.out.println("");
                System.out.println("-----THÔNG TIN KHÁCH HÀNG-----");
		System.out.println("họ và tên: " + hoten);

		System.out.println("ngày tháng năm sinh: ngày " + ngay + " tháng " + thang + " năm " + nam);

		System.out.println("số căn cước công dân: " + soCanCuocCongDan);

		System.out.println("số điện thoại: " + soDienThoai);

		System.out.println("mã tài khoản: " + mataikhoan);

	}
}
