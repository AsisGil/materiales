
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTabbedPane;

public class NewMaterial extends JFrame {

	private JPanel contentPane;
	private login login;
	private singin singin;
	
	public NewMaterial() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 549, 413);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane
				.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addContainerGap()
								.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
								.addContainerGap()));
		gl_contentPane
				.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addContainerGap()
								.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
								.addContainerGap()));

		JTabbedPane tabbedPane_Material = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Materiales", null, tabbedPane_Material, null);

		JTabbedPane tabbedPane_Productos = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Productos", null, tabbedPane_Productos, null);

		JTabbedPane tabbedPane_Edificios = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Edificios", null, tabbedPane_Edificios, null);
		contentPane.setLayout(gl_contentPane);
	}

	public void setloginysingin(login login, singin singin) {
		this.login = login;
		this.singin = singin;
	}

}
