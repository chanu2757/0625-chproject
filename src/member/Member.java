package member;

import java.util.Scanner;

public class Member {
	public void pcManagement() {
		
		/*회원의 아이디,시작시간,남은시간을 불러오는 프로시저
		+ 아이디,시작시간 ,남은 시간을 변수에 저장
		*/
		while(true) {
			System.out.println("\t\t\t〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
			System.out.println("\t\t\t ");
			System.out.println("\t\t\t〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
			//번호.자리번호(아이디)/주문내용) 출력 프로시저
			System.out.println("\t\t\t0. 뒤로가기");
			System.out.println("\t\t\t〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
			System.out.print("\t\t\t번호 선택:");
			Scanner sc = new Scanner(System.in);
			String cho = sc.nextLine();
			
			
			if(cho.equals("0")) {
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
