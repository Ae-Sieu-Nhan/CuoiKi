package exam.cuoiki;

import java.util.Scanner;

public class KiemTraThongTinKhachHang {
	     public static  String hoTen() {
	    	 String ho ;
	    	
	    	Scanner scan = new Scanner(System.in);
			
	    	System.out.print("Họ và tên:");
			ho = scan.nextLine();
			String reHo = "[a-z A-Z]+";
			if (ho.matches(reHo)) {
				System.out.println("Họ và tên: "+ho);	
			}
	    	else {
				System.out.println("Vui long nhap chu");
			}
	    	
			return ho;
			
	     }
	  
	     public static int ngay() {
			int ngay = 0;
	    	 try {
				Scanner scan = new Scanner(System.in);
	    	System.out.print("Ngày:  ");
		    ngay = scan.nextInt();
			
			}
			catch(Exception e) {
				System.out.println("Vui long nhap so ");	
			}
			return ngay;
	     }
			public static int thang() {
				int thang = 0;
				try {
					Scanner scan = new Scanner(System.in);
				System.out.print("Tháng: ");
				 thang = scan.nextInt();
				
			}catch(Exception e) {
				System.out.println("Vui long nhap so");
			}
			return thang;
			}
			public static int nam() {
				int nam = 0;
				try {
				Scanner scan = new Scanner(System.in);
				System.out.print("Năm: ");
				 nam = scan.nextInt();
			}catch(Exception e) {
				System.out.println("Vui long nhap so");
			}
				return nam;
			}
			 public static String ngayThangNam(){
		    	   System.out.println("ngay "+ngay()+" thang "+thang()+" nam "+nam());
				return null;
		       }
	       
			public static boolean soCanCuocCongDan() {
				Scanner scan = new Scanner(System.in);
			System.out.print("So can cuoc cong dan: ");
			String so = scan.nextLine();
			String reSo = "\\d{12}";
			if (!so.matches(reSo)) {
				System.out.println("So can cuoc cong dan khong hop le");
			}else {
				System.out.println("So can cuoc cong dan: "+so);
			}
			return false;
			}
      
        	public static boolean soDienThoai() {
        		Scanner scan = new Scanner(System.in);
        	System.out.print("So dien thoai: ");
			String phone = scan.nextLine();
			String rePhone = "0\\d{9,10}";
			if (!phone.matches(rePhone)) {
				System.out.println("so dien thoai khong hop le");
			}
			else {
				System.out.println("so dien thoai: "+phone);
			}
			return false;
        	}
        	
         public static  int maTaiKhoan(){
        	 int ma = 0;
        	 try {
        	Scanner scan = new Scanner(System.in);
        	 System.out.print("Mã tài khoản: ");
			 ma = scan.nextInt();
			 System.out.println("mã tài khoản: "+ma);
        	}
        	 catch(Exception e) {
        	System.out.println("Vui long nhap so");
        	}
			return ma;
        	
        	
         }
        
       	 
         
	/*		
	System.out.println("");
          
			if (ho.matches(reHo)) {
				System.out.println("Họ và tên: " + ho);
			}else {
				System.out.println("Họ và tên" +ho+"-->khong hop le");
			}
			if (ngay.matches(rengay)) {
				System.out.println("Ngày tháng năm sinh: " + ngay);
			}
			else
			{
				System.out.println("Ngày tháng năm sinh: " +ngay+ "--> khong hop le");
			}
			if (so.matches(reSo)) {
				System.out.println("So can cuoc cong dan :" + so);
			}else {
				System.out.println("So can cuoc cong dan: " +so+ " --> khong hop le");
			}
			if (phone.matches(rePhone)) {
				System.out.println("SDT: " + phone);
			}else {
				System.out.println("SDT: " +phone+ " -->khong hop le");
			}
			
			
			System.out.println("Mã tài khoản: " + ma);
		} 
		catch (Exception e)
		{
			System.out.println("Vui lòng không nhập chữ ở mã tài khoản");

		*/
		
	
}


