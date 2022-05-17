package Proyecto1;

import Proyecto1.Inicio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;

public class Registro extends JFrame {

	private JPanel contentPane;
	private JTextField textIdPersona;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDptoResidencia;
	private JTextField txtCantHijos;
	private JTextField txtFecNacimiento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro frame = new Registro();
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
	public Registro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 493, 556);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(248, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(248, 248, 255));
		panel.setBounds(10, 76, 459, 346);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(6, 2, 5, 5));
		
		JLabel lblNewLabel = new JLabel("    C\u00E9dula:");
		lblNewLabel.setFont(new Font("Consolas", Font.BOLD, 15));
		panel.add(lblNewLabel);
		
		textIdPersona = new JTextField();
		panel.add(textIdPersona);
		textIdPersona.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("    Nombre:");
		lblNewLabel_1.setFont(new Font("Consolas", Font.BOLD, 15));
		panel.add(lblNewLabel_1);
		
		txtNombre = new JTextField();
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("    Apellido:");
		lblNewLabel_2.setFont(new Font("Consolas", Font.BOLD, 15));
		panel.add(lblNewLabel_2);
		
		txtApellido = new JTextField();
		panel.add(txtApellido);
		txtApellido.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("    Departamento:");
		lblNewLabel_3.setFont(new Font("Consolas", Font.BOLD, 15));
		panel.add(lblNewLabel_3);
		
		txtDptoResidencia = new JTextField();
		panel.add(txtDptoResidencia);
		txtDptoResidencia.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("    Cantidad de hijos:");
		lblNewLabel_4.setFont(new Font("Consolas", Font.BOLD, 15));
		panel.add(lblNewLabel_4);
		
		txtCantHijos = new JTextField();
		panel.add(txtCantHijos);
		txtCantHijos.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("    Fecha de nacimiento:");
		lblNewLabel_5.setFont(new Font("Consolas", Font.BOLD, 15));
		panel.add(lblNewLabel_5);
		
		txtFecNacimiento = new JTextField();
		txtFecNacimiento.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtFecNacimiento.getText().equals("DD/MM/AAAA")){
					txtFecNacimiento.setText("");
				}
				else {
					txtFecNacimiento.selectAll();
				}
			}
		});
		txtFecNacimiento.setText("DD/MM/AAAA");
		panel.add(txtFecNacimiento);
		txtFecNacimiento.setColumns(10);
		
		JTextPane txtpnIngresaTusDatos = new JTextPane();
		txtpnIngresaTusDatos.setFont(new Font("Courier New", Font.PLAIN, 27));
		txtpnIngresaTusDatos.setText("Ingresa tus datos");
		txtpnIngresaTusDatos.setBackground(new Color(216, 191, 216));
		txtpnIngresaTusDatos.setBounds(10, 20, 459, 46);
		contentPane.add(txtpnIngresaTusDatos);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int ID;
				String Nombre,Apellido,DeptoResidencia;
				byte cantiHijos;
				LocalDate fechaNacimiento;
				
				ID=Integer.parseInt(textIdPersona.getText());
				Nombre=txtNombre.getText();
				Apellido=txtApellido.getText();
				DeptoResidencia=txtDptoResidencia.getText();
				cantiHijos = Byte.parseByte(textIdPersona.getText());
				fechaNacimiento = LocalDate.parse(txtFecNacimiento.getText());
				
				//txtField.setText(String.valueof(c)); -> convertir un entero en un texto, no se si se podrá comvertir una variable en un texto
				
				
				}
		});
		btnNewButton.setBackground(new Color(188, 143, 143));
		btnNewButton.setForeground(new Color(0, 0, 0));
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textIdPersona.getText().equals(null) || txtNombre.getText().equals("") || txtApellido.getText().equals("") || 
						txtDptoResidencia.getText().equals("") || txtCantHijos.getText().equals(null) || txtFecNacimiento.getText().equals(null)); {
					
							JOptionPane.showMessageDialog(null,"Uno o varios campos están en blanco!");
				}
				}
			
		});
		btnNewButton.setBounds(118, 449, 231, 38);
		contentPane.add(btnNewButton);
	}
}
