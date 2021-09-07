package fr.kikori.worldskills.forms.login.components;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

public class ApplicationPage extends JFrame {
	private static final long serialVersionUID = 1L;

	public void run() {
		this.setSize(1024, 768);
		JPanel mainPanel = new JPanel(new MigLayout("", ""));
		
		JLabel welcome = new JLabel("welcome to the app");
		mainPanel.add(welcome);
		
		this.add(mainPanel);
		this.setVisible(true);
	}

}
