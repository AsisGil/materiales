
import java.awt.EventQueue;
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

public class login extends JFrame {

	private JTextField txtusuario;
	private NewMaterial nuevomaterial;
	private singin singin;
	private JPasswordField passcontra;

	public login() {

		setTitle("REGISTRO");
		getContentPane().setBackground(Color.ORANGE);
		setVisible(false);
		txtusuario = new JTextField();
		txtusuario.setColumns(10);

		JLabel lblusuario = new JLabel("USER:");
		lblusuario.setIcon(
				new ImageIcon("C:\\Users\\Usuario\\Desktop\\UEM\\Programaci\u00F3n\\interfaz materiales\\user.png"));
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
		JButton btnsingin = new JButton("SING IN");
		btnsingin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				singin.setVisible(true);
			}
		});
		JButton btnusuario = new JButton("LOGIN");
		btnusuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtusuario.getText().equals(new String(passcontra.getPassword()))) {
					setVisible(false);
					nuevomaterial.setVisible(true);
				}
			}
		});

		JLabel label = new JLabel("");
		passcontra = new JPasswordField();
		JLabel lblNewLabel = new JLabel("New label");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup().addGap(114).addComponent(label))
								.addGroup(groupLayout.createSequentialGroup().addGap(22)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addGroup(groupLayout.createSequentialGroup()
														.addComponent(btnlogout, GroupLayout.DEFAULT_SIZE, 83,
																Short.MAX_VALUE)
														.addGap(18)
														.addComponent(btnsingin, GroupLayout.PREFERRED_SIZE, 83,
																GroupLayout.PREFERRED_SIZE)
														.addGap(18)
														.addComponent(btnusuario, GroupLayout.DEFAULT_SIZE, 93,
																Short.MAX_VALUE)
														.addGap(8))
										.addGroup(
												groupLayout.createParallelGroup(Alignment.TRAILING, false)
														.addGroup(groupLayout.createSequentialGroup()
																.addComponent(lblcontrasena)
																.addPreferredGap(ComponentPlacement.UNRELATED)
																.addComponent(passcontra, GroupLayout.PREFERRED_SIZE,
																		112, GroupLayout.PREFERRED_SIZE))
												.addGroup(groupLayout.createSequentialGroup()
														.addComponent(lblusuario, GroupLayout.PREFERRED_SIZE, 94,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(ComponentPlacement.RELATED,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(txtusuario, GroupLayout.PREFERRED_SIZE, 111,
																GroupLayout.PREFERRED_SIZE)
														.addGap(1))))))
						.addContainerGap())
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup().addContainerGap(409, Short.MAX_VALUE)
						.addComponent(lblNewLabel).addGap(143)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addGap(
						23)
				.addComponent(label)
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
						.createSequentialGroup().addGap(68)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(lblcontrasena)
								.addComponent(passcontra, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(lblusuario)
										.addComponent(txtusuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))))
						.addGap(24).addComponent(lblNewLabel)
						.addPreferredGap(ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(btnlogout)
								.addComponent(btnsingin).addComponent(btnusuario))
						.addGap(27)));
		getContentPane().setLayout(groupLayout);
		setBounds(100, 100, 614, 402);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void setNewMaterialysingin(NewMaterial nuevomaterial, singin singin) {
		this.nuevomaterial = nuevomaterial;
		this.singin = singin;
	}
}
