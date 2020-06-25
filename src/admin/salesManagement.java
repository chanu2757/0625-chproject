package admin;

import java.util.Scanner;

public class salesManagement {
	public void salesManagement() {
	while(true) {
		System.out.println("\t\t\t〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
		System.out.println("\t\t\t\t 매출관리");
		System.out.println("\t\t\t〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
		System.out.println("\t\t\t1. 년 매출 조회");
		System.out.println("\t\t\t2. 월 매출 조회");
		System.out.println("\t\t\t3. 오늘 매출 조회");
		System.out.println("\t\t\t0. 뒤로가기");
		Scanner sc = new Scanner(System.in);
		String cho = sc.nextLine();
		
		if(cho.equals("1")) {
			//년 매출 조회
		}
		else if(cho.equals("2")) {
			// 월 매출 조회
		}
		else if(cho.equals("3")) {
			// 오늘 매출 조회
		}
		else if(cho.equals("0")) {
			// 이전으로 
			break;
		}
		else{
			for (int i=0;i<cho.length();i++) {
				int b =0;
				b=cho.charAt(i);
				if(b<48 && b>57) {
					System.out.println("숫자만 입력가능 합니다.");
				}
			}
		}
	}
}
}
