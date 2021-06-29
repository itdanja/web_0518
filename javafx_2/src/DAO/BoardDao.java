package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import domain.Board;

public class BoardDao {
	
	Connection conn; // DB�� �������ִ� �������̽� ���� 
	private static BoardDao memberDao = new BoardDao(); // ���� Ŭ������ ��ü 
	
	public static BoardDao getMemberDao() {	// dao ��ü�� ��ȯ���ִ� �޼ҵ� 
		return memberDao;
	}
	
	public BoardDao() { // ������ : ��ü�� �ʱⰪ 
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
	
	// �۾��� �޼ҵ� 
	public int boardwrie( Board board ) {
		
		//1. SQL �ۼ�
		String SQL ="insert into board(btitle,bcontents,bwriter,bdate,bcount)"+"values(?,?,?,?,?)";
		//2. SQL ����
		try {
			PreparedStatement statement = conn.prepareStatement(SQL); // SQL ���� ����ó�� 
			statement.setString(1, board.getBtitle() ); // ù��° ?
			statement.setString(2, board.getBcontents() ); // ù��° ?
			statement.setString(3, board.getBwriter() ); // ù��° ?
			statement.setString(4, board.getBdate() ); // ù��° ?
			statement.setInt(5, board.getBcount() ); // ù��° ?
		//3. SQL ����
			statement.executeUpdate(); // insert => update : ���� ���� 
		//4. SQL ���
			return 1; // ������ 
		}catch (Exception e) {}
		return 0; // ���н� 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
