package Visualizacao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import Controle.ControleDados;
import Controle.ControleVeiculo;
import Controle.ControleVendas;

public class TelaVeiculo {
	private JFrame tela ;
	private JPanel painelEsquerdo,painelCentral;
	private JButton botaoCadastrarVeiculos,botaoAtualizarVeiculos,
	botaoBuscarMarcas, botaoBuscarPrecos, botaoCadastrarVendas,botaoAtualizarVendas;
	private JComboBox<String> listaPrecos;
	private JTextField entradaMarcas;
	private JLabel tituloMarcas,tituloPrecos, tituloCadastro;
	//private JList<String> listasVeiculos, listasVendas;
	//private  DefaultListModel<String> listModel;
	private static ControleDados controleDados = new ControleDados();
	private ControleVeiculo controleVeiculo = new ControleVeiculo();
	private ControleVendas controleVenda = new ControleVendas();
	private String[] dadosVeiculo;
	private String [] dadosProntos; 
	private JTable veiculosTable;
	private Font padraoFonte= new Font("Arial", Font.PLAIN, 12);
	private JPanel painelTable;
	
	public TelaVeiculo() {
	
		
		tela = new JFrame();
		painelEsquerdo = new JPanel();
		painelCentral = new JPanel();
		painelTable = new JPanel();
		botaoCadastrarVeiculos = new JButton("Cadastrar");
		botaoAtualizarVeiculos = new JButton("Atualizar");
		tituloMarcas = new JLabel("Buscar por Marcas");
		entradaMarcas = new JTextField();
		botaoBuscarMarcas = new JButton("Buscar");
		tituloCadastro = new JLabel("Alguns Veiculos Cadastrados");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Código");
		model.addColumn("Nome");
		model.addColumn("Ano");
		model.addColumn("Cor");
		model.addColumn("FinalPlaca");
		model.addColumn("Preco");
		model.addColumn("Quilometragem");
		model.addColumn("Categoria");
		model.addColumn("Marca");
		model.addRow(new Object[] {"0202 ","Duster",2020,"Laranja",4,4,0,"Sedan","Renaut"});

		veiculosTable = new JTable(model);
		veiculosTable.setRowHeight(30);
		veiculosTable.getTableHeader().setFont(padraoFonte);
		veiculosTable.setFont(padraoFonte);
		veiculosTable.setBackground(new Color(220, 220, 220));

		tela.setBounds(483 ,159, 750 , 600);	
		tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);		
		painelEsquerdo.setBackground(Color.LIGHT_GRAY);
		painelEsquerdo.setLayout(new BoxLayout(painelEsquerdo, BoxLayout.Y_AXIS));
		painelCentral.setLayout(null);
		entradaMarcas.setBounds(50,40,100,30);
		tituloMarcas.setBounds(50,10,200,30);
		painelTable.setBounds(50,70, 500,400);
		painelCentral.setLayout(new FlowLayout());
		
		painelCentral.setBounds(333 ,159, 500 , 450);	
		Dimension tamanhoBotoes = new Dimension(100,25);
		Dimension tamanhoEntrada = new Dimension(200,25);
	
		entradaMarcas.setPreferredSize(tamanhoEntrada);
		entradaMarcas.setMaximumSize(tamanhoEntrada);
		botaoBuscarMarcas.setPreferredSize(tamanhoBotoes);
		botaoBuscarMarcas.setMaximumSize(tamanhoBotoes);
		botaoCadastrarVeiculos.setSize(tamanhoBotoes);
		botaoCadastrarVeiculos.setMaximumSize(tamanhoBotoes);
		botaoAtualizarVeiculos.setSize(tamanhoBotoes);
		botaoAtualizarVeiculos.setMaximumSize(tamanhoBotoes);
		
		tituloCadastro.setFont(new Font("Arial", Font.BOLD, 20));
		veiculosTable.setPreferredSize(new Dimension(270,100));
		veiculosTable.setBounds(20, 50, 350, 120);
		veiculosTable.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		
		painelTable.add(new JScrollPane(veiculosTable));
		painelEsquerdo.add(botaoCadastrarVeiculos);
		painelEsquerdo.add(Box.createVerticalStrut(5));
		painelEsquerdo.add(botaoAtualizarVeiculos);
		painelEsquerdo.add(Box.createVerticalStrut(5));

		
		painelCentral.add(tituloMarcas);
		painelCentral.add(entradaMarcas);
		painelCentral.add(botaoBuscarMarcas);
		painelCentral.add(painelTable);
		tela.add(painelEsquerdo, BorderLayout.WEST);
		tela.add(painelCentral);
		tela.setVisible(true);

	
	
	

	}
	
	
	public static void main(String[]args) {
		TelaVeiculo tela = new TelaVeiculo();
	}
}