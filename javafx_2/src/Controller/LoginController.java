package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.Start;
import domain.Member;
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

    	// �Էµ� ȸ���� ����ȸ���� ���ؼ� �α��� 
    	for( Member temp : Start.memberlist ) {
    		//  �ӽð�ü : ����Ʈ�� 
    				// ����Ʈ�� ��ü����ŭ �ϳ��� �ӽð�ü�� ���� 
    		if( temp.getId().equals( txtid.getText() )  
    				&& temp.getPassword().equals( txtpassword.getText() ) ) {
    			System.out.println(" �α��� ���� ");
    			return;
    		}  		
    	}
    	System.out.println(" �α��� ���� ");
    	
    }
    
    
    
    
    
    
    
    

	
    
    
    
    
    
    
    
    
    
    
    
}
