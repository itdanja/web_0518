package Day14;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	
	// 프로토콜 : 규약 , 약속
		// IP : 인터넷 사용을 위한 규칙
		// TCP : 전송 제어 프로토콜
			// 소켓 : 데이터를 통신할 수 있도록 연결해주는 연결부
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// 서버 PC만들기
		try { // .ServerSocket(); 예외처리 
			//1. 서버소켓 객체 생성 
			ServerSocket serverSocket = new ServerSocket();
			//2. 서버소켓 바인딩 
			serverSocket.bind( new InetSocketAddress("localhost",5001));
					// 소켓.bind( ip주소 , port ) 
			//3. 클라이언트와 연결 요청 대기 
			while( true ) {
				System.out.println("[ 연결 대기 ]");
				// 4. 연결 수락
				Socket socket = serverSocket.accept();
							// .accept : 클라이언트가 서버소켓으로부터 접속요청시 수락 
					// 수락된 소켓을 담기 
				// 5. 연결된 소켓 가져오기
				InetSocketAddress socketAddress = 
						(InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println(" [ 연결 수락 ]" + socketAddress.getHostName() );		
			
				// 6. 클라이언트에게 데이터 받기 
				String 메시지 = null;
				byte[] 바이트 = new byte[100];
				
					// 연결된 소켓의 입력스트림 가져오기 
				InputStream 받기 = socket.getInputStream();
				// 스트림 읽어오기 => 배열에 저장 
				받기.read(바이트);
				// 바이트 => String 
				메시지 = new String( 바이트 );
				System.out.println("[ 서버 메시지 받기 성공 ] : " + 메시지);
				
				// 7. 클라이언트에게 데이터 전송 
				OutputStream 보내기 = socket.getOutputStream();
				System.out.println(" 클라이언에게 보낼 메시지 입력 : ");
				메시지 = scanner.next();
				바이트 = 메시지.getBytes();
				보내기.write(바이트);
				System.out.println("[ 메시지 전송 성공 ]");
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		} 
	}
		
	
	
	
	
	
}
