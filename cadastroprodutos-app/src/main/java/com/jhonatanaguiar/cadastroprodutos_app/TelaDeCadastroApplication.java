package com.jhonatanaguiar.cadastroprodutos_app;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaDeCadastroApplication {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaDeCadastroApplication window = new TelaDeCadastroApplication();
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
	public TelaDeCadastroApplication() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(50, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setLayout(new BorderLayout());
		
		JLabel titulo = new JLabel("<html><h3>Tela Cadastro<h3><html>");
		frame.add(titulo, BorderLayout.NORTH);
		titulo.setHorizontalAlignment(JLabel.CENTER);
		
		TelaDeEntradaDeDados telaDeEntradaDeDados = new TelaDeEntradaDeDados();
		frame.add(telaDeEntradaDeDados);
	}

}
