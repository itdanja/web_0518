package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import domain.Member;

public class MemberDao {
	
	
	Connection conn; // DB�� �������ִ� �������̽� ���� 
	private static MemberDao memberDao = new MemberDao(); // ���� Ŭ������ ��ü 
	
	public static MemberDao getMemberDao() {	// dao ��ü�� ��ȯ���ִ� �޼ҵ� 
		return memberDao;
	}
	
	public MemberDao() { // ������ : ��ü�� �ʱⰪ 
		// db ���� 
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Ŭ���� ã�� 
				// mysql ����̹� �̸� : com.mysql.cj.jdbc.Driver
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/javafx?serverTime=UTC" , "root" , "1234");
														// DBURL // ip�ּ�:port��ȣ/DB�� ? �ð��� = UTC  , "������" , "��й�ȣ" 
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	// ȸ������ �޼ҵ� 
	public int setmember( Member temp ) {
		// SQL ���ǹ� 
		String SQL = "insert into member(id,password,name,email)"+"values(?,?,?,?)";
			// ���̺� ������ �߰� 
			// 1. ��� �ʵ忡 �� ������� => �ʵ�� ���� 
				// insert into ���̺�� values( ��1, ��2, ��3, ��4 ) 
			// 2. Ư�� �ʵ忡�� ���� ������� => �ʵ�� �Է�
				// insert into ���̺��(�ʵ��1,�ʵ��2,�ʵ��3,�ʵ��4) values( ��1, ��2, ��3, ��4 ) 
					// ? : �Ű�����
		// SQL DB�� ������ 
		try {
			PreparedStatement pstmt = conn.prepareStatement(SQL);
				// PreparedStatement : ����� DB ���� �ϴ� �������̽� 
				// �Ű������� ������ �ֱ� 
					// setString( ?���� , ������ ) 
				pstmt.setString(1, temp.getId() );
				pstmt.setString(2, temp.getPassword() );
				pstmt.setString(3, temp.getName() );
				pstmt.setString(4, temp.getEmail() );
			// SQL ���� 
				pstmt.executeUpdate(); // SQL ������Ʈ => ���� 
			// ȸ������ ������ 1 ��ȯ  
			return 1; 
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		// ȸ������ ���н� 0 ��ȯ
		return 0; 
	}
	
	// �α��� �޼ҵ� 
	public int login( String id , String password  ) {
		
		// 1. SQL �ۼ� 
		String SQL = "select * from member where id = ? and password = ? ";	
			// �˻� 
			// 1. select �˻����ʵ�� from ���̺�� where ����[ �ʵ�� = �� ] 
			// 2. select *[����ʵ�˻�] from ���̺�� 
				// * [ ��� �ʵ� ���� ] 
				// ����1 and ����2  : �̸鼭
				// ����1 or ����2   : �̰ų�
		
		// 2. SQL ����  
		try {
			PreparedStatement statement = conn.prepareStatement(SQL);
			// 3. SQL ���� 
			statement.setString(1, id);
			statement.setString(2, password);
			// 4. SQL ���� 
			// �˻������ �������̽��� �����ؼ� �������� 
			ResultSet resultSet = statement.executeQuery();
				// ����.executeQuery();  sql ���� 
				// ResultSet �������̽� : select ����� �������ִ� �������̽� 
					// .next() : �˻������ �ϳ��� �̵�
			if( resultSet.next() ) { // �ϳ��� ����� ���������� 
				return 1; // �α��� ���� 
			}else {
				return 2; // ������ ���̵�� ��й�ȣ ���� 
			}	
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return 0; // db ���� 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
