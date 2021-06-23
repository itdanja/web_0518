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
import javafx.scene.control.TextField;

public class FindidController implements Initializable {
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	
    @FXML
    private Button btnfindid;

    @FXML
    private Button btnlogin;

    @FXML
    private TextField txtname;

    @FXML
    private TextField txtemail;

    @FXML
    private Label lblerror;

    @FXML
    void findid(ActionEvent event) {
    	
    	String name = txtname.getText();
    	String email = txtemail.getText();
    	
    	for( Member temp : Start.memberlist ) {
    		if( temp.getName().equals(name) && temp.getEmail().equals(email) ) {
    			lblerror.setText("ã���� ���̵� �̸��Ϸ� �����߽��ϴ�");
    			String id = temp.getId();

    			return;
    		}
    	}
    	
    	lblerror.setText("������ ������ ȸ�� ���̵� �����ϴ�");
 
    }

    @FXML
    void login(ActionEvent event) {

    }
	
	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
