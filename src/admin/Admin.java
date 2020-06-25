package admin;

import java.util.Scanner;

public class Admin {
/*
 * 
 * 피시방 자리 확인 !
 * 
 */
	


public void adminMenu() {
	while(true) {
	System.out.println("\t\t\t〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
	System.out.println("\t\t\t 관리자 메뉴");
	System.out.println("\t\t\t〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
	System.out.println("\t\t\t1. PC관리");
	System.out.println("\t\t\t2. 주문관리");
	System.out.println("\t\t\t3. 매출관리");
	System.out.println("\t\t\t4. 문의내역");
	System.out.println("\t\t\t0. 뒤로가기");
	Scanner sc = new Scanner(System.in);
	String cho = sc.nextLine();
	
	if(cho.equals("1")) {
		// pc관리메뉴
		pcManagement PC = new pcManagement();
	}
	else if(cho.equals("2")) {
		// 주문 관리메뉴
		orderManagement order = new orderManagement();
	}
	else if(cho.equals("3")) {
		// 매출 관리메뉴
		pcManagement order = new pcManagement();
	}
	else if(cho.equals("4")) {
		// 문의 내역 메뉴
		enquirylist enquiry = new enquirylist();
	}
	else if(cho.equals("0")) {
		// 이전으로 
		break;
	}
	}
}
}