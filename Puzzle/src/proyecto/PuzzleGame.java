package proyecto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PuzzleGame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PuzzleGame frame = new PuzzleGame();
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
	public PuzzleGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 326, 193);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton uno = new JButton("1");
		
		uno.setBounds(10, 11, 89, 37);
		contentPane.add(uno);
		
		JButton dos = new JButton("2");
		
		dos.setBounds(109, 11, 89, 37);
		contentPane.add(dos);
		
		JButton tres = new JButton("3");
		
		tres.setBounds(208, 11, 89, 37);
		contentPane.add(tres);
		
		JButton cuatro = new JButton("4");
		
		cuatro.setBounds(10, 59, 89, 38);
		contentPane.add(cuatro);
		
		JButton siete = new JButton("7");
		
		siete.setBounds(10, 108, 89, 37);
		contentPane.add(siete);
		
		JButton cinco = new JButton("5");
		
		cinco.setBounds(109, 59, 89, 38);
		contentPane.add(cinco);
		
		JButton ocho = new JButton("8");
		
		ocho.setBounds(109, 108, 89, 37);
		contentPane.add(ocho);
		JButton nueve = new JButton("9");
		
		nueve.setBounds(208, 108, 89, 37);
		contentPane.add(nueve);
		setLocationRelativeTo(null);
		nueve.setVisible(false);
		
		JButton seis = new JButton("6");
		seis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(nueve.isVisible()==false) {
					nueve.setText(seis.getText());
					nueve.setIcon(seis.getIcon());
					seis.setVisible(false);
					nueve.setVisible(true);
					
				}
				if(tres.isVisible()==false) {
					tres.setText(seis.getText());
					tres.setIcon(seis.getIcon());
					seis.setVisible(false);
					tres.setVisible(true);
					
				}
				if(cinco.isVisible()==false) {
					cinco.setText(seis.getText());
					cinco.setIcon(seis.getIcon());
					seis.setVisible(false);
					cinco.setVisible(true);
					
				}
				
			}
		});
		nueve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(seis.isVisible()==false) {
					seis.setText(nueve.getText());
					seis.setIcon(nueve.getIcon());
					nueve.setVisible(false);
					seis.setVisible(true);			
				}
				if(ocho.isVisible()==false) {
					ocho.setText(nueve.getText());
					ocho.setIcon(nueve.getIcon());
					nueve.setVisible(false);
					ocho.setVisible(true);
					
				}
				
			}
		});
		tres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(dos.isVisible()==false) {
					dos.setText(tres.getText());
					dos.setIcon(tres.getIcon());
					tres.setVisible(false);
					dos.setVisible(true);
					
				}
				if(seis.isVisible()==false) {
					seis.setText(tres.getText());
					seis.setIcon(tres.getIcon());
					tres.setVisible(false);
					seis.setVisible(true);
					
				}
			}
		});
		dos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(uno.isVisible()==false) {
					uno.setText(dos.getText());
					uno.setIcon(dos.getIcon());
					dos.setVisible(false);
					uno.setVisible(true);
					
				}
				if(tres.isVisible()==false) {
					tres.setText(dos.getText());
					tres.setIcon(dos.getIcon());
					dos.setVisible(false);
					tres.setVisible(true);
					
				}
				if(cinco.isVisible()==false) {
					cinco.setText(dos.getText());
					cinco.setIcon(dos.getIcon());
					dos.setVisible(false);
					cinco.setVisible(true);
					
				}
			}
		});
		cinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(ocho.isVisible()==false) {
					ocho.setText(cinco.getText());
					ocho.setIcon(cinco.getIcon());
					cinco.setVisible(false);
					ocho.setVisible(true);
					
				}
				if(seis.isVisible()==false) {
					seis.setText(cinco.getText());
					seis.setIcon(cinco.getIcon());
					cinco.setVisible(false);
					seis.setVisible(true);
					
				}
				if(cuatro.isVisible()==false) {
					cuatro.setText(cinco.getText());
					cuatro.setIcon(cinco.getIcon());
					cinco.setVisible(false);
					cuatro.setVisible(true);
					
				}
				if(dos.isVisible()==false) {
					dos.setText(cinco.getText());
					dos.setIcon(cinco.getIcon());
					cinco.setVisible(false);
					dos.setVisible(true);
					
				}
				
			}
		});
		ocho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(nueve.isVisible()==false) {
					nueve.setText(ocho.getText());
					nueve.setIcon(ocho.getIcon());
					ocho.setVisible(false);
					nueve.setVisible(true);
					
				}
				if(siete.isVisible()==false) {
					siete.setText(ocho.getText());
					siete.setIcon(ocho.getIcon());
					ocho.setVisible(false);
					siete.setVisible(true);
					
				}
				if(cinco.isVisible()==false) {
					cinco.setText(ocho.getText());
					cinco.setIcon(ocho.getIcon());
					ocho.setVisible(false);
					cinco.setVisible(true);
					
				}
			}
		});
		siete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(ocho.isVisible()==false) {
					ocho.setText(siete.getText());
					ocho.setIcon(siete.getIcon());
					siete.setVisible(false);
					ocho.setVisible(true);
					
				}
				if(cuatro.isVisible()==false) {
					cuatro.setText(siete.getText());
					cuatro.setIcon(siete.getIcon());
					siete.setVisible(false);
					cuatro.setVisible(true);
					
				}
			}
		});
		cuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(siete.isVisible()==false) {
					siete.setText(cuatro.getText());
					siete.setIcon(cuatro.getIcon());
					cuatro.setVisible(false);
					siete.setVisible(true);
					
				}
				if(uno.isVisible()==false) {
					uno.setText(cuatro.getText());
					uno.setIcon(cuatro.getIcon());
					cuatro.setVisible(false);
					uno.setVisible(true);
					
				}
				if(cinco.isVisible()==false) {
					cinco.setText(cuatro.getText());
					cinco.setIcon(cuatro.getIcon());
					cuatro.setVisible(false);
					cinco.setVisible(true);
					
				}
			}
		});
		uno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cuatro.isVisible()==false) {
					cuatro.setText(uno.getText());
					cuatro.setIcon(uno.getIcon());
					uno.setVisible(false);
					cuatro.setVisible(true);
					
				}
				if(dos.isVisible()==false) {
					dos.setText(uno.getText());
					dos.setIcon(uno.getIcon());
					uno.setVisible(false);
					dos.setVisible(true);
					
				}
			}
		});
		seis.setBounds(208, 59, 89, 38);
		contentPane.add(seis);
		
		
		
		
		
		
		
		
		
	}
}
