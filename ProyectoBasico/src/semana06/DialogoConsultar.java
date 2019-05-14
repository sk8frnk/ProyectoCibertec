package semana06;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DialogoConsultar extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private JLabel lblMarca;
	private JLabel lblPrecio;
	private JLabel lblGarantia;
	private JLabel lblTama�o;
	private JLabel lblMaterial;
	private JTextField txtPrecio;
	private JTextField txtGarantia;
	private JTextField txtTama�o;
	private JTextField txtMaterial;
	private JComboBox cboMarca;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogoConsultar dialog = new DialogoConsultar();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogoConsultar() {
		setTitle("Consultar colch\u00F3n");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblMarca = new JLabel("Marca");
		lblMarca.setBounds(10, 30, 46, 14);
		contentPanel.add(lblMarca);
		
		lblPrecio = new JLabel("Precio (S/.)");
		lblPrecio.setBounds(10, 55, 61, 14);
		contentPanel.add(lblPrecio);
		
		lblGarantia = new JLabel("Garant\u00EDa (a\u00F1os)");
		lblGarantia.setBounds(10, 80, 81, 14);
		contentPanel.add(lblGarantia);
		
		lblTama�o = new JLabel("Tama\u00F1o");
		lblTama�o.setBounds(10, 105, 46, 14);
		contentPanel.add(lblTama�o);
		
		lblMaterial = new JLabel("Material");
		lblMaterial.setBounds(10, 130, 46, 14);
		contentPanel.add(lblMaterial);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(112, 52, 155, 20);
		contentPanel.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtGarantia = new JTextField();
		txtGarantia.setEditable(false);
		txtGarantia.setBounds(112, 77, 155, 20);
		contentPanel.add(txtGarantia);
		txtGarantia.setColumns(10);
		
		txtTama�o = new JTextField();
		txtTama�o.setEditable(false);
		txtTama�o.setBounds(112, 102, 155, 20);
		contentPanel.add(txtTama�o);
		txtTama�o.setColumns(10);
		
		txtMaterial = new JTextField();
		txtMaterial.setEditable(false);
		txtMaterial.setBounds(112, 127, 155, 20);
		contentPanel.add(txtMaterial);
		txtMaterial.setColumns(10);
		
		cboMarca = new JComboBox();
		cboMarca.addActionListener(this);
		cboMarca.setModel(new DefaultComboBoxModel(new String[] {"Suavestar", "Springwall", "Paraiso", "Drimer", "Cisne"}));
		cboMarca.setBounds(112, 27, 155, 20);
		contentPanel.add(cboMarca);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(335, 26, 89, 23);
		contentPanel.add(btnCerrar);
		// fijar Suavizar como predeterminado
		txtPrecio.setText(""+ JFrameTienda.precio0);
		txtGarantia.setText("" + JFrameTienda.garantia0);
		txtTama�o.setText("" + JFrameTienda.tama�o0);
		txtMaterial.setText("" + JFrameTienda.material0);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cboMarca) {
			actionPerformedCboMarca(e);
		}
		if (e.getSource() == btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
	
	protected void actionPerformedCboMarca(ActionEvent e) {
		
	}
}
