package Visualizacao;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaVendas implements ActionListener {
	private JFrame telaVendas;
	private JLabel nomeVendedor;
	private JLabel veiculo;
	private JLabel precoVenda;
	private JLabel local;

	private JTextField entrada9;
	private JTextField entrada10;
	private JTextField entrada11;
	private JTextField entrada12;
	private JButton botaoCadastrar2;


	public TelaVendas() {
		telaVendas = new JFrame(); 
		telaVendas.setBounds(483 ,159, 500 , 450);
		telaVendas.setLayout(new GridBagLayout());
		telaVendas.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//Construtor para alinhar os itens 
		GridBagConstraints centralizador3 = new GridBagConstraints();
		centralizador3.gridx = 0;
		centralizador3.gridy = 0;
		centralizador3.insets = new Insets(5,5,5,5);
		centralizador3.anchor = GridBagConstraints.CENTER;
		//Labels
		nomeVendedor = new JLabel("Nome do Vendedor");
		veiculo = new JLabel("Veiculo Desejado");
		precoVenda = new JLabel("Preço da Venda");
		local = new JLabel("Local da Venda ");
		//organizando entradas e ajeitando os tamanhos 
		Dimension tamanhoEntradas2 = new Dimension(200,20);
		
		entrada9 = new JTextField();
		entrada9.setPreferredSize(tamanhoEntradas2);
		entrada9.setMaximumSize(tamanhoEntradas2);
		entrada9.setMaximumSize(tamanhoEntradas2);
		
		entrada10 = new JTextField();
		entrada10.setPreferredSize(tamanhoEntradas2);
		entrada10.setMaximumSize(tamanhoEntradas2);
		entrada10.setMaximumSize(tamanhoEntradas2);
		
		entrada11 = new JTextField();
		entrada11.setPreferredSize(tamanhoEntradas2);
		entrada11.setMaximumSize(tamanhoEntradas2);
		entrada11.setMaximumSize(tamanhoEntradas2);
		
		entrada12 = new JTextField();
		entrada12.setPreferredSize(tamanhoEntradas2);
		entrada12.setMaximumSize(tamanhoEntradas2);
		entrada12.setMaximumSize(tamanhoEntradas2);
		
		botaoCadastrar2 = new JButton("Cadastrar");
		botaoCadastrar2.setPreferredSize(tamanhoEntradas2);
		botaoCadastrar2.setMaximumSize(tamanhoEntradas2);
		botaoCadastrar2.setMaximumSize(tamanhoEntradas2);
		
		
		centralizador3.gridy = 0;
		telaVendas.add(nomeVendedor,centralizador3);
		centralizador3.gridy = 1;
		telaVendas.add(entrada9,centralizador3);
		
		centralizador3.gridy = 2;
		telaVendas.add(veiculo,centralizador3);
		centralizador3.gridy = 3;
		telaVendas.add(entrada10,centralizador3);
		
		centralizador3.gridy = 4;
		telaVendas.add(precoVenda,centralizador3);
		centralizador3.gridy = 5;
		telaVendas.add(entrada11,centralizador3);
		
		centralizador3.gridy = 6;
		telaVendas.add(local,centralizador3);
		centralizador3.gridy = 7;
		telaVendas.add(entrada12,centralizador3);
		
		centralizador3.gridy = 8;
		telaVendas.add(botaoCadastrar2,centralizador3);
		
		
		telaVendas.setVisible(true);
	}

	public static void main(String[] args) {
		TelaVendas telaVendas = new TelaVendas();

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
    }

}
