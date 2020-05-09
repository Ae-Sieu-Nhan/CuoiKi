package exam.cuoiki;

import java.util.ArrayList;
import java.util.Scanner;

public class Cuoiki {	
	
	public static void main(String[] args) {
		System.out.println("Kiem Tra Thong Tin Khach Hang");
		System.out.println("");
		KiemTraThongTinKhachHang.hoTen();
		KiemTraThongTinKhachHang.ngayThangNam();
		KiemTraThongTinKhachHang.soCanCuocCongDan();
		KiemTraThongTinKhachHang.soDienThoai();
		KiemTraThongTinKhachHang.maTaiKhoan();
	try
	{	
	Scanner scan = new Scanner(System.in);
	System.out.print("Nhap so du tai khoan: ");
	int x = scan.nextInt();
		
		
	ArrayList <Integer> list = new ArrayList<>(); 
	list.add(2000);
	list.add(4200);
	list.add(3000);
	list.add(5300);
	list.add(3600);
	list.add(5000);
	 System.out.println("");
	System.out.println("Giá cổ phiếu");
	 
	System.out.println("Cổ phiếu A giá trần: "+list.get(0)+" và giá sàn: "+list.get(1));
	  System.out.println(" Cổ phiếu B giá trần: "+list.get(2)+" và giá sàn: "+list.get(3));
	  System.out.println(" Cổ phiếu C giá trần: "+list.get(0)+" và giá sàn: "+list.get(5));
	  System.out.println("");
    int a = x/list.get(0) ;
    int b = x/list.get(1);
    int c = x/list.get(2);
    int d = x/list.get(3);
    int e = x/list.get(4);
    int f = x/list.get(5);
   
    System.out.println("Có thể mua được "+a+" cổ phiếu A giá sàn  ");
    System.out.println("Có thể mua được "+b+" cổ phiếu A giá trần ");
    System.out.println("Có thể mua được "+c+" cổ phiếu B giá sàn ");
    System.out.println("Có thể mua được "+d+" cổ phiếu B giá trần");
    System.out.println("Có thể mua được "+e+" cổ phiếu C giá sàn");
    System.out.println("Có thể mua được "+f+" cổ phiếu A giá trần");	
    System.out.println("");
    System.out.println("Có thể mua được bao nhiêu cổ phiếu với một nửa số tài khoản");
    int muaTranA = (x/2)/list.get(0);
     int y = x - (muaTranA*list.get(0));
    int muaTranB = (y/2)/list.get(2);
    y = y - (muaTranB*list.get(2));
    int muaTranC = (y/2)/list.get(4);
     y = y - (muaTranC*list.get(4));
   
    System.out.println("");
    System.out.println("Số cổ phiếu A giá trần có :"+ muaTranA);
    System.out.println("Số cổ phiếu B giá trần có :"+ muaTranB);
    System.out.println("Số cổ phiếu C giá trần có :"+ muaTranC);
    
    int muaSanA = (x/2)/list.get(1);
      int t = x -(muaSanA*list.get(1));
      int muaSanB = (t/2)/list.get(3);
       t = t - (muaSanB*list.get(3));
      int muaSanC = (t/2)/list.get(5);
      t = t - (muaSanC*list.get(5));
   
      System.out.println("");
      System.out.println("Số cổ phiếu A giá sàn có :"+ muaSanA);
      System.out.println("Số cổ phiếu B giá sàn có: "+ muaSanB);
      System.out.println("Số cổ phiếu C giá sàn có: "+ muaSanC);
      
       muaTranA = (x/2)/list.get(0);
       int z = x - (muaTranA*list.get(0));
       muaSanB = (z/2)/list.get(3);
       z = z - (muaSanB*list.get(3));
       muaTranC = (z/2)/list.get(4);
       
    System.out.println("");
    System.out.println("Số cổ phiếu A giá trần có : "+ muaTranA);
    System.out.println("Số cổ phiếu B giá sàn có : "+ muaSanB);
    System.out.println("Số cổ phiếu C giá trần có : "+muaTranC);
     muaSanA = (x/2)/list.get(1);
    int g = x -(muaSanA*list.get(1));
    muaTranB = (g/2)/list.get(2);
    g = g - (muaTranB*list.get(2));
    muaSanC = (g/2)/list.get(5);
    g = g - (muaSanC*list.get(5));
     
    System.out.println("");
    System.out.println("Số cổ phiếu A giá sàn có : "+ muaSanA);
    System.out.println("Số cổ phiếu B giá trần có : "+muaTranB);
    System.out.println("Só cổ phiếu C giá sàn có : "+muaSanC);
    
    muaTranA = (x/2)/list.get(0);
    int l = x - (muaTranA*list.get(0));
    muaTranB = (l/2)/list.get(2);
    l = l - (muaSanB*list.get(2));
    muaSanC = (l/2)/list.get(5);
   
    System.out.println("");
    System.out.println("Số cổ phiếu A giá trần có : "+ muaTranA);
    System.out.println("Số cổ phiếu B giá trần có : "+muaTranB);
    System.out.println("Só cổ phiếu C giá sàn có : "+muaSanC);
    
    muaSanA =(x/2)/list.get(1);
    int o = x - (muaSanA*list.get(1));
    muaSanB = (o/2)/list.get(3);
        o = o - (muaSanB*list.get(3));
    muaTranC = (o/2)/list.get(4);
    
    System.out.println("");
    System.out.println("Số cổ phiếu A giá sàn có : "+ muaSanA);
    System.out.println("Số cổ phiếu B giá sàn có : "+muaSanB);
    System.out.println("Só cổ phiếu C giá trần có : "+muaTranC);
    

 
		} 
		catch(Exception e)	
		{
		System.out.print("Vui long nhap so nguyen");
	}
	
	}
	}	


