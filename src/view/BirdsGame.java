package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;

public class BirdsGame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel BirdsGame;

	private JPanel contentPane;
	private int personagem = 0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BirdsGame frame = new BirdsGame();
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
	public BirdsGame() {
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setResizable(false);
		setTitle("BirdsGame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1047, 579);
		BirdsGame = new JPanel();
		BirdsGame.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(BirdsGame);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(10, 62, 40, 40);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setIcon(new ImageIcon(BirdsGame.class.getResource("/imagem/Red.jpeg")));
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(10, 138, 40, 40);
		btnNewButton_1.setIcon(new ImageIcon(BirdsGame.class.getResource("/imagem/Chuck.png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(10, 217, 40, 40);
		btnNewButton_2.setIcon(new ImageIcon(BirdsGame.class.getResource("/imagem/Bomb.jpeg")));
		btnNewButton_2.setForeground(Color.WHITE);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(10, 296, 40, 40);
		btnNewButton_3.setIcon(new ImageIcon(BirdsGame.class.getResource("/imagem/Matilda.jpeg")));
		btnNewButton_3.setForeground(Color.WHITE);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setBounds(10, 372, 40, 40);
		btnNewButton_4.setIcon(new ImageIcon(BirdsGame.class.getResource("/imagem/Stella.png")));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setForeground(Color.WHITE);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 1037, 545);
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel.setIcon(new ImageIcon(BirdsGame.class.getResource("/imagem/mapa.png")));
		BirdsGame.setLayout(null);
		BirdsGame.add(btnNewButton);
		BirdsGame.add(btnNewButton_4);
		BirdsGame.add(btnNewButton_3);
		BirdsGame.add(btnNewButton_2);
		BirdsGame.add(btnNewButton_1);
		
		JButton btnNewButton_0 = new JButton("");
		btnNewButton_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_0.setForeground(Color.WHITE);
		btnNewButton_0.setBounds(10, 448, 40, 40);
		BirdsGame.add(btnNewButton_0);
		
		JButton btnNewButton_0_1 = new JButton("");
		btnNewButton_0_1.setForeground(Color.WHITE);
		btnNewButton_0_1.setBounds(210, 48, 40, 40);
		BirdsGame.add(btnNewButton_0_1);
		
		JButton btnNewButton_0_2 = new JButton("");
		btnNewButton_0_2.setForeground(Color.WHITE);
		btnNewButton_0_2.setBounds(249, 48, 40, 40);
		BirdsGame.add(btnNewButton_0_2);
		
		JButton btnNewButton_0_3 = new JButton("");
		btnNewButton_0_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_0_3.setForeground(Color.WHITE);
		btnNewButton_0_3.setBounds(289, 48, 40, 40);
		BirdsGame.add(btnNewButton_0_3);
		
		JButton btnNewButton_0_4 = new JButton("");
		btnNewButton_0_4.setForeground(Color.WHITE);
		btnNewButton_0_4.setBounds(170, 48, 40, 40);
		BirdsGame.add(btnNewButton_0_4);
		
		JButton btnNewButton_0_5 = new JButton("");
		btnNewButton_0_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_0_5.setForeground(Color.WHITE);
		btnNewButton_0_5.setBounds(402, 205, 40, 40);
		BirdsGame.add(btnNewButton_0_5);
		
		JButton btnNewButton_0_6 = new JButton("");
		btnNewButton_0_6.setForeground(Color.WHITE);
		btnNewButton_0_6.setBounds(442, 205, 40, 40);
		BirdsGame.add(btnNewButton_0_6);
		
		JButton btnNewButton_0_7 = new JButton("");
		btnNewButton_0_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_0_7.setForeground(Color.WHITE);
		btnNewButton_0_7.setBounds(481, 205, 40, 40);
		BirdsGame.add(btnNewButton_0_7);
		
		JButton btnNewButton_0_8 = new JButton("");
		btnNewButton_0_8.setForeground(Color.WHITE);
		btnNewButton_0_8.setBounds(521, 205, 40, 40);
		BirdsGame.add(btnNewButton_0_8);
		
		JButton btnNewButton_0_9 = new JButton("");
		btnNewButton_0_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_0_9.setForeground(Color.WHITE);
		btnNewButton_0_9.setBounds(422, 388, 40, 40);
		BirdsGame.add(btnNewButton_0_9);
		
		JButton btnNewButton_0_10 = new JButton("");
		btnNewButton_0_10.setForeground(Color.WHITE);
		btnNewButton_0_10.setBounds(461, 388, 40, 40);
		BirdsGame.add(btnNewButton_0_10);
		
		JButton btnNewButton_0_11 = new JButton("");
		btnNewButton_0_11.setForeground(Color.WHITE);
		btnNewButton_0_11.setBounds(500, 388, 40, 40);
		BirdsGame.add(btnNewButton_0_11);
		
		JButton btnNewButton_0_12 = new JButton("");
		btnNewButton_0_12.setForeground(Color.WHITE);
		btnNewButton_0_12.setBounds(383, 388, 40, 40);
		BirdsGame.add(btnNewButton_0_12);
		
		JButton btnNewButton_0_13 = new JButton("");
		btnNewButton_0_13.setForeground(Color.WHITE);
		btnNewButton_0_13.setBounds(725, 283, 40, 40);
		BirdsGame.add(btnNewButton_0_13);
		
		JButton btnNewButton_0_14 = new JButton("");
		btnNewButton_0_14.setForeground(Color.WHITE);
		btnNewButton_0_14.setBounds(764, 283, 40, 40);
		BirdsGame.add(btnNewButton_0_14);
		
		JButton btnNewButton_0_15 = new JButton("");
		btnNewButton_0_15.setForeground(Color.WHITE);
		btnNewButton_0_15.setBounds(686, 283, 40, 40);
		BirdsGame.add(btnNewButton_0_15);
		
		JButton btnNewButton_0_16 = new JButton("");
		btnNewButton_0_16.setForeground(Color.WHITE);
		btnNewButton_0_16.setBounds(647, 283, 40, 40);
		BirdsGame.add(btnNewButton_0_16);
		
		JButton btnNewButton_0_17 = new JButton("");
		btnNewButton_0_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_0_17.setForeground(Color.WHITE);
		btnNewButton_0_17.setBounds(719, 92, 40, 40);
		BirdsGame.add(btnNewButton_0_17);
		
		JButton btnNewButton_0_18 = new JButton("");
		btnNewButton_0_18.setForeground(Color.WHITE);
		btnNewButton_0_18.setBounds(759, 92, 40, 40);
		BirdsGame.add(btnNewButton_0_18);
		
		JButton btnNewButton_0_19 = new JButton("");
		btnNewButton_0_19.setForeground(Color.WHITE);
		btnNewButton_0_19.setBounds(798, 92, 40, 40);
		BirdsGame.add(btnNewButton_0_19);
		
		JButton btnNewButton_0_20 = new JButton("");
		btnNewButton_0_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_0_20.setForeground(Color.WHITE);
		btnNewButton_0_20.setBounds(837, 92, 40, 40);
		BirdsGame.add(btnNewButton_0_20);
		BirdsGame.add(lblNewLabel);
	}
}
