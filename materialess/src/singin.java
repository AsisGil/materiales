import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class singin extends JFrame {

	private JFrame frmSingIn;
	private login login;
	private NewMaterial nuevomaterial;
	private JLabel lblNick;
	private JLabel lblRepetircontrasena;
	private JLabel lblEmail;
	private JLabel lblApellidos;
	private JLabel lblNombre;
	private JLabel lblContrasena;
	private JButton btnCnacelar;
	private JButton btnNewButton;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	public singin() {
		
		setTitle("SING IN");
		getContentPane().setBackground(SystemColor.activeCaption);
		lblNick = new JLabel("Nick");
		lblNombre = new JLabel("Nombre");
		lblApellidos = new JLabel("Apellidos");
		lblEmail = new JLabel("Email");
		lblContrasena = new JLabel("Contrase\u00F1a");
		lblRepetircontrasena = new JLabel("Repetir Contrase\u00F1a");
		btnCnacelar = new JButton("Cancelar");
		btnNewButton = new JButton("Registrar");			
		passwordField = new JPasswordField();		
		passwordField_1 = new JPasswordField();	
		textField = new JTextField();
		textField.setColumns(10);	
		textField_1 = new JTextField();
		textField_1.setColumns(10);		
		textField_2 = new JTextField();
		textField_2.setColumns(10);		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(28)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNick)
						.addComponent(lblRepetircontrasena)
						.addComponent(lblEmail)
						.addComponent(lblApellidos)
						.addComponent(lblNombre)
						.addComponent(lblContrasena))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(passwordField_1, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(102, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(20)
					.addComponent(btnCnacelar, GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
					.addGap(44)
					.addComponent(btnNewButton)
					.addGap(84))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(48)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNick)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNombre)
							.addGap(12)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblApellidos)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblEmail)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblContrasena)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblRepetircontrasena)
						.addComponent(passwordField_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addGap(1)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(50)
							.addComponent(btnNewButton))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(63)
							.addComponent(btnCnacelar)))
					.addContainerGap(69, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
		setBounds(100, 100, 365, 385);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void setloginyNewMaterial(login login, NewMaterial nuevomaterial) {
		this.login = login;
		this.nuevomaterial = nuevomaterial;
	}
}
