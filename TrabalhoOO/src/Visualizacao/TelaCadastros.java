package Visualizacao;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import Controle.ControleDados;
import Controle.ControleVeiculo;
import Controle.ControleVendas;
import Dao.ExceptionDAO;
import Modelo.Veiculo;

public class TelaCadastros implements ActionListener, ListSelectionListener{

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
	//private ControleVeiculo controleVeiculo = new ControleVeiculo();
	private ControleVendas controleVenda = new ControleVendas();
	//private String[] dadosVeiculo;
	//private String [] dadosProntos; 
	private JTable veiculosTable;
	private Font padraoFonte = new Font("Bodoni MT Condensed", Font.PLAIN, 12);
	private JPanel painelTable;

	public void mostrarTela(ControleDados dados, int op) {
		controleDados = dados;

		switch(op) {

		case 1:

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
			model.addColumn("numPortas");
			model.addColumn("Preco");
			model.addColumn("Quilometragem");
			model.addColumn("Categoria");
			model.addColumn("Marca");
			//model.addRow(new Object[] {"0202 ","Duster",2020,"Laranja",4,4,0,"Sedan","Renaut"});

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
		

			painelTable.add(new JScrollPane(veiculosTable));
			painelEsquerdo.add(botaoCadastrarVeiculos);
			painelEsquerdo.add(Box.createVerticalStrut(5));
			painelEsquerdo.add(botaoAtualizarVeiculos);
			painelEsquerdo.add(Box.createVerticalStrut(5));
			botaoBuscarMarcas.addActionListener(this);
			botaoCadastrarVeiculos.addActionListener(this);
			painelCentral.add(tituloMarcas);
			painelCentral.add(entradaMarcas);
			painelCentral.add(botaoBuscarMarcas);
			painelCentral.add(painelTable);
			tela.add(painelEsquerdo, BorderLayout.WEST);
			tela.add(painelCentral);
			tela.setVisible(true);

			break;


		case 2:
			//JFrame
			tela = new JFrame();
			tela.setBounds(483 ,159, 500 , 450);	
			tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

			//Painel de Opcoes e seus componentes 
			painelEsquerdo = new JPanel();
			painelEsquerdo.setBackground(Color.LIGHT_GRAY);
			painelEsquerdo.setLayout(new BoxLayout(painelEsquerdo, BoxLayout.Y_AXIS));

			// Dimension para setar o tamanho dos botoes
			Dimension tamanhoBotoes2 = new Dimension(100,30);
			botaoCadastrarVendas = new JButton("Cadastrar");
			botaoCadastrarVendas.setSize(tamanhoBotoes2);
			botaoCadastrarVendas.setMaximumSize(tamanhoBotoes2);
			botaoCadastrarVendas.addActionListener(this);

			botaoAtualizarVendas = new JButton("Atualizar");
			botaoAtualizarVendas.setSize(tamanhoBotoes2);
			botaoAtualizarVendas.setMaximumSize(tamanhoBotoes2);
			botaoAtualizarVendas.addActionListener(this);


			//Componentes do painel central
			painelCentral = new JPanel();
			painelCentral.setBounds(333 ,159, 500 , 450);	
			painelCentral.setLayout(new GridBagLayout());

			// alinhador do Painel
			GridBagConstraints alinhadorPainelCentral2 = new GridBagConstraints();
			alinhadorPainelCentral2.gridx = 0;
			alinhadorPainelCentral2.gridy = 0;
			alinhadorPainelCentral2.insets = new Insets(5, 5, 5, 5);
			alinhadorPainelCentral2.anchor = GridBagConstraints.FIRST_LINE_START;

			tituloCadastro = new JLabel("Algumas Vendas Cadastradas");
			tituloCadastro.setFont(new Font("Arial", Font.BOLD, 20));

			//JList

			//adicao do painel de opcoes
			painelEsquerdo.add(botaoCadastrarVendas);
			painelEsquerdo.add(Box.createVerticalStrut(5));
			painelEsquerdo.add(botaoAtualizarVendas);
			painelEsquerdo.add(Box.createVerticalStrut(5));

			Dimension tamanhoComboBox = new Dimension(200,30);
			//Listagem de Marcas
			tituloPrecos = new JLabel("Precos");
			tituloPrecos.setFont(new Font("Arial", Font.BOLD,14));
			listaPrecos = new JComboBox<String>();
			listaPrecos.setPreferredSize(tamanhoComboBox);
			listaPrecos.setMaximumSize(tamanhoComboBox);
			listaPrecos.addItem("3.000,00 - 10.000,00");
			listaPrecos.addItem("10.000,00 - 50.000,00");

			botaoBuscarPrecos = new JButton("Buscar");
			botaoBuscarPrecos.setPreferredSize(tamanhoBotoes2);
			botaoBuscarPrecos.setMaximumSize(tamanhoBotoes2);



			//adicao do painel Central
			alinhadorPainelCentral2.gridy = 0;
			painelCentral.add(tituloCadastro, alinhadorPainelCentral2);


			alinhadorPainelCentral2.gridy = 3;
			painelCentral.add(tituloPrecos,alinhadorPainelCentral2);
			alinhadorPainelCentral2.gridy = 4;
			painelCentral.add(new JScrollPane (veiculosTable),alinhadorPainelCentral2);

			alinhadorPainelCentral2.gridy = 5;
			painelCentral.add(botaoBuscarPrecos,alinhadorPainelCentral2);

			tela.add(painelEsquerdo, BorderLayout.WEST);
			tela.add(painelCentral);


			tela.setVisible(true);

			break;

		default :
			JOptionPane.showMessageDialog(null,"Error", null, 
					JOptionPane.ERROR_MESSAGE);

		}

	}

	
	public void consultarVeiculo(java.awt.event.ActionEvent evt) {

			String marca = entradaMarcas.getText();
			DefaultTableModel model = (DefaultTableModel) veiculosTable.getModel();
			model.setRowCount(0);
			ControleVeiculo controle = new ControleVeiculo();

			try {
				ArrayList<Veiculo> veiculos = controle.consultarVeiculo(marca);
			
				veiculos.forEach((Veiculo veiculo) -> {
					model.addRow(new Object [] {veiculo.getCodVeiculo(),
													 veiculo.getNomeVeiculo(),
													 veiculo.getAno(),
													 veiculo.getCor(),
													 veiculo.getFinalPlaca(),
													 veiculo.getNumPortas(),
													 veiculo.getPreco(),
													 veiculo.getQuilometragem(),
													 veiculo.getCategoria(),
													 veiculo.getMarca()});
				});
				veiculosTable.setModel(model);

			}catch(ExceptionDAO e) {
				Logger.getLogger(TelaCadastros.class.getName()).log(Level.SEVERE , null, e);
			}
		}
		
