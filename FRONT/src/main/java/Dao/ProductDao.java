package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Dto.NoticeDto;

public class ProductDao {
	
	Connection connection; // sql ���� �������̽� 
	ResultSet resultSet; // sql ��� ��ȸ �������̽� 
	
	public static ProductDao instance = new ProductDao(); // ���� Ŭ������ ���簴ü ����;
	public static ProductDao getinstance() {
		return instance;
	}
	
	public ProductDao() {
		try {
			// sql ����̹� : sql ���� �ٸ�
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/jspweb?serverTimezone=UTC", "root" , "1234" );
			
		}catch (Exception e) {
		}
	}

	
	// 1. ��ǰ���
		
	
	// 2. ��ǰ ��� ��ȸ 
	
	// 3. ��ǰ ���� ��ȸ 
	
	// 4. ��ǰ ���� 
	
	// 5. ��ǰ ���� 
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
