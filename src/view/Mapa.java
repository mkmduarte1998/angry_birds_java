package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class Mapa extends JFrame {

	private JPanel contentPane;
	private int personagem = 0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mapa frame = new Mapa();
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
	public Mapa() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1118, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(UIManager.getColor("Button.background"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personagem = 1;
			}
		});
		
		btnNewButton.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Mario.png")));
		btnNewButton.setBounds(46, 103, 40, 40);
		contentPane.add(btnNewButton);

		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personagem = 4;
			}
		});
		btnNewButton_3.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Wluigi.png")));
		btnNewButton_3.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_3.setBounds(46, 257, 40, 40);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				personagem = 2;
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Wario.png")));
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_2.setBounds(46, 154, 40, 40);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personagem = 3;
			}
		});
		btnNewButton_1.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_1.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Luigi.png")));
		btnNewButton_1.setBounds(46, 206, 40, 40);
		contentPane.add(btnNewButton_1);
		
		JButton btnVazio = new JButton("");
		btnVazio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personagem = 0;
			}
		});
		btnVazio.setBounds(46, 316, 40, 40);
		contentPane.add(btnVazio);
		
		JButton btnMD01 = new JButton("");
		btnMD01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(personagem == 1)
					btnMD01.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Mario.png")));
				else if(personagem == 2)
					btnMD01.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Wario.png")));
				else if(personagem == 3)
					btnMD01.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Luigi.png")));
				else if(personagem == 4)
					btnMD01.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Wluigi.png")));
				else if(personagem == 0)
					btnMD01.setIcon(new ImageIcon(""));
			}
		});
		btnMD01.setBounds(154, 88, 40, 40);
		contentPane.add(btnMD01);
		
		JButton btnMD02 = new JButton("");
		btnMD02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(personagem == 1)
					btnMD02.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Mario.png")));
				else if(personagem == 2)
					btnMD02.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Wario.png")));
				else if(personagem == 3)
					btnMD02.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Luigi.png")));
				else if(personagem == 4)
					btnMD02.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Wluigi.png")));
				else if(personagem == 0)
					btnMD02.setIcon(new ImageIcon(""));
			}
		});
		btnMD02.setBounds(194, 88, 40, 40);
		contentPane.add(btnMD02);
		
		JButton btnMD03 = new JButton("");
		btnMD03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(personagem == 1)
					btnMD03.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Mario.png")));
				else if(personagem == 2)
					btnMD03.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Wario.png")));
				else if(personagem == 3)
					btnMD03.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Luigi.png")));
				else if(personagem == 4)
					btnMD03.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Wluigi.png")));
				else if(personagem == 0)
					btnMD03.setIcon(new ImageIcon(""));
			}
		});
		btnMD03.setBounds(234, 88, 40, 40);
		contentPane.add(btnMD03);
		
		JButton btnMD04 = new JButton("");
		btnMD04.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(personagem == 1)
					btnMD04.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Mario.png")));
				else if(personagem == 2)
					btnMD04.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Wario.png")));
				else if(personagem == 3)
					btnMD04.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Luigi.png")));
				else if(personagem == 4)
					btnMD04.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Wluigi.png")));
				else if(personagem == 0)
					btnMD04.setIcon(new ImageIcon(""));
			}
		});
		btnMD04.setBounds(274, 88, 40, 40);
		contentPane.add(btnMD04);
		
		JButton btnMD05 = new JButton("");
		btnMD05.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(personagem == 1)
					btnMD05.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Mario.png")));
				else if(personagem == 2)
					btnMD05.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Wario.png")));
				else if(personagem == 3)
					btnMD05.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Luigi.png")));
				else if(personagem == 4)
					btnMD05.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Wluigi.png")));
				else if(personagem == 0)
					btnMD05.setIcon(new ImageIcon(""));
			}
		});
		btnMD05.setBounds(314, 88, 40, 40);
		contentPane.add(btnMD05);
		
		JLabel labelFundo = new JLabel("");
		labelFundo.setIcon(new ImageIcon(Mapa.class.getResource("/imagens/Fundo.png")));
		labelFundo.setBounds(0, 0, 1118, 465);
		contentPane.add(labelFundo);
		
	}
}
