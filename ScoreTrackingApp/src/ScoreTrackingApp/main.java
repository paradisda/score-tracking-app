package ScoreTrackingApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JToggleButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class main {

	private JFrame frame;
	private JTextField txtLogs;
	private JTextField txtScoreMenu;
	private JTextField txtMainMenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setSize(400, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		/*
		 * =====================================================================================================
		 * Panel
		 */
		
		JPanel main = new JPanel();
		main.setBounds(0, 0, 400, 672);
		frame.getContentPane().add(main);
		main.setLayout(null);
		main.setBackground(Color.DARK_GRAY);
		
		main.setVisible(true);
		
		JPanel scoreMenu = new JPanel();
		scoreMenu.setBounds(0, 0, 400, 672);
		frame.getContentPane().add(scoreMenu);
		scoreMenu.setLayout(null);
		scoreMenu.setBackground(Color.DARK_GRAY);
		
		scoreMenu.setVisible(false);
		
		JPanel logsMenu = new JPanel();
		logsMenu.setBounds(0, 0, 400, 672);
		frame.getContentPane().add(logsMenu);
		logsMenu.setLayout(null);
		logsMenu.setBackground(Color.DARK_GRAY);
		
		logsMenu.setVisible(false);
		
		/*
		 * =====================================================================================================
		 * Log menu buttons
		 */
		JButton btnMainMenuLogsMenu = new JButton("Main Menu");
		btnMainMenuLogsMenu.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		btnMainMenuLogsMenu.setBounds(17, 241, 365, 75);
		logsMenu.add(btnMainMenuLogsMenu);
		btnMainMenuLogsMenu.setBorderPainted(false);
		btnMainMenuLogsMenu.setBackground(Color.LIGHT_GRAY);
		btnMainMenuLogsMenu.setOpaque(true);
		
		JButton btnScoreMenuLogsMenu = new JButton("Score Menu");
		btnScoreMenuLogsMenu.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		btnScoreMenuLogsMenu.setBounds(17, 328, 365, 75);
		logsMenu.add(btnScoreMenuLogsMenu);
		btnScoreMenuLogsMenu.setBorderPainted(false);
		btnScoreMenuLogsMenu.setBackground(Color.LIGHT_GRAY);
		btnScoreMenuLogsMenu.setOpaque(true);
		
		JLabel lblLogsMenu = new JLabel("Logs");
		lblLogsMenu.setForeground(Color.LIGHT_GRAY);
		lblLogsMenu.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblLogsMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogsMenu.setBounds(170, 6, 61, 28);
		logsMenu.add(lblLogsMenu);
		
		
		/*
		 * =====================================================================================================
		 * Score menu buttons
		 */
		JButton btnMainMenuScoreMenu = new JButton("Main Menu");
		btnMainMenuScoreMenu.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnMainMenuScoreMenu.setBounds(17, 577, 175, 75);
		scoreMenu.add(btnMainMenuScoreMenu);
		btnMainMenuScoreMenu.setBackground(Color.LIGHT_GRAY);
		btnMainMenuScoreMenu.setOpaque(true);
		btnMainMenuScoreMenu.setBorderPainted(false);
		
		JButton btnLogsScoreMenu = new JButton("Logs");
		btnLogsScoreMenu.setOpaque(true);
		btnLogsScoreMenu.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		btnLogsScoreMenu.setBorderPainted(false);
		btnLogsScoreMenu.setBackground(Color.LIGHT_GRAY);
		btnLogsScoreMenu.setBounds(208, 577, 175, 75);
		scoreMenu.add(btnLogsScoreMenu);
		
		JLabel lblScoreMenu = new JLabel("Score Menu");
		lblScoreMenu.setForeground(Color.LIGHT_GRAY);
		lblScoreMenu.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblScoreMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblScoreMenu.setBounds(139, 6, 123, 28);
		scoreMenu.add(lblScoreMenu);
	
		/*
		 * =====================================================================================================
		 * Main menu buttons
		 */
		
		JButton btnLogs = new JButton("Logs");
		btnLogs.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		btnLogs.setBounds(17, 332, 365, 75);
		main.add(btnLogs);
		btnLogs.setBackground(Color.LIGHT_GRAY);
		btnLogs.setOpaque(true);
		btnLogs.setBorderPainted(false);
		
		JLabel lblMainMenu = new JLabel("Main Menu");
		lblMainMenu.setForeground(Color.LIGHT_GRAY);
		lblMainMenu.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblMainMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMainMenu.setBounds(146, 6, 99, 28);
		main.add(lblMainMenu);
		
		JButton btnDominoes = new JButton("Dominoes");
		btnDominoes.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
		btnDominoes.setBounds(6, 35, 64, 64);
		main.add(btnDominoes);
		btnDominoes.setBackground(Color.LIGHT_GRAY);
		btnDominoes.setOpaque(true);
		btnDominoes.setBorderPainted(true);
		
		JButton btnCurrentScore = new JButton("Current Score");
		btnCurrentScore.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		btnCurrentScore.setBounds(17, 241, 365, 75);
		main.add(btnCurrentScore);
		btnCurrentScore.setBackground(Color.LIGHT_GRAY);
		btnCurrentScore.setOpaque(true);
		btnCurrentScore.setBorderPainted(false);
		
		
		/*
		 * =====================================================================================================
		 * Button Actions
		 */
		
		btnMainMenuLogsMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.setVisible(true);
				logsMenu.setVisible(false);
			}
		});
		
		btnScoreMenuLogsMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scoreMenu.setVisible(true);
				logsMenu.setVisible(false);
			}
		});
		
		btnCurrentScore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.setVisible(false);
				scoreMenu.setVisible(true);
				
			}
		});
		
		btnLogs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logsMenu.setVisible(true);
				main.setVisible(false);
				
			}
		});
		
		btnMainMenuScoreMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.setVisible(true);
				scoreMenu.setVisible(false);
				
			}
		});
		
		btnLogsScoreMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scoreMenu.setVisible(false);
				logsMenu.setVisible(true);
				
			}
		});
		
	
		
		
	}
}
