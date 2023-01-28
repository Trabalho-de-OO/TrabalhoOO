package Visualizacao;
/*
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controle.*;


public class TelaDetalhesDadosProntos implements ActionListener {
	private JFrame janelaDetalhe;
	private JPanel painelEsquerdo;
	private JPanel painelCentral;
	private JTextField entrada1,entrada2,entrada3,entrada4,entrada5,entrada6,entrada7,entrada8,entrada9;
	private JLabel titulo, titulo2,titulo3,titulo4,titulo5,titulo6,titulo7,titulo8,titulo9;
	private JButton botaoSalvarVeiculo,botaoExcluirVeiculo, botaoSalvarVenda,botaoExcluirVenda, botaoAdicionar;
	private ControleDados dados = new ControleDados();	
	private int posicao;
	private int opcao;
	private String [] dadosVeiculo;
	private String[] dadosVenda;

	public void mostrarTelaDetalhes(int opcao, ControleDados dados, TelaCadastros telaCadastros, int posiscao) {
		this.opcao = opcao;
		posicao = posicao;


		if( opcao == 1 ) {
			//Resultado do evento da JList veiculo
			janelaDetalhe = new JFrame();
			painelEsquerdo = new JPanel();
			painelCentral = new JPanel();

			entrada1 = new JTextField(dados.getDadosListaVeiculo().get(posicao).getNomeVeiculo());
			entrada2 = new JTextField(Integer.toString(dados.getDadosListaVeiculo().get(posicao).getAno()));
			entrada3 = new JTextField(dados.getDadosListaVeiculo().get(posicao).getCor());					

			entrada4 = new JTextField(Integer.toString(dados.getDadosListaVeiculo().get(posicao).getFinalPlaca()));		
			entrada5 = new JTextField(Integer.toString(dados.getDadosListaVeiculo().get(posicao).getNumPortas()));
			entrada6 = new JTextField(Integer.toString(dados.getDadosListaVeiculo().get(posicao).getPreco()));

			entrada7 = new JTextField(dados.getDadosListaVeiculo().get(posicao).getQuilometragem());
			entrada8 = new JTextField(dados.getDadosListaVeiculo().get(posicao).getCategoria());
			entrada9 = new JTextField(dados.getDadosListaVeiculo().get(posicao).getMarca());



			titulo =  new JLabel("Nome :");
			titulo2 = new JLabel("Ano :");
			titulo3 = new JLabel("Cor :");
			titulo4 = new JLabel("Final da Placa :");
			titulo5 = new JLabel("Numero de Portas :");
			titulo6 = new JLabel("Preco :");
			titulo7 = new JLabel("Quilometragem :");
			titulo8 = new JLabel("Categoria :");
			titulo9 = new JLabel("Marca :");
			botaoSalvarVeiculo = new JButton("Salvar");
			botaoExcluirVeiculo = new JButton("Excluir");
			botaoAdicionar = new JButton("Adicionar");

			Dimension tamanhoEntrada = new Dimension(100,20);
			Dimension tamanhoBotao = new Dimension(100,30);
			GridBagConstraints alinhamento = new GridBagConstraints();
			alinhamento.gridx = 0;
			alinhamento.gridy = 0;
			alinhamento.insets = new Insets(3,3,3,3);
			alinhamento.anchor = GridBagConstraints.FIRST_LINE_START;

			entrada1.setPreferredSize(tamanhoEntrada);
			entrada1.setMaximumSize(tamanhoEntrada);
			entrada2.setPreferredSize(tamanhoEntrada);
			entrada2.setMaximumSize(tamanhoEntrada);
			entrada3.setPreferredSize(tamanhoEntrada);
			entrada3.setMaximumSize(tamanhoEntrada);
			entrada4.setPreferredSize(tamanhoEntrada);
			entrada4.setMaximumSize(tamanhoEntrada);
			entrada5.setPreferredSize(tamanhoEntrada);
			entrada5.setMaximumSize(tamanhoEntrada);
			entrada6.setPreferredSize(tamanhoEntrada);
			entrada6.setMaximumSize(tamanhoEntrada);
			entrada7.setPreferredSize(tamanhoEntrada);
			entrada7.setMaximumSize(tamanhoEntrada);
			entrada8.setPreferredSize(tamanhoEntrada);
			entrada8.setMaximumSize(tamanhoEntrada);
			entrada9.setPreferredSize(tamanhoEntrada);
			entrada9.setMaximumSize(tamanhoEntrada);
			botaoSalvarVeiculo.setPreferredSize(tamanhoBotao);
			botaoSalvarVeiculo.setMaximumSize(tamanhoBotao);
			botaoExcluirVeiculo.setPreferredSize(tamanhoBotao);
			botaoExcluirVeiculo.setMaximumSize(tamanhoBotao);
			botaoAdicionar.setPreferredSize(tamanhoBotao);
			botaoAdicionar.setMaximumSize(tamanhoBotao);

			janelaDetalhe.setBounds(573 ,159, 500 , 450);
			painelEsquerdo.setLayout(new BoxLayout(painelEsquerdo, BoxLayout.Y_AXIS));
			painelEsquerdo.setBackground(Color.LIGHT_GRAY);
			painelCentral.setBounds(333 ,159, 500 , 450);	
			painelCentral.setLayout(new GridBagLayout());

			alinhamento.gridx = 0;
			alinhamento.gridy = 0;
			painelCentral.add(titulo,alinhamento);
			alinhamento.gridx =1;
			alinhamento.gridy = 0;
			painelCentral.add(entrada1,alinhamento);
			alinhamento.gridx = 0;
			alinhamento.gridy = 1;
			painelCentral.add(titulo2,alinhamento);
			alinhamento.gridx =1;
			alinhamento.gridy =1;
			painelCentral.add(entrada2,alinhamento);
			alinhamento.gridx = 0;
			alinhamento.gridy = 2;
			painelCentral.add(titulo3,alinhamento);
			alinhamento.gridx =1;
			alinhamento.gridy =2;
			painelCentral.add(entrada3,alinhamento);
			alinhamento.gridx = 0;
			alinhamento.gridy = 3;
			painelCentral.add(titulo4,alinhamento);
			alinhamento.gridx = 1;
			alinhamento.gridy = 3;
			painelCentral.add(entrada4,alinhamento);
			alinhamento.gridx = 0;
			alinhamento.gridy = 4;
			painelCentral.add(titulo5,alinhamento);
			alinhamento.gridx = 1;
			alinhamento.gridy = 4;
			painelCentral.add(entrada5,alinhamento);
			alinhamento.gridx = 0;
			alinhamento.gridy = 5;
			painelCentral.add(titulo6,alinhamento);
			alinhamento.gridx = 1;
			alinhamento.gridy = 5;
			painelCentral.add(entrada6,alinhamento);
			alinhamento.gridx = 0;
			alinhamento.gridy = 6;
			painelCentral.add(titulo7,alinhamento);
			alinhamento.gridx = 1;
			alinhamento.gridy = 6;
			painelCentral.add(entrada7,alinhamento);
			alinhamento.gridx = 0;
			alinhamento.gridy = 7;
			painelCentral.add(titulo8,alinhamento);		
			alinhamento.gridx = 1;
			alinhamento.gridy = 7;
			painelCentral.add(entrada8,alinhamento);
			alinhamento.gridx = 0;
			alinhamento.gridy = 8;
			painelCentral.add(titulo9,alinhamento);
			alinhamento.gridx = 1;
			alinhamento.gridy = 8;
			painelCentral.add(entrada9,alinhamento);


			botaoAdicionar.addActionListener(this);
			botaoExcluirVeiculo.addActionListener(this);
			botaoSalvarVeiculo.addActionListener(this);
			painelEsquerdo.add(botaoSalvarVeiculo);
			painelEsquerdo.add(Box.createVerticalStrut(5));
			painelEsquerdo.add(botaoExcluirVeiculo);
			painelEsquerdo.add(Box.createVerticalStrut(5));
			painelEsquerdo.add(botaoAdicionar);
			painelEsquerdo.add(Box.createVerticalStrut(5));
			janelaDetalhe.add(painelCentral);
			janelaDetalhe.add(painelEsquerdo, BorderLayout.WEST);

			janelaDetalhe.setVisible(true);
		}

		if(opcao == 2) {
			//resultado do evento na JList de venda
			janelaDetalhe = new JFrame();
			painelEsquerdo = new JPanel();
			painelCentral = new JPanel();
			entrada1 = new JTextField(Integer.toString(dados.getDadosListaVenda().get(posicao).getIdVenda()));
			entrada2 = new JTextField(dados.getDadosListaVenda().get(posiscao).getVendedor());
			entrada3 = new JTextField(dados.getDadosListaVenda().get(posicao).getVeiculo());
			entrada4 = new JTextField(Integer.toString(dados.getDadosListaVenda().get(posicao).getPrecoVenda()));
			entrada5 = new JTextField(dados.getDadosListaVenda().get(posicao).getLocalVenda());
			titulo =  new JLabel("ID Venda");
			titulo2 = new JLabel("Vendedor");
			titulo3 = new JLabel("Veiculo");
			titulo4 = new JLabel("Preco da Venda");
			titulo5 = new JLabel("Local Venda");
			botaoSalvarVenda = new JButton("Salvar");
			botaoExcluirVenda = new JButton("Excluir");



			Dimension tamanhoEntrada2 = new Dimension(100,20);
			Dimension tamanhoBotao2 = new Dimension(100,30);
			GridBagConstraints alinhamento2 = new GridBagConstraints();
			alinhamento2.gridx = 0;
			alinhamento2.gridy = 0;
			alinhamento2.insets = new Insets(10,10,10,10);
			alinhamento2.anchor = GridBagConstraints.CENTER;

			entrada1.setPreferredSize(tamanhoEntrada2);
			entrada1.setMaximumSize(tamanhoEntrada2);
			entrada2.setPreferredSize(tamanhoEntrada2);
			entrada2.setMaximumSize(tamanhoEntrada2);
			entrada3.setPreferredSize(tamanhoEntrada2);
			entrada3.setMaximumSize(tamanhoEntrada2);
			entrada4.setPreferredSize(tamanhoEntrada2);
			entrada4.setMaximumSize(tamanhoEntrada2);
			entrada5.setPreferredSize(tamanhoEntrada2);
			entrada5.setMaximumSize(tamanhoEntrada2);
			botaoSalvarVenda.setPreferredSize(tamanhoBotao2);
			botaoSalvarVenda.setMaximumSize(tamanhoBotao2);
			botaoExcluirVenda.setPreferredSize(tamanhoBotao2);
			botaoExcluirVenda.setMaximumSize(tamanhoBotao2);
			
			botaoSalvarVenda.addActionListener(this);
			janelaDetalhe.setBounds(573 ,159, 500 , 450);	
			painelEsquerdo.setBackground(Color.LIGHT_GRAY);
			painelEsquerdo.setLayout(new BoxLayout(painelEsquerdo, BoxLayout.Y_AXIS));
			painelCentral.setBounds(333 ,159, 500 , 450);	
			painelCentral.setLayout(new GridBagLayout());



			alinhamento2.gridx = 0;
			alinhamento2.gridy = 0;
			painelCentral.add(titulo,alinhamento2);
			alinhamento2.gridx =1;
			alinhamento2.gridy = 0;
			painelCentral.add(entrada1,alinhamento2);
			alinhamento2.gridx = 0;
			alinhamento2.gridy = 1;
			painelCentral.add(titulo2,alinhamento2);
			alinhamento2.gridx =1;
			alinhamento2.gridy =1;
			painelCentral.add(entrada2,alinhamento2);
			alinhamento2.gridx = 0;
			alinhamento2.gridy = 2;
			painelCentral.add(titulo3,alinhamento2);
			alinhamento2.gridx =1;
			alinhamento2.gridy =2;
			painelCentral.add(entrada3,alinhamento2);
			alinhamento2.gridx = 0;
			alinhamento2.gridy = 3;
			painelCentral.add(titulo4,alinhamento2);
			alinhamento2.gridx = 1;
			alinhamento2.gridy = 3;
			painelCentral.add(entrada4,alinhamento2);
			alinhamento2.gridx = 0;
			alinhamento2.gridy = 4;
			painelCentral.add(titulo5,alinhamento2);
			alinhamento2.gridx = 1;
			alinhamento2.gridy = 4;
			painelCentral.add(entrada5,alinhamento2);

			painelEsquerdo.add(botaoSalvarVenda);
			painelEsquerdo.add(Box.createVerticalStrut(5));
			painelEsquerdo.add(botaoExcluirVenda);
			painelEsquerdo.add(Box.createVerticalStrut(5));
			janelaDetalhe.add(painelCentral);
			janelaDetalhe.add(painelEsquerdo, BorderLayout.WEST);

			janelaDetalhe.setVisible(true);
		}

	}

	public void sucessoCadastro(){

		JOptionPane.showMessageDialog(null, "Dados Cadastrados com Sucesso", null,
				JOptionPane.INFORMATION_MESSAGE);

		janelaDetalhe.dispose();
	}

	public void erroCadastro() {
		JOptionPane.showMessageDialog(null, "Erro ao Cadastrar", null,
				JOptionPane.ERROR_MESSAGE);



	}


	public void veiculoExcluido() {

		JOptionPane.showMessageDialog(null, "O veiculo foi excluido com sucesso",null, JOptionPane.INFORMATION_MESSAGE);
		janelaDetalhe.dispose();
	}

	public void veiculoNaoExcluido() {

		JOptionPane.showMessageDialog(null, "O veiculo nao Excluido",null, JOptionPane.ERROR_MESSAGE);
		janelaDetalhe.dispose();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
	Object src = e.getSource();

		if(src == botaoSalvarVeiculo) {
			if(opcao == 0) {	
				try {

					boolean resultado;

					dadosVeiculo = new String[10];
					dadosVeiculo[0] = Integer.toString(posicao);
					dadosVeiculo[1] = entrada1.getText(); 
					dadosVeiculo[2] = entrada2.getText();
					dadosVeiculo[3] = entrada3.getText();
					dadosVeiculo[4] = entrada4.getText();
					dadosVeiculo[5] = entrada5.getText();
					dadosVeiculo[6] = entrada6.getText();
					dadosVeiculo[7] = entrada7.getText();
					dadosVeiculo[8] = entrada8.getText();
					dadosVeiculo[9] = entrada9.getText();
					resultado = dados.cadastrarVeiculo(dadosVeiculo);
					if(resultado == true) {
						sucessoCadastro();
					}else {
						erroCadastro();
					}

				}catch(NullPointerException exe1) {
					erroCadastro();

				}catch(NumberFormatException exe2) {
					erroCadastro();

				}

			}

			if(src == botaoExcluirVeiculo) {
				boolean resultado;
				resultado =dados.removerVeiculo(posicao);

				if(resultado == true){
					veiculoExcluido();

				}else {
					veiculoNaoExcluido();
				}


			}
			if(src == botaoSalvarVenda) {

				if(opcao == 1) {
					try {

						boolean resultado;

						dadosVenda= new String[6];
						dadosVenda[0] = Integer.toString(posicao);
						dadosVenda[1] = entrada1.getText(); 
						dadosVenda[2] = entrada2.getText();
						dadosVenda[3] = entrada3.getText();
						dadosVenda[4] = entrada4.getText();
						dadosVenda[5] = entrada5.getText();
						resultado= dados.cadastrarVenda(dadosVenda);
						
						if(resultado == true) {
							sucessoCadastro();
						}else {
							erroCadastro();
						}

					}catch(Exception exe) {

					}

				}

			}
		}
	}
}  

*/