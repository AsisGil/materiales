import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.EventQueue;

public class Anadirfabricante extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private Mantenimiento mantenimiento;

	public void setNewMaterial(Mantenimiento mantenimiento) {
		this.mantenimiento = mantenimiento;

	}

	public Anadirfabricante() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 360, 203);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblNuevoFormato = new JLabel("NUEVO FABRICANTE");
		lblNuevoFormato.setForeground(Color.BLACK);
		lblNuevoFormato.setFont(new Font("Times New Roman", Font.BOLD, 20));

		JLabel label_Nombre = new JLabel("Nombre");
		label_Nombre.setFont(new Font("Perpetua Titling MT", Font.BOLD, 13));

		textField = new JTextField();
		textField.setColumns(10);

		JButton btnAadirPropiedad = new JButton("A\u00F1adir Fabricante");
		btnAadirPropiedad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				mantenimiento.setVisible(true);
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup().addGap(61)
										.addComponent(label_Nombre, GroupLayout.PREFERRED_SIZE, 62,
												GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(85).addComponent(btnAadirPropiedad,
								GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING,
								gl_contentPane.createSequentialGroup().addContainerGap().addComponent(lblNuevoFormato,
										GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(85, Short.MAX_VALUE)));
		gl_contentPane
				.setVerticalGroup(
						gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup().addGap(28)
										.addComponent(lblNuevoFormato, GroupLayout.PREFERRED_SIZE, 24,
												GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(label_Nombre, GroupLayout.PREFERRED_SIZE, 17,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
										.addGap(18).addComponent(btnAadirPropiedad)
										.addContainerGap(120, Short.MAX_VALUE)));
		contentPane.setLayout(gl_contentPane);
	}

}