package admin;

import java.util.Scanner;

public class pcManagement {
	public void pcManagement() {
	while(true) {
		System.out.println("\t\t\t〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
		System.out.println("\t\t\t Pc 관리");
		System.out.println("\t\t\t〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
		System.out.println("\t\t\t0. 뒤로가기");
		System.out.println("\t\t\t〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
		System.out.print("종료시킬 번호 선택:");
		Scanner sc = new Scanner(System.in);
		String cho = sc.nextLine();
		
		if(cho.equals("1")) {
			//pc번호 입력해서 status를 0으로 만드는 프로시저
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
		}//else
	}
}
}

