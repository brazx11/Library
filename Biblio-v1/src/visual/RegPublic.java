package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JRadioButton;

import logico.Articulo;
import logico.Biblioteca;
import logico.Libro;
import logico.Publicacion;
import logico.Revista;

import javax.swing.SpinnerDateModel;

import java.util.Date;
import java.util.Calendar;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;
import java.awt.Font;

public class RegPublic extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtId;
	private JTextField txtTitle;
	private JTextField txtAutor;
	int mode;
	private JTextField txtNum;
	private JTextField textField;
	JPanel panel_revista;
	JPanel panel_articulo;
	JPanel panel_libro;
	JRadioButton rdbtnLibro;
	JRadioButton rdbtnArtculo;
	JRadioButton rdbtnRevista;
	JSpinner spnCant;
	JSpinner spnAnno;
	JComboBox cbxMateria;
	JComboBox cbxEditorial;

	
	

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the dialog.
	 */
	public RegPublic(String title, int mode) {
		setBounds(100, 100, 616, 496);
		this.mode = mode;
		setTitle(title);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Informaci\u00F3n General", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 582, 205);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblId = new JLabel("Id:");
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblId.setBounds(10, 22, 39, 14);
		panel.add(lblId);
		
		JLabel lblTtulo = new JLabel("T\u00EDtulo:");
		lblTtulo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTtulo.setBounds(10, 58, 46, 14);
		panel.add(lblTtulo);
		
		JLabel lblMateria = new JLabel("Materia:");
		lblMateria.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMateria.setBounds(10, 130, 89, 14);
		panel.add(lblMateria);
		
		JLabel lblCantidadDeEjemplares = new JLabel("Cantidad de Ejemplares:");
		lblCantidadDeEjemplares.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCantidadDeEjemplares.setBounds(10, 94, 160, 14);
		panel.add(lblCantidadDeEjemplares);
		
		JLabel lblAutor = new JLabel("Autor:");
		lblAutor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAutor.setBounds(10, 166, 46, 14);
		panel.add(lblAutor);
		
		txtId = new JTextField();
		txtId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtId.setBounds(81, 19, 160, 21);
		panel.add(txtId);
		txtId.setColumns(10);
		
		txtTitle = new JTextField();
		txtTitle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtTitle.setBounds(81, 55, 344, 21);
		panel.add(txtTitle);
		txtTitle.setColumns(10);
		
		txtAutor = new JTextField();
		txtAutor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtAutor.setBounds(81, 163, 368, 21);
		panel.add(txtAutor);
		txtAutor.setColumns(10);
		
		cbxMateria = new JComboBox();
		cbxMateria.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cbxMateria.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "F\u00EDsica", "Matem\u00E1tica", "POO", "Java", "C#", "Circuito", "Redes"}));
		cbxMateria.setBounds(81, 127, 160, 21);
		panel.add(cbxMateria);
		
		spnCant = new JSpinner();
		spnCant.setModel(new SpinnerNumberModel(1, 1, 20, 1));
		spnCant.setBounds(178, 91, 55, 21);
		panel.add(spnCant);
		Date date = new Date();
		
		panel_libro = new JPanel();
		panel_libro.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_libro.setBounds(10, 318, 582, 77);
		contentPanel.add(panel_libro);
		panel_libro.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Editorial:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 26, 55, 14);
		panel_libro.add(lblNewLabel);
		
		cbxEditorial = new JComboBox();
		cbxEditorial.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cbxEditorial.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Ambar", "Santillana", "Susaeta", "Coral", "McGraw Hill"}));
		cbxEditorial.setBounds(116, 23, 200, 21);
		panel_libro.add(cbxEditorial);
		
		panel_articulo = new JPanel();
		panel_articulo.setBounds(10, 306, 582, 77);
		contentPanel.add(panel_articulo);
		panel_articulo.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_articulo.setLayout(null);
		
		JLabel lblArbitro = new JLabel("Arbitro:");
		lblArbitro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblArbitro.setBounds(10, 29, 75, 14);
		panel_articulo.add(lblArbitro);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setBounds(95, 26, 331, 21);
		panel_articulo.add(textField);
		textField.setColumns(10);
		
		panel_revista = new JPanel();
		panel_revista.setBounds(10, 306, 582, 77);
		contentPanel.add(panel_revista);
		panel_revista.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_revista.setLayout(null);
		panel_revista.setVisible(false);
		
		JLabel lblAo = new JLabel("A\u00F1o:");
		lblAo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAo.setBounds(10, 21, 46, 14);
		panel_revista.add(lblAo);
		
		JLabel lblNmero = new JLabel("N\u00FAmero:");
		lblNmero.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNmero.setBounds(231, 21, 60, 14);
		panel_revista.add(lblNmero);
		
		txtNum = new JTextField();
		txtNum.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNum.setBounds(289, 18, 140, 21);
		panel_revista.add(txtNum);
		txtNum.setColumns(10);
		
		spnAnno = new JSpinner();
		spnAnno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spnAnno.setModel(new SpinnerDateModel(date, null, null, Calendar.YEAR));
		JSpinner.DateEditor de = new JSpinner.DateEditor(spnAnno, "yyyy");
		spnAnno.setEditor(de);
		spnAnno.setBounds(59, 18, 151, 21);
		panel_revista.add(spnAnno);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "Tipo de Publicaci\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(10, 226, 582, 58);
		contentPanel.add(panel_4);
		panel_4.setLayout(null);
		
		rdbtnLibro = new JRadioButton("Libro");
		rdbtnLibro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnLibro.setBounds(82, 18, 88, 23);
		panel_4.add(rdbtnLibro);
		rdbtnLibro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnLibro.setSelected(true);
				rdbtnRevista.setSelected(false);
				rdbtnArtculo.setSelected(false);
				panel_revista.setVisible(false);
				panel_articulo.setVisible(false);
				panel_libro.setVisible(true);
				txtAutor.setVisible(true);
			}
		});
		rdbtnLibro.setSelected(true);
		
		rdbtnArtculo = new JRadioButton("Art\u00EDculo");
		rdbtnArtculo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnArtculo.setBounds(252, 18, 88, 23);
		panel_4.add(rdbtnArtculo);
		
		rdbtnRevista = new JRadioButton("Revista");
		rdbtnRevista.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnRevista.setBounds(422, 18, 76, 23);
		panel_4.add(rdbtnRevista);
		rdbtnRevista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnLibro.setSelected(false);
				rdbtnArtculo.setSelected(false);
				rdbtnRevista.setSelected(true);
				panel_revista.setVisible(true);
				panel_articulo.setVisible(false);
				panel_libro.setVisible(false);
				txtAutor.setVisible(false);
			}
		});
		rdbtnArtculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnLibro.setSelected(false);
				rdbtnRevista.setSelected(false);
				rdbtnArtculo.setSelected(true);
				panel_revista.setVisible(false);
				panel_articulo.setVisible(true);
				panel_libro.setVisible(false);
				txtAutor.setVisible(false);
			}
		});
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnRegister = new JButton("Registrar");
				btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 16));
				btnRegister.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Publicacion aux = null;
						String id = txtId.getText();
						String titulo = txtTitle.getText();
						String autor = txtAutor.getText();
						int cant = new Integer(spnCant.getValue().toString());
						String materia = cbxMateria.getSelectedItem().toString();
						
						if(rdbtnRevista.isSelected()){
							SimpleDateFormat df = new SimpleDateFormat("yyyy");
							String d = df.format(spnAnno.getValue());						
														
							int anno = new Integer(d);
							int numero = new Integer(txtNum.getText()); 
							 aux = new Revista(id, titulo, autor, cant, true, materia, anno, numero);
						    
						}
						if(rdbtnArtculo.isSelected()){
							String arbitro = textField.getText();
							aux = new Articulo(id, titulo, autor, cant, true, materia, arbitro);
							
						}
						if(rdbtnLibro.isSelected()){
							String editorial = cbxEditorial.getSelectedItem().toString();
							aux = new Libro(id, titulo, autor, cant, materia, editorial);
							
						}
						Biblioteca.getInstance().insertPublicacion(aux);
						
					}
				});
				btnRegister.setActionCommand("OK");
				buttonPane.add(btnRegister);
				getRootPane().setDefaultButton(btnRegister);
			}
			{
				JButton btnCancel = new JButton("Cancel");
				btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 16));
				btnCancel.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				btnCancel.setActionCommand("Cancel");
				buttonPane.add(btnCancel);
			}
		}
	}
}
