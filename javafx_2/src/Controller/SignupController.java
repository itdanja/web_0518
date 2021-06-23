package Controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.Start;
import domain.FileUtil;
import domain.Member;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class SignupController implements Initializable {
	
    @FXML
    private TextField txtid;

    @FXML
    private PasswordField txtpassword;

    @FXML
    private Button btnsignup;

    @FXML
    private Button btnlogin;

    @FXML
    private PasswordField txtpassword2;

    @FXML
    private TextField txtname;

    @FXML
    private TextField txtemail;
    
    @FXML
    private Label lblerror;

    @FXML
    void login(ActionEvent event) {
    }

    @FXML
    void signup(ActionEvent event) {
    	
    	String id = txtid.getText();
    	String passowrd = txtpassword.getText();
    	String passowrd2 = txtpassword2.getText();
    	String name = txtname.getText();
    	String email = txtemail.getText();
    	
    
    	// 1. �ߺ����̵� ���� 
    	for( Member temp : Start.memberlist ) {
    		if( temp.getId().equals(id) ) {
    			lblerror.setText("���Խ��� : ������ ���̵� �����մϴ� ");									
    			return;
    		}
    	}
    	// 2. �н����� , Ȯ���н����尡 �������� �������
    	if( !passowrd.equals(passowrd2) ) {
    		lblerror.setText("���Խ��� : �н����尡 ���� �ٸ��ϴ� ");
    		// ! : ���� [ �ݴ� ]
			return;
    	}
    	// 3. email �� @ ���ԵǾ� ���� �ʴ� ��� 
    	if( email.indexOf("@") == -1 ) {
    		lblerror.setText("���Խ��� : �̸��� ������ �ƴմϴ� ");
			return;
    	}
    	lblerror.setText("ȸ������ �Ϸ� : �������ּż� �����մϴ� ");
    	
    	Member temp = new Member(id, passowrd, name, email);
    	Start.memberlist.add(temp);
    	// ���� ó�� [ ����Ʈ => ���� ] 
    		FileUtil.writefile("C:/Users/User/git/web_0518/javafx_2/src/File/", "memberlist.txt",  Start.memberlist );
			// �޼��� â ���� 
    			Alert alert = new Alert( AlertType.INFORMATION);
    			alert.setContentText(" �������ּż� �����մϴ� ");
 				alert.setHeaderText("ȸ������ ����");
    			alert.showAndWait(); // Ȯ�� ��ư ������������ ������ 
    	// �������� ���� 
    		btnsignup.getScene().getWindow().hide();
    }
   
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
