import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.EventQueue;


public class Anadirpropiedad extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNombre;
	private Mantenimiento mantenimiento;

	public void setNewMaterial(Mantenimiento mantenimiento) {
		this.mantenimiento = mantenimiento;

	}

	public Anadirpropiedad() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 301, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel labelNuevo = new JLabel("NUEVO PROPIEDAD");
		labelNuevo.setForeground(Color.BLACK);
		labelNuevo.setFont(new Font("Times New Roman", Font.BOLD, 20));

		JLabel labelNombre = new JLabel("Nombre");
		labelNombre.setFont(new Font("Perpetua Titling MT", Font.BOLD, 13));

		textFieldNombre = new JTextField();
		textFieldNombre.setColumns(10);

		JLabel labelCategoria = new JLabel("Categoria");
		labelCategoria.setFont(new Font("Perpetua Titling MT", Font.BOLD, 13));

		JComboBox comboBoxCategoria = new JComboBox();

		JLabel labelRango = new JLabel("Rango");
		labelRango.setFont(new Font("Perpetua Titling MT", Font.BOLD, 13));

		JComboBox comboBoxRango = new JComboBox();

		JButton btnAadirPropiedad = new JButton("A\u00F1adir Propiedad");
		btnAadirPropiedad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				mantenimiento.setVisible(true);
				
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(34)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(labelNombre, GroupLayout.PREFERRED_SIZE, 62,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(textFieldNombre,
												GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(labelCategoria, GroupLayout.PREFERRED_SIZE, 95,
												GroupLayout.PREFERRED_SIZE)
								.addComponent(labelRango, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(comboBoxRango, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(comboBoxCategoria, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(labelNuevo).addGroup(Alignment.TRAILING,
								gl_contentPane.createSequentialGroup().addComponent(btnAadirPropiedad)
										.addPreferredGap(ComponentPlacement.RELATED)))
				.addContainerGap(196, Short.MAX_VALUE)));
		gl_contentPane
				.setVerticalGroup(
						gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup().addGap(25)
										.addComponent(labelNuevo, GroupLayout.PREFERRED_SIZE, 24,
												GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(labelNombre, GroupLayout.PREFERRED_SIZE, 17,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(textFieldNombre, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(labelCategoria, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxCategoria, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBoxRango, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(labelRango, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
				.addGap(18).addComponent(btnAadirPropiedad).addContainerGap(36, Short.MAX_VALUE)));
		contentPane.setLayout(gl_contentPane);
	}
}