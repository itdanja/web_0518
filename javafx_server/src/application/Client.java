package application;

import java.io.InputStream;
import java.net.Socket;

public class Client {
	// ������ ���ӵ� Ŭ���̾�Ʈ 
	
	Socket socket;
	
	public Client( Socket socket) {
		this.socket = socket;
	}
	
	// �޽��� �޴� �޼ҵ� [ ���ѷ��� ] 
	public void receive() {
		Runnable thread = new Runnable() {
			@Override
			public void run() {
				try {
					while(true) {
						InputStream inputStream = socket.getInputStream(); // ������ �Է½�Ʈ��
						
						byte[] buffer = new byte[1000];// ����Ʈ �迭 ���� 
						inputStream.read( buffer ); // �о���� 
						
						String msg = new String( buffer ); // ����Ʈ => ���ڿ�
						//  ���ӵ� ��� Ŭ���̾𿡰� ���� �޽��� ������ 
						for( Client temp : ServerController.clients ) {
							temp.send(msg); // ��� ����Ʈ�� �ִ� Ŭ���̾𿡰� �޽��� ������ 
						}
					}
				}
				catch (Exception e) {
				}
			}
		};
		// �ش� �����带 ������Ǯ�� �߰�
		ServerController.threadpool.submit(thread);
	}
	// �޽��� ������ �޼ҵ� 
	public void send( String msg ) {
	
	}
	
	
	
	
	

}
