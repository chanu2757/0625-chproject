package user;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;



// 회원 로그인
public class MemberUser {

	int num; 		//회원 번호
	String id; 		//회원 아이디
	String pw; 		//회원 비밀번호
	String name; 	//회원 이름
	int remainTime;	//회원 남은시간
	boolean loginFlag = false;
	
	public void login(MemberUser memberuser) {
		
		// Database connection
		// 데이터베이스 연동
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		DBUtil util = new DBUtil();
		
		Scanner scan = new Scanner(System.in);
		
		// 회원 계정 데이터를 넣어줄 변수
		HashMap<String, ArrayList<String>> memberInfo = new HashMap<String, ArrayList<String>>();
		
		try {
			
			conn = util.open("211.63.89.61", "chproject", "java1234");
			stat = conn.createStatement();
			
			String sql = String.format("select * from tblMember");
			rs = stat.executeQuery(sql);
			
			//데이터 받기
			while (rs.next()){
				
				ArrayList<String> temp = new ArrayList<String>();
				
				temp.add(rs.getString("pw"));
				temp.add(rs.getString("num"));
//				temp.add(rs.getString("name"));
//				temp.add(rs.getString("remainTime"));
				memberInfo.put(rs.getString("id"), temp);
								
			}//while
			
			// 아이디 비밀번호 입력
			System.out.print("\t\t\t▷ ID:");
			String inputId = scan.nextLine();
			System.out.print("\t\t\t▷ PW:");
			String inputPw = scan.nextLine();
			
			// loginInfo search
			for (String id: memberInfo.keySet()) {				
				// id matching
				if (id.equals(inputId)) {
					
					// password get
					String pw = memberInfo.get(id).get(0);	
					
					if (pw.equals(inputPw)) {
						
						MemberMain memberMain = new MemberMain();
						
						// login on
						memberuser.loginFlag = true;
						
						// set info						
						memberuser.setNum(Integer.parseInt(memberInfo.get(id).get(1)));
						
						
					}
					
				}
				
				
			}
			
				
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		

		
	}//login
	
	//회원번호
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

//	//회원 아이디
//	public String getId() {
//		return id;
//	}
//	
//	public void setId(String id) {
//		this.id = id;
//	}
//	
//	//회원 비밀번호
//	public String getPw() {
//		return pw;
//	}
//
//	public void setPw(String pw) {
//		this.pw = pw;
//	}

	
	
	
	
	
}//MemberUser
