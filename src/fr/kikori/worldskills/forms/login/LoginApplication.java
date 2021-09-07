package fr.kikori.worldskills.forms.login;

import javax.swing.SwingUtilities;

import fr.kikori.worldskills.forms.login.components.LoginPage;

public class LoginApplication {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			LoginPage main = new LoginPage();
			main.run();
		});
	}
}
