package com.jhonatanaguiar.cadastroprodutos_app;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import com.jhonatanaguiar.cadastroprodutos_app.model.Produto;

public class TelaDeEntradaDeDados extends JPanel {
		
		private List<Produto> produtos = new ArrayList<Produto>();

		private static final long serialVersionUID = 1L;

		public TelaDeEntradaDeDados() {

			this.setLayout(null);

			JLabel nome = new JLabel("Produto:");
			nome.setBounds(10, 10, 50, 25);
			this.add(nome);

			final JTextField nomeField = new JTextField();
			nomeField.setBounds(75, 10, 300, 25);
			this.add(nomeField);

			JLabel quantidade = new JLabel("QTD:");
			quantidade.setBounds(10, 50, 50, 25);
			this.add(quantidade);

			final JTextField quantidadeField = new JTextField();
			quantidadeField.setBounds(75, 50, 300, 25);
			this.add(quantidadeField);

			JLabel valor = new JLabel("Valor:");
			valor.setBounds(10, 90, 50, 25);
			this.add(valor);

			final JTextField valorField = new JTextField();
			valorField.setBounds(75, 90, 100, 25);
			this.add(valorField);

			JButton btnAdicionar = new JButton("Adicionar");
			btnAdicionar.setBounds(100, 150, 100, 30);
			this.add(btnAdicionar);

			btnAdicionar.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					String nome = nomeField.getText();
					int quantidade = Integer.parseInt(quantidadeField.getText());
					double valor = Double.parseDouble(valorField.getText());

					Produto produto = new Produto(nome, quantidade, valor);

					produtos.add(produto);

					nomeField.setText("");
					quantidadeField.setText("");
					valorField.setText("");
				}

			});

			JButton btnRelatorio = new JButton("Relatório");
			btnRelatorio.setBounds(210, 150, 100, 30);
			this.add(btnRelatorio);

			btnRelatorio.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					for (int i = 0; i < produtos.size(); i++) {
						System.out.println(produtos.get(i));

					}

					Object[] titulos = { "NOME", "QUANTIDADE", "VALOR" };
					Object[][] linhas = new Object[produtos.size()][3];

					for (int i = 0; i < produtos.size(); i++) {
						Object[] linha = new Object[] { produtos.get(i).getNome().toUpperCase(),
								produtos.get(i).getQuantidade(), produtos.get(i).getValor() };
						linhas[i] = linha;

					}

					JTable tabela = new JTable(linhas, titulos);

					JScrollPane jscroll = new JScrollPane(tabela);
					jscroll.setSize(new Dimension(500, 500));

					JOptionPane.showMessageDialog(null, new JScrollPane(tabela));
				}

			});

		};

	}