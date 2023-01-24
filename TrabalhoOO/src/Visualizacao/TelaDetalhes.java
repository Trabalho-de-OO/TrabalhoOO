package Visualizacao;

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
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controle.*;

public class TelaDetalhes implements ActionListener {
	private JFrame janelaDetalhe;
	private JPanel painelEsquerdo;
	private JPanel painelCentral;
	private JTextField entrada1,entrada2,entrada3,entrada4,entrada5,entrada6,entrada7,entrada8,entrada9;
	private JLabel titulo, titulo2,titulo3,titulo4,titulo5,titulo6,titulo7,titulo8,titulo9;
	private JButton botaoSalvar,botaoExcluir;
	private ControleDados dados = new ControleDados();
	private ControleVeiculo dadosVeiculos = new ControleVeiculo();
	private int posicao;
	private int opcao;

	public void mostrarTelaDetalhes(int opcao, ControleDados dados, TelaCadastros telaCadastros, int posiscao) {
		this.opcao = opcao;
		posicao = posicao;

		

		//Cadastro com dados prontos dos veiculos
		if( opcao == 1 ) {
			janelaDetalhe = new JFrame();
			painelEsquerdo = new JPanel();
			painelCentral = new JPanel();
			
			entrada1 = new JTextField(dados.getDadosVeiculo().get(posicao).getNomeVeiculo());
			entrada2 = new JTextField(Integer.toString(dados.getDadosVeiculo().get(posicao).getAno()));
			entrada3 = new JTextField(dados.getDadosVeiculo().get(posicao).getCor());					
			entrada4 = new JTextField(Integer.toString(dados.getDadosVeiculo().get(posicao).getFinalPlaca()));		
			entrada5 = new JTextField(Integer.toString(dados.getDadosVeiculo().get(posicao).getNumPortas()));
			entrada6 = new JTextField(Integer.toString(dados.getDadosVeiculo().get(posicao).getPreco()));
			entrada7 = new JTextField(dados.getDadosVeiculo().get(posicao).getQuilometragem());
			entrada8 = new JTextField(dados.getDadosVeiculo().get(posicao).getCategoria());
			entrada9 = new JTextField(dados.getDadosVeiculo().get(posicao).getMarca());
			

			titulo =  new JLabel("Nome :");
			titulo2 = new JLabel("Ano :");
			titulo3 = new JLabel("Cor :");
			titulo4 = new JLabel("Final da Placa :");
			titulo5 = new JLabel("Numero de Portas :");
			titulo6 = new JLabel("Preco :");
			titulo7 = new JLabel("Quilometragem :");
			titulo8 = new JLabel("Categoria :");
			titulo9 = new JLabel("Marca :");
			botaoSalvar = new JButton("Salvar");
			botaoExcluir = new JButton("Excluir");


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
			botaoSalvar.setPreferredSize(tamanhoBotao);
			botaoSalvar.setMaximumSize(tamanhoBotao);
			botaoExcluir.setPreferredSize(tamanhoBotao);
			botaoExcluir.setMaximumSize(tamanhoBotao);

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

			botaoSalvar.addActionListener(this);
			painelCentral.add(entrada9,alinhamento);
			painelEsquerdo.add(botaoSalvar);
			painelEsquerdo.add(Box.createVerticalStrut(5));
			painelEsquerdo.add(botaoExcluir);
			painelEsquerdo.add(Box.createVerticalStrut(5));
			janelaDetalhe.add(painelCentral);
			janelaDetalhe.add(painelEsquerdo, BorderLayout.WEST);

			janelaDetalhe.setVisible(true);
		}else if(opcao == 2) {
			
				janelaDetalhe = new JFrame();
				painelEsquerdo = new JPanel();
				painelCentral = new JPanel();
				entrada1 = new JTextField();
				entrada2 = new JTextField();
				entrada3 = new JTextField();
				entrada4 = new JTextField();
				entrada5 = new JTextField();
				titulo =  new JLabel("ID Venda");
				titulo2 = new JLabel("Vendedor");
				titulo3 = new JLabel("Veiculo");
				titulo4 = new JLabel("Preco da Venda");
				titulo5 = new JLabel("Local Venda");
				botaoSalvar = new JButton("Salvar");
				botaoExcluir = new JButton("Excluir");



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
				botaoSalvar.setPreferredSize(tamanhoBotao2);
				botaoSalvar.setMaximumSize(tamanhoBotao2);
				botaoExcluir.setPreferredSize(tamanhoBotao2);
				botaoExcluir.setMaximumSize(tamanhoBotao2);

				janelaDetalhe.setBounds(573 ,159, 500 , 450);	
				painelEsquerdo.setBackground(Color.LIGHT_GRAY);
				painelEsquerdo.setLayout(new BoxLayout(painelEsquerdo, BoxLayout.Y_AXIS));
				painelCentral.setBounds(333 ,159, 500 , 450);	
				painelCentral.setLayout(new GridBagLayout());


				entrada1.setText(Integer.toString(dados.getDadosVendas().get(posicao).getIdVenda()));
				entrada2.setText(dados.getDadosVendas().get(posicao).getVendedor());
				entrada3.setText(dados.getDadosVendas().get(posicao).getVeiculo());		
				entrada4.setText(Integer.toString(dados.getDadosVendas().get(posicao).getPrecoVenda()));			
				entrada5.setText(dados.getDadosVendas().get(posicao).getLocalVenda());

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

				painelEsquerdo.add(botaoSalvar);
				painelEsquerdo.add(Box.createVerticalStrut(5));
				painelEsquerdo.add(botaoExcluir);
				painelEsquerdo.add(Box.createVerticalStrut(5));
				janelaDetalhe.add(painelCentral);
				janelaDetalhe.add(painelEsquerdo, BorderLayout.WEST);

				janelaDetalhe.setVisible(true);


		}



	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
