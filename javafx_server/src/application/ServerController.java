package application;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Vector;
import java.util.concurrent.ExecutorService;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class ServerController implements Initializable {
	
	// ������Ǯ ��� 
		// �ܺηκ��� �뷮�� ��û�� ���� �Ű� �ϳ��� ó�� 
	public static ExecutorService threadpool;
		// ������Ǯ ���� Ŭ���� : ExecutorService
	
	// ���ӵ� Ŭ���̾�Ʈ �����ϱ� ���� ����Ʈ  [ ����ȭ ����� �ִ� vector ] 
		// ����ȭ : ���� �����尡 ������ �޼ҵ� ȣ��� �浹 ���� [ �޼ҵ忡 ������ ȣ�� ���� ]
	public static Vector<Client> clients = new Vector<>();
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
	}
    @FXML
    private TextArea txtserver;

    @FXML
    private Button btnstart;

    @FXML
    void start(ActionEvent event) {

    }
	
	

}
