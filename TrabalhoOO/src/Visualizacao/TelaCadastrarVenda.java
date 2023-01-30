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
import Controle.ControleVenda;
import Dao.ExceptionDAO;

/*
 * 
 * Tela para cadastro de Vendas
 */

public class TelaCadastrarVenda implements ActionListener{
	
	private JFrame janelaDetalhe = new JFrame();
	private JPanel painelEsquerdo = new JPanel();
	private JPanel painelCentral= new JPanel();
	private JTextField entrada1 = new JTextField();
	private JTextField entrada2  = new JTextField();
	private JTextField entrada3  = new JTextField();
	private JTextField entrada4  = new JTextField();

	
	private JLabel titulo1 = new JLabel("Nome Vendedor : ");
	private JLabel titulo2 = new JLabel("Veiculo : ") ;
	private JLabel titulo3 = new JLabel("Preço da Venda: ");
	private JLabel titulo4 = new JLabel("Local da Venda :");

	private JButton botaoSalvar = new JButton("Salvar");
	private JButton botaoExcluirVendas  = new JButton("Excluir");
	private int codVenda= 0;
	
	
	/*
	 * Método para fazer a requisição da TelaCadastrarVenda
	 * 
	 */
	public void mostrarTela() {
		

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


	


		Dimension tamanhoBotao = new Dimension(100,30);
		
		botaoSalvar.setPreferredSize(tamanhoBotao);
		botaoSalvar.setMaximumSize(tamanhoBotao);
	
		botaoExcluirVendas.setPreferredSize(tamanhoBotao);
		botaoExcluirVendas.setMaximumSize(tamanhoBotao);
		

		alinhamento.gridx = 0;
		alinhamento.gridy = 0;
		painelCentral.add(titulo1,alinhamento);
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
	
		
		botaoSalvar.addActionListener(this);
		botaoExcluirVendas.addActionListener(this);
		
		painelEsquerdo.add(botaoSalvar);
		painelEsquerdo.add(Box.createVerticalStrut(5));
		painelEsquerdo.add(botaoExcluirVendas);
		painelEsquerdo.add(Box.createVerticalStrut(5));
		janelaDetalhe.add(painelCentral);
		janelaDetalhe.add(painelEsquerdo, BorderLayout.WEST);

		janelaDetalhe.setVisible(true);

		
		
		
	}
	
	/**
	 * 
	 * Método para abrir uma noja janela com as entradas 
	 * já preenchidas pelos dados cadastrados
	 */
	  

	public void buscarVenda(Integer codVenda, String vendedor, String veiculo , Integer precoVenda, String localVenda) {
		this.codVenda = codVenda;
		this.entrada1.setText(vendedor); 
		this.entrada2.setText(veiculo);
		this.entrada3.setText(precoVenda.toString());
		this.entrada4.setText(localVenda);


	}
	
	/*
	 * Método para dar ações para componentes
	 * 
	 */
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		int precoVenda = Integer.parseInt(entrada3.getText());
		
		if(src == botaoSalvar) {

			boolean res;
			try {
				ControleVenda controleVenda = new ControleVenda();
				if(this.codVenda == 0) {
					res = controleVenda.cadastrarVendas(entrada1.getText(), entrada2.getText(), precoVenda, entrada4.getText());
				}
				else {

					res = controleVenda.mudarVenda(this.codVenda,entrada1.getText(), entrada2.getText(), precoVenda, entrada4.getText());
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
		if(src == botaoExcluirVendas) {
			boolean res;
			ControleVenda controleVenda = new ControleVenda();
			try {
				res = controleVenda.apagarVenda(this.codVenda);
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
	



