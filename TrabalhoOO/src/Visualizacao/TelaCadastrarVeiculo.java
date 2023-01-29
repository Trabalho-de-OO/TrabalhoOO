package Visualizacao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


import Controle.ControleVeiculo;
import Dao.ExceptionDAO;

public class TelaCadastrarVeiculo implements ActionListener {


	private JFrame janelaDetalhe = new JFrame();
	private JPanel painelEsquerdo = new JPanel();
	private JPanel painelCentral = new JPanel();
	private JTextField entrada1 = new JTextField("");
	private JTextField entrada2  = new JTextField("0");
	private JTextField entrada3  = new JTextField("");
	private JTextField entrada4  = new JTextField("0");
	private JTextField entrada5  = new JTextField("0");
	private JTextField entrada6  = new JTextField("0");
	private JTextField entrada7  = new JTextField("0");
	private JTextField entrada8  = new JTextField("");
	private JTextField entrada9  = new JTextField("");
	private JLabel titulo = new JLabel("Nome :" );
	private JLabel titulo2 = new JLabel("Ano : ") ;
	private JLabel titulo3 = new JLabel("Cor :");
	private JLabel titulo4 = new JLabel("Final da Placa : ");
	private JLabel titulo5 = new JLabel("Numero de Portas : ");
	private JLabel titulo6 = new JLabel("Preco : ");
	private JLabel titulo7 = new JLabel("Km : ");
	private JLabel titulo8 = new JLabel("Categoria : ");
	private JLabel titulo9  = new JLabel("Marca : ");
	private JButton botaoSalvar = new JButton("Salvar");
	private JButton botaoExcluir = new JButton("Excluir");
	private int codVeiculo = 0;

	public void mostrarTela(){
		
		janelaDetalhe.setBounds(573 ,159, 500 , 450);
		
		GridBagConstraints alinhamento = new GridBagConstraints();
		alinhamento.gridx = 0;
		alinhamento.gridy = 0;
		alinhamento.insets = new Insets(3,3,3,3);
		alinhamento.anchor = GridBagConstraints.FIRST_LINE_START;
		painelEsquerdo.setBackground(Color.LIGHT_GRAY);
		painelEsquerdo.setLayout(new BoxLayout(painelEsquerdo, BoxLayout.Y_AXIS));

		
		painelCentral.setBounds(333 ,159, 500 , 450);	
		painelCentral.setLayout(new GridBagLayout());

		Dimension tamanhoEntrada = new Dimension(100,20);

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



		Dimension tamanhoBotao = new Dimension(100,30);
		
		botaoSalvar.setPreferredSize(tamanhoBotao);
		botaoSalvar.setMaximumSize(tamanhoBotao);
	
		botaoExcluir.setPreferredSize(tamanhoBotao);
		botaoExcluir.setMaximumSize(tamanhoBotao);
		

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
		botaoExcluir.addActionListener(this);
		painelCentral.add(entrada9,alinhamento);
		
		painelEsquerdo.add(botaoSalvar);
		painelEsquerdo.add(Box.createVerticalStrut(5));
		painelEsquerdo.add(botaoExcluir);
		painelEsquerdo.add(Box.createVerticalStrut(5));
		janelaDetalhe.add(painelCentral);
		janelaDetalhe.add(painelEsquerdo, BorderLayout.WEST);

		janelaDetalhe.setVisible(true);

	}

	public void buscarVeiculo(Integer codVeiculo, String nomeVeiculo, Integer ano , 
			String cor, Integer finalPlaca, Integer numPortas, Integer preco,
			Integer quilometragem, String categoria , String marca) {
		this.codVeiculo = codVeiculo;
		this.entrada1.setText(nomeVeiculo); 
		this.entrada2.setText(ano.toString());
		this.entrada3.setText(cor);
		this.entrada4.setText(finalPlaca.toString());
		this.entrada5.setText(numPortas.toString());
		this.entrada6.setText(preco.toString());
		this.entrada7.setText(quilometragem.toString());
		this.entrada8.setText(categoria);
		this.entrada9.setText(marca);

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		int ano = Integer.parseInt(entrada2.getText());
		int finalPlaca = Integer.parseInt(entrada4.getText());
		int numPortas = Integer.parseInt(entrada5.getText());
		int quilometragem = Integer.parseInt(entrada7.getText());
		int preco = Integer.parseInt(entrada6.getText());


		if(src == botaoSalvar) {

			boolean res;
			try {

				ControleVeiculo controleVeiculo = new ControleVeiculo();

				if(this.codVeiculo == 0) {
					res = controleVeiculo.cadastrarVeiculo(entrada1.getText(), ano, entrada3.getText(), finalPlaca, numPortas, preco, 
							quilometragem, entrada8.getText(), entrada9.getText());
				}else {

					res = controleVeiculo.mudarVeiculo(this.codVeiculo ,entrada1.getText(), ano, entrada3.getText(), finalPlaca, numPortas, preco, 
							quilometragem, entrada8.getText(), entrada9.getText());
				}

				if(res == true) {
					JOptionPane.showMessageDialog(null, "Dados Cadastrados com Sucesso", null,
							JOptionPane.INFORMATION_MESSAGE);
					janelaDetalhe.dispose();

				}else {
					JOptionPane.showMessageDialog(null, "Erro ao Cadastrar", null,
							JOptionPane.ERROR_MESSAGE);
				}
			}catch(NumberFormatException exe){
				JOptionPane.showMessageDialog(null, "Erro ao Cadastrar\n Os campos não foram Preenchidos", null,
						JOptionPane.ERROR_MESSAGE);

			}catch(NullPointerException exe2) {
				JOptionPane.showMessageDialog(null, "Erro ao Cadastrar\n Campo preenchido errado!", null,
						JOptionPane.ERROR_MESSAGE);
			} catch (ExceptionDAO e1) {
				e1.printStackTrace();
			}


		}
		
		if(src == botaoExcluir) {
			boolean res;
			ControleVeiculo controleVeiculo = new ControleVeiculo();
			try {
				res = controleVeiculo.apagarVeiculo(this.codVeiculo);
				if(res == true) {
					JOptionPane.showMessageDialog(null, "Dados deletados com Sucesso", null,
							JOptionPane.INFORMATION_MESSAGE);
					janelaDetalhe.dispose();
					
				}else {
					JOptionPane.showMessageDialog(null, "Erro ao Deletar", null,
							JOptionPane.ERROR_MESSAGE);
				} 
					
				
			} catch (ExceptionDAO e1) {
				Logger.getLogger(TelaCadastrarVeiculo.class.getName()).log(Level.SEVERE, null, e);
			}
			
		}
		
	}
}