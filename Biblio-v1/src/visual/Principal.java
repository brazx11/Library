package visual;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logico.Biblioteca;
import logico.Libro;
import java.awt.Font;

public class Principal extends JFrame {

	private JPanel contentPane;
	private Dimension dim;
  
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setTitle("Biblioteca Nacional");
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 571, 417);
		dim = super.getToolkit().getScreenSize(); 
		super.setSize(dim.width, dim.height-100);
		setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		setJMenuBar(menuBar);
		
		JMenu mnRegistroDeClientes = new JMenu("Clientes");
		mnRegistroDeClientes.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		menuBar.add(mnRegistroDeClientes);
		
		JMenu mnRegistroDePublic = new JMenu("Publicaciones");
		mnRegistroDePublic.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		menuBar.add(mnRegistroDePublic);
		
		JMenuItem mntmRegistro = new JMenuItem("Registro de Clientes");
		mntmRegistro.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mnRegistroDeClientes.add(mntmRegistro);
		
		JMenuItem mntmRegistroPublic = new JMenuItem("Registro de Publicaciones");
		mntmRegistroPublic.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mntmRegistroPublic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegPublic reg = new RegPublic("Registro de Publicaciones",0);
				reg.setModal(true);
				reg.setLocationRelativeTo(null);
				reg.setVisible(true);
				
			}
		});
		mnRegistroDePublic.add(mntmRegistroPublic);
		
		JMenu mnListadoDePublic = new JMenu("Listados");
		mnListadoDePublic.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		menuBar.add(mnListadoDePublic);
		
		JMenuItem mntmListado = new JMenuItem("Listado de Publicaciones");
		mntmListado.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		mntmListado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PublicList list = new PublicList();
				list.setModal(true);
				list.setLocationRelativeTo(null);
				list.setVisible(true);
			}
		});
		mnListadoDePublic.add(mntmListado);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
	
}
