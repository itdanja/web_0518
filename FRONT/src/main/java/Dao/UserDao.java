package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class UserDao {
	
	Connection connection; // sql ���� �������̽� 
	ResultSet resultSet; // sql ��� ��ȸ �������̽� 
	
	public static UserDao instance = new UserDao(); // ���� Ŭ������ ���簴ü ����;
	public static UserDao getinstance() {
		return instance;
	}
	
	public UserDao() {
		try {
			// sql ����̹� : sql ���� �ٸ�
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/jspweb?serverTimezone=UTC", "root" , "1234" );
			
		}catch (Exception e) {
		}
	}
	
	// ȸ������ �޼ҵ� 
	
	// �α��� �޼ҵ� 

	// ��� ȸ�� ��ȸ 
	
	// ���� ȸ�� ��ȸ 
	
	// ȸ������ �޼ҵ� 
	
	// ȸ��Ż�� �޼ҵ� 
	
	
}
