package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class LoginController implements Initializable {
	// FXML ���� �ϴ� Ŭ���� 
	
	@Override  // FXML �ʱⰪ 
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		loading.setVisible(false); // �̹��� ����� 	
	}
	
	// ��Ʈ�ѵ��� ��ü �������� 
	@FXML
    private TextField txtid;

    @FXML
    private PasswordField txtpassword;

    @FXML
    private Button btnlogin;

    @FXML
    private Button btnsigup;

    @FXML
    private Label lblfindid;

    @FXML
    private Label lblfindpassword;

    @FXML
    private ImageView loading;

    @FXML
    void findid(MouseEvent event) {

    }

    @FXML
    void findpassword(MouseEvent event) {

    }

    @FXML
    void login(ActionEvent event) {
    	loading.setVisible(true);
    		// �ؽ�Ʈ����.getText() : �ؽ�Ʈ�� �Էµ� ������ ȣ��
    	if( txtid.getText().equals("qwe") && txtpassword.getText().equals("qwe") ) {
    		System.out.println("�α��� ����");
    	}else {
    		System.out.println("�α��� ����");
    	}
    }
    
    
    
    
    
    
    
    

	
    
    
    
    
    
    
    
    
    
    
    
}
