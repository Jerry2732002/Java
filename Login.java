package lab;
import java.awt.*;
import java.awt.event.*;
public class Login extends Frame implements ActionListener {
Button button;
TextField userid = new TextField(40);
TextField password = new TextField(40);
TextField email = new TextField(40);
Login(){
	Label userLabel= new Label();
	userLabel.setText("Username :");
	Label passLabel=new Label();
	passLabel.setText("Password :");
	Label emailLabel=new Label();
	emailLabel.setText("E-mail :");
	setTitle("Login Page");
	setSize(400,300);
	setVisible(true);
	setLayout(new FlowLayout());
	button=new Button("Login");
	add(userLabel);
	add(userid);
	add(emailLabel);
	add(email);
	add(passLabel);
	add(password);
	add(button);
    userid.setText("Enter User ID");
    email.setText("Enter E-mail ID");
	password.setText("Enter Password");
	button.addActionListener(this);
	
}
public void actionPerformed(ActionEvent e) {
	setVisible(false);
	System.out.println("User ID : "+userid.getText());
	System.out.println("Email ID : "+email.getText());
	System.out.println("Password : "+password.getText());
	System.out.println("Welcome  "+userid.getText());
}
public static void main(String[] args) {
	new Login();
}
}