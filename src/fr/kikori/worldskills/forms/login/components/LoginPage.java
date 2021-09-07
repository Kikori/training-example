package fr.kikori.worldskills.forms.login.components;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;

import net.miginfocom.swing.MigLayout;

public class LoginPage extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private static final String LOGIN = "kikori";
	private static final String PASSWORD = "1234";

	public void run() {
	    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    
	    JPanel loginPanel = new JPanel(new MigLayout("", "[][][60][][]", "[][]"));
	    loginPanel.setSize(600, 100);
		
		JLabel lblNewLabel = new JLabel("Login:");
		loginPanel.add(lblNewLabel, "cell 0 0,alignx trailing");
		
		JFormattedTextField tfLogin = new JFormattedTextField();
		loginPanel.add(tfLogin, "cell 1 0, width 50:100:100, growx");
		
		JLabel lblNewLabel_1 = new JLabel("Password:");
		loginPanel.add(lblNewLabel_1, "cell 2 0,alignx trailing");
		
		JPasswordField passwordField = new JPasswordField();
		loginPanel.add(passwordField, "cell 3 0, width 50:100:100, growx");
		
		JLabel lblError = new JLabel();
		lblError.setForeground(Color.RED);
		loginPanel.add(lblError, "cell 0 1 3 1, alignx left");
		lblError.setVisible(false);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean loginOk = LOGIN.equalsIgnoreCase(tfLogin.getText()) && PASSWORD.equals(new String(passwordField.getPassword()));
				if (loginOk) {
					dispose();
					new ApplicationPage().run();
					
				} else {
					setErrorMessage(lblError, "Wrong login/password combination");
				}
				lblError.setVisible(true);
			}
		});
		btnNewButton.setHorizontalAlignment(SwingConstants.RIGHT);
		loginPanel.add(btnNewButton, "cell 3 1, alignx right");
		
		getContentPane().add(loginPanel);
		pack();
	    this.setVisible(true);
	}
	
	private void setSuccessMessage(final JLabel label, String message) {
		setMessage(label, message, Color.green);
	}
	
	private void setErrorMessage(final JLabel label, String message) {
		setMessage(label, message, Color.red);
	}
	
	private void setMessage(final JLabel label, String message, Color color) {
		label.setText(message);
		label.setForeground(color);
	}
	
}
