import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Principal extends JFrame {

	private JTextField txtusuario;
	private Mantenimiento mantenimiento;
	private Registro registro;
	private JPasswordField passcontra;
	private JButton btnusuario;

	public void setmantenimientoyregistro(Mantenimiento mantenimiento, Registro registro) {
		this.mantenimiento = mantenimiento;
		this.registro = registro;
	}

	private void controllogin() {
		if (!txtusuario.getText().trim().equals("") && (!(((new String(passcontra.getPassword())).trim().equals("")))))
			btnusuario.setEnabled(true);
		else
			btnusuario.setEnabled(false);
	}

	public Principal() {

		setTitle("PANTALLA PRINCIPAL");
		getContentPane().setBackground(new Color(255, 51, 0));
		setVisible(false);
		txtusuario = new JTextField();
		txtusuario.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				controllogin();
			}
		});
		txtusuario.setColumns(10);

		JLabel lblusuario = new JLabel("USER:");
		lblusuario.setIcon(
				new ImageIcon("C:\\Users\\Usuario\\Desktop\\UEM\\Programaci\u00F3n\\interfaz materiales\\4.png"));
		lblusuario.setFont(new Font("Stencil", Font.PLAIN, 15));
		JLabel lblcontrasena = new JLabel("PASSWORD:");
		lblcontrasena.setIcon(
				new ImageIcon("C:\\Users\\Usuario\\Desktop\\UEM\\Programaci\u00F3n\\interfaz materiales\\pass.gif"));
		lblcontrasena.setFont(new Font("Stencil", Font.PLAIN, 15));
		JButton btnlogout = new JButton("LOGOUT");
		btnlogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnusuario = new JButton("LOGIN");
		btnusuario.setEnabled(false);
		btnusuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtusuario.getText().equals(new String(passcontra.getPassword()))) {
					setVisible(false);
					mantenimiento.setVisible(true);
				}
			}

		});

		JLabel label = new JLabel("");
		passcontra = new JPasswordField();
		passcontra.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				controllogin();

			}
		});

		JButton button = new JButton("SING IN");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				registro.setVisible(true);
			}
		});

		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(20)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(button, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnusuario, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnlogout, GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
						.addComponent(label)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblcontrasena)
								.addComponent(lblusuario, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(txtusuario, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
								.addComponent(passcontra, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))))
					.addGap(107))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(23)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(label)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblusuario, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtusuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblcontrasena)
								.addComponent(passcontra, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnusuario)
						.addComponent(button))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnlogout)
					.addGap(130))
		);
		getContentPane().setLayout(groupLayout);
		setBounds(100, 100, 337, 272);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
