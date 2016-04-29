import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class Mantenimiento extends JFrame {

	private JPanel contentPane;
	private Principal principal;
	private Registro registro;
	private Anadirpropiedad anadirpropiedad;
	private Anadirformato anadirformato;
	private Anadirmaterial anadirmaterial;
	private Anadiredificio anadiredificio;
	private Anadirfabricante anadirfabricante;
	private Anadiruso anadiruso;

	private JTabbedPane tabbedPane;
	private JPanel panel_materiales;
	private JPanel panel_propiedades;
	private JPanel panel_formatos;
	private JPanel panel_Fabricantes;
	private JPanel panel_edificios;
	private JButton btnAnadirPropiedad;
	private JButton btnAnadirFormato;
	private JButton btnAnadirFabricante;
	private JButton btnAnadirEdificios;
	private JTable table_material;
	private JButton btnAnadirMaterial;
	private JTable table_propiedad;
	private JTable table_formato;
	private JLabel lblProductos;
	private JTextField textField_Nombre;
	private JTextField textField_Precio;
	private JLabel lblPrecio;
	private JComboBox comboBox_Material;
	private JComboBox comboBox_Cat;
	private JComboBox comboBox_Formato;
	private JComboBox comboBox_Dimensiones;
	private JButton btnAnadirProducto;
	private JScrollPane scrollPane_productos;
	private JTable table_productos;
	private JTextField textField_valor;
	private JLabel lblMaterialProp;
	private JComboBox comboBox_MaterialProp;
	private JComboBox comboBox_PropiedadProp;
	private JButton btnAnadirRelacion;
	private JTable table_relacionMaterial;
	private JScrollPane scrollPane_formatos1;
	private JTable table_fabricante;
	private JLabel lblProducto;
	private JTextField textField_nombreRefeComercial;
	private JComboBox comboBox_FabriRefComercial;
	private JComboBox comboBox_ProduRefComercial;
	private JButton btnAnadirReferencia;
	private JLabel lblPropiedad_RefComercial;
	private JComboBox comboBox_PropRefComercial;
	private JTable table_RefComercial;
	private JComboBox comboBox_GradoRefComercial;
	private JScrollPane scrollPane_edificio;
	private JTable table_edificio;
	private JLabel lblUsos;
	private JLabel lblEdificios_usos;
	private JLabel lblProductos_usos;
	private JLabel lblNombre_usos;
	private JTextField textField_NombreUsos;
	private JComboBox comboBox_edificiosUsos;
	private JComboBox comboBox_productosUsos;
	private JButton btnAnadirUso;
	private JScrollPane scrollPane_usos;
	private JTable table_usos;

	public void settodo(Principal principal, Anadirpropiedad anadirpropiedad, Anadirformato anadirformato,
			Anadirmaterial anadirmaterial, Anadiredificio anadiredificio, Anadirfabricante anadirfabricante,
			Anadiruso anadiruso) {
		this.principal = principal;
		this.anadirpropiedad = anadirpropiedad;
		this.anadirformato = anadirformato;
		this.anadirmaterial = anadirmaterial;
		this.anadiredificio = anadiredificio;
		this.anadirfabricante = anadirfabricante;
		this.anadiruso = anadiruso;
	}

	public Mantenimiento() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 554, 529);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 523, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(tabbedPane,
				GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE));

		panel_materiales = new JPanel();
		tabbedPane.addTab("Materiales", null, panel_materiales, null);

		btnAnadirMaterial = new JButton("A\u00F1adir Material");
		btnAnadirMaterial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				anadirmaterial.setVisible(true);
			}
		});

		JScrollPane scrollPane_material1 = new JScrollPane();
		lblProductos = new JLabel("PRODUCTOS");
		JLabel lblNombre = new JLabel("Nombre:");
		lblPrecio = new JLabel("Precio:");
		textField_Nombre = new JTextField();
		textField_Nombre.setColumns(10);
		textField_Precio = new JTextField();
		textField_Precio.setColumns(10);
		JLabel lblMaterial = new JLabel("Material");
		JLabel lblCatFormato = new JLabel("Cat. Formato");
		JLabel lblFormato = new JLabel("Formato");
		JLabel lblDimensiones = new JLabel("Dimensiones");
		comboBox_Material = new JComboBox();
		comboBox_Cat = new JComboBox();
		comboBox_Formato = new JComboBox();
		comboBox_Dimensiones = new JComboBox();
		btnAnadirProducto = new JButton("A\u00F1adir Producto");
		scrollPane_productos = new JScrollPane();
		GroupLayout gl_panel_materiales = new GroupLayout(panel_materiales);
		gl_panel_materiales.setHorizontalGroup(gl_panel_materiales.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_materiales.createSequentialGroup()
						.addGroup(gl_panel_materiales.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_materiales.createSequentialGroup().addContainerGap().addComponent(
										scrollPane_productos, GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
						.addGroup(gl_panel_materiales.createSequentialGroup().addContainerGap()
								.addGroup(gl_panel_materiales.createParallelGroup(Alignment.LEADING)
										.addComponent(scrollPane_material1, GroupLayout.DEFAULT_SIZE, 498,
												Short.MAX_VALUE)
										.addComponent(btnAnadirMaterial)))
						.addGroup(gl_panel_materiales.createSequentialGroup().addGap(210).addComponent(lblProductos))
						.addGroup(gl_panel_materiales.createSequentialGroup().addGap(121)
								.addGroup(gl_panel_materiales.createParallelGroup(Alignment.LEADING, false)
										.addComponent(lblPrecio, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblNombre, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(gl_panel_materiales.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_materiales.createSequentialGroup()
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(textField_Nombre, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(Alignment.TRAILING,
												gl_panel_materiales.createSequentialGroup().addGap(10).addComponent(
														textField_Precio, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_panel_materiales.createSequentialGroup().addGap(20)
								.addGroup(gl_panel_materiales.createParallelGroup(Alignment.LEADING)
										.addComponent(lblMaterial).addComponent(comboBox_Material,
												GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(gl_panel_materiales.createParallelGroup(Alignment.LEADING)
										.addComponent(lblCatFormato)
										.addComponent(comboBox_Cat, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(gl_panel_materiales.createParallelGroup(Alignment.LEADING)
										.addComponent(lblFormato).addComponent(comboBox_Formato,
												GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(gl_panel_materiales.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_materiales.createSequentialGroup()
												.addComponent(comboBox_Dimensiones, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addGap(58).addComponent(btnAnadirProducto))
										.addComponent(lblDimensiones))
								.addGap(97)))
						.addContainerGap()));
		gl_panel_materiales
				.setVerticalGroup(gl_panel_materiales.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_materiales.createSequentialGroup().addContainerGap()
								.addComponent(btnAnadirMaterial).addGap(18)
								.addComponent(scrollPane_material1, GroupLayout.PREFERRED_SIZE, 109,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(lblProductos)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_panel_materiales.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNombre).addComponent(textField_Nombre,
												GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel_materiales.createParallelGroup(Alignment.BASELINE).addComponent(lblPrecio)
								.addComponent(textField_Precio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel_materiales.createParallelGroup(Alignment.BASELINE).addComponent(lblMaterial)
								.addComponent(lblCatFormato).addComponent(lblFormato).addComponent(lblDimensiones))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel_materiales.createParallelGroup(Alignment.BASELINE)
								.addComponent(comboBox_Material, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_Cat, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_Formato, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_Dimensiones, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnAnadirProducto))
						.addPreferredGap(ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
						.addComponent(scrollPane_productos, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));

		table_productos = new JTable();
		table_productos
				.setModel(new DefaultTableModel(
						new Object[][] { { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null }, },
						new String[] { "Nombre", "Precio", "Material", "Dimensiones" }));
		scrollPane_productos.setViewportView(table_productos);

		table_material = new JTable();
		table_material
				.setModel(new DefaultTableModel(
						new Object[][] { { null, null, null, null, null }, { null, null, null, null, null },
								{ null, null, null, null, null }, { null, null, null, null, null },
								{ null, null, null, null, null }, },
						new String[] { "Nombre", "Familia", "Subfamilia" }));
		scrollPane_material1.setViewportView(table_material);
		panel_materiales.setLayout(gl_panel_materiales);

		panel_propiedades = new JPanel();
		tabbedPane.addTab("Propiedades", null, panel_propiedades, null);

		btnAnadirPropiedad = new JButton("A\u00F1adir Propiedad");
		btnAnadirPropiedad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				anadirpropiedad.setVisible(true);

			}
		});

		JScrollPane scrollPane_propiedades1 = new JScrollPane();
		JLabel lblValor = new JLabel("Valor");
		JLabel lblRelacionConMateriales = new JLabel("Relacion con Materiales");
		textField_valor = new JTextField();
		textField_valor.setColumns(10);
		comboBox_MaterialProp = new JComboBox();
		comboBox_PropiedadProp = new JComboBox();
		lblMaterialProp = new JLabel("Material");
		JLabel lblPropiedad = new JLabel("Propiedad");
		btnAnadirRelacion = new JButton("A\u00F1adir Relacion");
		JScrollPane scrollPane_relacionMaterial = new JScrollPane();
		GroupLayout gl_panel_propiedades = new GroupLayout(panel_propiedades);
		gl_panel_propiedades.setHorizontalGroup(gl_panel_propiedades.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_propiedades.createSequentialGroup()
						.addGroup(gl_panel_propiedades.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_propiedades.createSequentialGroup().addContainerGap()
										.addGroup(gl_panel_propiedades.createParallelGroup(Alignment.LEADING)
												.addComponent(scrollPane_propiedades1, GroupLayout.DEFAULT_SIZE, 498,
														Short.MAX_VALUE)
												.addComponent(btnAnadirPropiedad)))
						.addGroup(gl_panel_propiedades.createSequentialGroup().addGap(197)
								.addComponent(lblRelacionConMateriales))
						.addGroup(gl_panel_propiedades.createSequentialGroup().addGap(19).addGroup(gl_panel_propiedades
								.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_propiedades.createSequentialGroup()
										.addGroup(gl_panel_propiedades.createParallelGroup(Alignment.TRAILING, false)
												.addComponent(textField_valor, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
												.addComponent(lblValor, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 33,
														Short.MAX_VALUE))
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addGroup(gl_panel_propiedades.createParallelGroup(Alignment.LEADING)
												.addComponent(lblMaterialProp).addComponent(comboBox_MaterialProp,
														GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE))
										.addGap(18)
										.addGroup(gl_panel_propiedades.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel_propiedades.createSequentialGroup()
														.addComponent(comboBox_PropiedadProp,
																GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addGap(31).addComponent(btnAnadirRelacion))
												.addComponent(lblPropiedad)))
								.addComponent(scrollPane_relacionMaterial, GroupLayout.PREFERRED_SIZE, 491,
										GroupLayout.PREFERRED_SIZE))
								.addGap(16)))
						.addContainerGap()));
		gl_panel_propiedades
				.setVerticalGroup(
						gl_panel_propiedades.createParallelGroup(Alignment.LEADING)
								.addGroup(
										gl_panel_propiedades.createSequentialGroup().addContainerGap()
												.addComponent(btnAnadirPropiedad).addGap(18)
												.addComponent(scrollPane_propiedades1, GroupLayout.PREFERRED_SIZE, 127,
														GroupLayout.PREFERRED_SIZE)
												.addGap(18).addComponent(lblRelacionConMateriales).addGap(14)
												.addGroup(gl_panel_propiedades.createParallelGroup(Alignment.BASELINE)
														.addComponent(lblValor, GroupLayout.PREFERRED_SIZE, 26,
																GroupLayout.PREFERRED_SIZE)
												.addComponent(lblMaterialProp).addComponent(lblPropiedad))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel_propiedades.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_valor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_MaterialProp, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_PropiedadProp, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnAnadirRelacion)).addGap(18)
						.addComponent(scrollPane_relacionMaterial, GroupLayout.PREFERRED_SIZE, 137,
								GroupLayout.PREFERRED_SIZE).addContainerGap(17, Short.MAX_VALUE)));

		table_relacionMaterial = new JTable();
		table_relacionMaterial.setModel(
				new DefaultTableModel(new Object[][] { { null, null, null }, { null, null, null }, { null, null, null },
						{ null, null, null }, }, new String[] { "Valor", "Material", "Propiedad" }));
		scrollPane_relacionMaterial.setViewportView(table_relacionMaterial);
		table_propiedad = new JTable();
		table_propiedad.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null }, { null, null, null, null, null },
						{ null, null, null, null, null }, { null, null, null, null, null },
						{ null, null, null, null, null }, { null, null, null, null, null }, },
				new String[] { "Nombre", "Categoria", "Rango" }));
		scrollPane_propiedades1.setViewportView(table_propiedad);
		panel_propiedades.setLayout(gl_panel_propiedades);
		panel_formatos = new JPanel();
		tabbedPane.addTab("Formatos", null, panel_formatos, null);
		btnAnadirFormato = new JButton("A\u00F1adir Formato");
		btnAnadirFormato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				anadirformato.setVisible(true);
			}
		});

		scrollPane_formatos1 = new JScrollPane();
		GroupLayout gl_panel_formatos = new GroupLayout(panel_formatos);
		gl_panel_formatos.setHorizontalGroup(gl_panel_formatos.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_formatos.createSequentialGroup()
						.addGroup(gl_panel_formatos.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_formatos.createSequentialGroup().addContainerGap()
										.addComponent(btnAnadirFormato))
						.addGroup(gl_panel_formatos.createSequentialGroup().addGap(21).addComponent(
								scrollPane_formatos1, GroupLayout.PREFERRED_SIZE, 468, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(29, Short.MAX_VALUE)));
		gl_panel_formatos
				.setVerticalGroup(gl_panel_formatos.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_formatos.createSequentialGroup().addContainerGap()
								.addComponent(btnAnadirFormato).addGap(18).addComponent(scrollPane_formatos1,
										GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(252, Short.MAX_VALUE)));

		table_formato = new JTable();
		table_formato
				.setModel(
						new DefaultTableModel(
								new Object[][] { { null, null }, { null, null }, { null, null }, { null, null },
										{ null, null }, { null, null }, { null, null }, },
								new String[] { "Nombre", "Categoria" }));
		scrollPane_formatos1.setViewportView(table_formato);
		panel_formatos.setLayout(gl_panel_formatos);
		panel_Fabricantes = new JPanel();
		tabbedPane.addTab("Fabricantes", null, panel_Fabricantes, null);
		btnAnadirFabricante = new JButton("A\u00F1adir Fabricante");
		btnAnadirFabricante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				anadirfabricante.setVisible(true);
			}
		});
		JScrollPane scrollPane_fabricante = new JScrollPane();
		JLabel lblRelacionProductofabricante = new JLabel("Referencias comerciales");
		lblProducto = new JLabel("Producto");
		JLabel lblFabricante = new JLabel("Fabricante");
		JLabel lblNombre_1 = new JLabel("Nombre");
		textField_nombreRefeComercial = new JTextField();
		textField_nombreRefeComercial.setColumns(10);
		comboBox_ProduRefComercial = new JComboBox();
		comboBox_FabriRefComercial = new JComboBox();
		btnAnadirReferencia = new JButton("A\u00F1adir Referencia");
		lblPropiedad_RefComercial = new JLabel("Propiedad");
		comboBox_PropRefComercial = new JComboBox();
		JScrollPane scrollPane_RefComercial = new JScrollPane();
		JLabel lblGrado = new JLabel("Grado");
		comboBox_GradoRefComercial = new JComboBox();
		GroupLayout gl_panel_Fabricantes = new GroupLayout(panel_Fabricantes);
		gl_panel_Fabricantes.setHorizontalGroup(gl_panel_Fabricantes.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_Fabricantes.createSequentialGroup()
						.addGroup(gl_panel_Fabricantes.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_Fabricantes.createSequentialGroup().addGap(10)
										.addComponent(btnAnadirFabricante))
						.addGroup(gl_panel_Fabricantes.createSequentialGroup().addContainerGap().addComponent(
								scrollPane_fabricante, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_Fabricantes.createSequentialGroup().addGap(189)
								.addComponent(lblRelacionProductofabricante))
						.addGroup(gl_panel_Fabricantes.createSequentialGroup().addGap(166)
								.addGroup(gl_panel_Fabricantes.createParallelGroup(Alignment.LEADING)
										.addComponent(lblProducto).addComponent(comboBox_ProduRefComercial,
												GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(gl_panel_Fabricantes.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_Fabricantes.createSequentialGroup().addGap(10).addComponent(
												comboBox_FabriRefComercial, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addComponent(lblFabricante))
								.addGap(21).addComponent(btnAnadirReferencia))
						.addGroup(gl_panel_Fabricantes.createSequentialGroup().addGap(141)
								.addGroup(gl_panel_Fabricantes.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_Fabricantes.createSequentialGroup()
												.addComponent(lblPropiedad_RefComercial)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(comboBox_PropRefComercial, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addGap(18).addComponent(lblGrado)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(comboBox_GradoRefComercial, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_Fabricantes.createSequentialGroup().addComponent(lblNombre_1)
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(textField_nombreRefeComercial, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_panel_Fabricantes.createSequentialGroup().addContainerGap().addComponent(
								scrollPane_RefComercial, GroupLayout.PREFERRED_SIZE, 499, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		gl_panel_Fabricantes
				.setVerticalGroup(gl_panel_Fabricantes.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_Fabricantes.createSequentialGroup().addGap(11)
								.addComponent(btnAnadirFabricante).addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(scrollPane_fabricante, GroupLayout.PREFERRED_SIZE, 97,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(lblRelacionProductofabricante).addGap(5)
								.addGroup(gl_panel_Fabricantes.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNombre_1).addComponent(textField_nombreRefeComercial,
												GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(gl_panel_Fabricantes.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPropiedad_RefComercial)
								.addComponent(comboBox_PropRefComercial, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblGrado).addComponent(comboBox_GradoRefComercial,
										GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGap(10)
						.addGroup(gl_panel_Fabricantes.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblFabricante).addComponent(lblProducto))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(gl_panel_Fabricantes.createParallelGroup(Alignment.BASELINE)
								.addComponent(comboBox_FabriRefComercial, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_ProduRefComercial, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnAnadirReferencia)).addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(scrollPane_RefComercial, GroupLayout.PREFERRED_SIZE, 144,
								GroupLayout.PREFERRED_SIZE).addContainerGap(16, Short.MAX_VALUE)));

		table_RefComercial = new JTable();
		table_RefComercial.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null }, { null, null, null, null, null },
						{ null, null, null, null, null }, { null, null, null, null, null },
						{ null, null, null, null, null }, },
				new String[] { "Nombre", "Propiedad", "Grado", "Producto", "Fabricante" }));
		scrollPane_RefComercial.setViewportView(table_RefComercial);
		table_fabricante = new JTable();
		table_fabricante.setModel(new DefaultTableModel(
				new Object[][] { { null }, { null }, { null }, { null }, { null }, }, new String[] { "Nombre" }));
		scrollPane_fabricante.setViewportView(table_fabricante);
		panel_Fabricantes.setLayout(gl_panel_Fabricantes);
		panel_edificios = new JPanel();
		tabbedPane.addTab("Edificios", null, panel_edificios, null);
		btnAnadirEdificios = new JButton("A\u00F1adir Edificio");
		btnAnadirEdificios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				anadiredificio.setVisible(true);
			}
		});

		scrollPane_edificio = new JScrollPane();
		lblUsos = new JLabel("Usos");
		lblEdificios_usos = new JLabel("Edificios");
		lblProductos_usos = new JLabel("Productos");
		lblNombre_usos = new JLabel("Nombre");
		textField_NombreUsos = new JTextField();
		textField_NombreUsos.setColumns(10);
		comboBox_edificiosUsos = new JComboBox();
		comboBox_productosUsos = new JComboBox();
		btnAnadirUso = new JButton("A\u00F1adir Uso");
		btnAnadirUso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		scrollPane_usos = new JScrollPane();
		GroupLayout gl_panel_edificios = new GroupLayout(panel_edificios);
		gl_panel_edificios.setHorizontalGroup(gl_panel_edificios.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_edificios.createSequentialGroup()
						.addGroup(gl_panel_edificios.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_edificios.createSequentialGroup().addContainerGap()
										.addGroup(gl_panel_edificios.createParallelGroup(Alignment.LEADING)
												.addComponent(btnAnadirEdificios).addComponent(scrollPane_edificio,
														GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_edificios.createSequentialGroup().addGap(211).addComponent(lblUsos))
						.addGroup(gl_panel_edificios.createSequentialGroup().addGap(142).addComponent(lblNombre_usos)
								.addPreferredGap(ComponentPlacement.RELATED).addComponent(textField_NombreUsos,
										GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_edificios.createSequentialGroup().addGap(168)
								.addGroup(gl_panel_edificios.createParallelGroup(Alignment.LEADING)
										.addComponent(lblEdificios_usos).addComponent(comboBox_edificiosUsos,
												GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(gl_panel_edificios.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_edificios.createSequentialGroup()
												.addComponent(comboBox_productosUsos, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addGap(33).addComponent(btnAnadirUso))
										.addComponent(lblProductos_usos)))
						.addGroup(gl_panel_edificios.createSequentialGroup().addContainerGap().addComponent(
								scrollPane_usos, GroupLayout.PREFERRED_SIZE, 499, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		gl_panel_edificios
				.setVerticalGroup(
						gl_panel_edificios.createParallelGroup(Alignment.LEADING)
								.addGroup(
										gl_panel_edificios.createSequentialGroup().addContainerGap()
												.addComponent(btnAnadirEdificios)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(scrollPane_edificio, GroupLayout.PREFERRED_SIZE, 129,
														GroupLayout.PREFERRED_SIZE)
												.addGap(18).addComponent(lblUsos)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addGroup(gl_panel_edificios.createParallelGroup(Alignment.BASELINE)
														.addComponent(lblNombre_usos).addComponent(textField_NombreUsos,
																GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(gl_panel_edificios.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblEdificios_usos).addComponent(lblProductos_usos))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel_edificios.createParallelGroup(Alignment.BASELINE)
								.addComponent(comboBox_edificiosUsos, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_productosUsos, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnAnadirUso)).addGap(18)
						.addComponent(scrollPane_usos, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		table_usos = new JTable();
		table_usos
				.setModel(new DefaultTableModel(
						new Object[][] { { null, null, null }, { null, null, null }, { null, null, null },
								{ null, null, null }, { null, null, null }, },
						new String[] { "Nombre", "Edificio", "Producto" }));
		scrollPane_usos.setViewportView(table_usos);
		table_edificio = new JTable();
		table_edificio
				.setModel(new DefaultTableModel(
						new Object[][] { { null, null, null }, { null, null, null }, { null, null, null },
								{ null, null, null }, { null, null, null }, },
						new String[] { "Nombre", "Descripcion", "Foto" }));
		scrollPane_edificio.setViewportView(table_edificio);
		panel_edificios.setLayout(gl_panel_edificios);
		JPanel panel_noticia = new JPanel();
		tabbedPane.addTab("Noticia", null, panel_noticia, null);
		JPanel panel_info = new JPanel();
		tabbedPane.addTab("Info", null, panel_info, null);
		contentPane.setLayout(gl_contentPane);
	}
}