import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Scanner;

import oracle.jdbc.OracleTypes;

// ȸ�� ���Խ� �Է��� ������ �����ϴ� ������
public class user {

public static void signup(){
	
	Connection conn = null;
	CallableStatement stat = null;
	ResultSet rs = null;
	DBUtil util = new DBUtil();
	Scanner sc = new Scanner(System.in);
	try {
		conn = util.open("211.63.89.61", "chproject", "java1234");
		String sql = "{ call procAddmember(?,?,?,?,?,?,?)}";
		stat = conn.prepareCall(sql);
		
		System.out.println("\t\t\t�������������������������");
		System.out.println("\t\t\t   ȸ�� ����");
		System.out.println("\t\t\t�������������������������");
		System.out.println("\t\t\t '*'�� �ݵ�� �Է��� �ּ���!");
		
		System.out.print("\t\t\t *���̵�:");
		String id = sc.nextLine();
		System.out.print("\t\t\t *��й�ȣ:");
		String pw = sc.nextLine();
		System.out.print("\t\t\t *�̸�:");
		String name = sc.nextLine();
		System.out.print("\t\t\t *�ֹε�Ϲ�ȣ:");
		String ssn = sc.nextLine();
		System.out.print("\t\t\t *����ó:");
		String tel = sc.nextLine();
		System.out.print("\t\t\t E-mail:");
		String email = sc.nextLine();
	
		stat.setString(1, id);
		stat.setString(2, pw);
		stat.setString(3, name);
		stat.setString(4, ssn);
		stat.setString(5, tel);
		stat.setString(6, email);
		stat.registerOutParameter(7, OracleTypes.NUMBER);
		
		
	
		stat.executeUpdate();
		int result= stat.getInt(7);
		
		if(result ==1) {
			System.out.println("ȸ������ ����!");
		}
		stat.close();
		conn.close();

	} catch (Exception e) {
		System.out.println("ȸ������ ����!");
	}

}

}