		public static void main(String[] args) {
				TelaCadastros tela = new TelaCadastros();
		}
	
	


	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		int i;
		if(src == botaoCadastrarVeiculos) {
			new TelaDetalheVeiculo();
		}
		if(src == botaoCadastrarVendas) {
			new TelaDetalheVendas();
		}
		if(src == botaoBuscarMarcas) {
			consultarVeiculo(e);
		}
		
	}



	/*
			try {
				ArrayList<Veiculo> veiculos = new ControleVeiculo().consultarVeiculo(nome);

				veiculos.forEach((Veiculo veiculo) -> {
					model.addRow(new Object[] { veiculo.getCodVeiculo(),
												veiculo.getNomeVeiculo(),
												veiculo.getAno(),
												veiculo.getCor(),
												veiculo.getFinalPlaca(),
												veiculo.getFinalPlaca(),
												veiculo.getNumPortas(),
												veiculo.getPreco(),
												veiculo.getQuilometragem(),
												veiculo.getCategoria(),
												veiculo.getMarca()});
				});
					veiculosTable.setModel(model);

					}catch(ExceptionDAO e1) {
						Logger.getLogger(TelaCadastros.class.getName()).log(Level.SEVERE , null, e1);
					}
}



	 */

	@Override
	public void valueChanged(ListSelectionEvent e) {
		/*
	Object src = e.getSource();

	if(e.getValueIsAdjusting() && src == listasVeiculos) {
		new TelaDetalhesDadosProntos().mostrarTelaDetalhes(1,controleDados, this, listasVeiculos.getSelectedIndex());
	}

	if(e.getValueIsAdjusting() && src == listasVendas) {
		new TelaDetalhesDadosProntos().mostrarTelaDetalhes(2, controleDados, this, listasVendas.getSelectedIndex());
	}


		 */
	}
}
