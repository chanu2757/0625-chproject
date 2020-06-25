package admin;

import java.util.Scanner;

public class enquirylist {

public void printlist() {
	while(true) {
		System.out.println("\t\t\t〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
		System.out.println("\t\t\t 		문의내역");
		System.out.println("\t\t\t〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
		//procprintenquirylist();
		System.out.println("\t\t\t0. 뒤로가기");
		System.out.println("\t\t\t〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");		
		Scanner sc = new Scanner(System.in);
		String cho = sc.nextLine();
		//번호선택, 답변 하는 프로시저
		if(cho.equals("0")) {
			// 이전으로 
			break;
		}
		else {
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
