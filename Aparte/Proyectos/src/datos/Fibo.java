package datos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Fibo extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumero;
	private JTextField txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Fibo f = new Fibo();
		f.setVisible(true);
		
		
	}

	/**
	 * Create the frame.
	 */
	public Fibo() {
		setTitle("Fibonacci");
		setForeground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FIBONACCI");
		lblNewLabel.setBounds(167, 0, 79, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Numero de Consulta");
		lblNewLabel_1.setBounds(10, 42, 155, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado");
		lblNewLabel_2.setBounds(10, 67, 96, 14);
		contentPane.add(lblNewLabel_2);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(189, 41, 96, 20);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);
		
		txtResultado = new JTextField();
		txtResultado.setEditable(false);
		txtResultado.setBounds(189, 64, 96, 20);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				capturar();
			}
			void capturar() {
				int n;
				n=Integer.parseInt(txtNumero.getText());
				int a=0,b=1,c=0,e=1;
				for(int i =2;i<=n;i++) {
					c=a+b;
					e+=c;
					a=b;
					b=c;
				}
				txtResultado.setText(Integer.toString(c));
				
			}
			
		});
		btnConsultar.setBounds(81, 152, 125, 23);
		contentPane.add(btnConsultar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtResultado.setText("");
				txtNumero.setText("");
			}
		});
		btnLimpiar.setBounds(242, 152, 125, 23);
		contentPane.add(btnLimpiar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
			
		});
		
		btnSalir.setBounds(175, 208, 89, 23);
		contentPane.add(btnSalir);
	}
}
