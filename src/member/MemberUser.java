package member;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;



// ?��?�� 로그?��
public class MemberUser {

	int num; 		//?��?�� 번호
	String id; 		//?��?�� ?��?��?��
	String pw; 		//?��?�� 비�?번호
	String name; 	//?��?�� ?���?
	int remainTime;	//?��?�� ?��???���?
	boolean loginFlag = false;
	
	public void login(MemberUser memberuser) {
		
		// Database connection
		// ?��?��?��베이?�� ?��?��
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		DBUtil util = new DBUtil();
		
		Scanner scan = new Scanner(System.in);
		
		// ?��?�� 계정 ?��?��?���? ?��?���? �??��
		HashMap<String, ArrayList<String>> memberInfo = new HashMap<String, ArrayList<String>>();
		
		try {
			
			conn = util.open("211.63.89.61", "chproject", "java1234");
			stat = conn.createStatement();
			
			String sql = String.format("select * from tblMember");
			rs = stat.executeQuery(sql);
			
			//?��?��?�� 받기
			while (rs.next()){
				
				ArrayList<String> temp = new ArrayList<String>();
				
				temp.add(rs.getString("pw"));
				temp.add(rs.getString("num"));
//				temp.add(rs.getString("name"));
//				temp.add(rs.getString("remainTime"));
				memberInfo.put(rs.getString("id"), temp);
								
			}//while
			
			// ?��?��?�� 비�?번호 ?��?��
			System.out.print("\t\t\t?�� ID:");
			String inputId = scan.nextLine();
			System.out.print("\t\t\t?�� PW:");
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
	
	//?��?��번호
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

//	//?��?�� ?��?��?��
//	public String getId() {
//		return id;
//	}
//	
//	public void setId(String id) {
//		this.id = id;
//	}
//	
//	//?��?�� 비�?번호
//	public String getPw() {
//		return pw;
//	}
//
//	public void setPw(String pw) {
//		this.pw = pw;
//	}

	
	
	
	
	
}//MemberUser
