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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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

public class TelaVeiculo implements ActionListener, MouseListener{

	private JFrame tela ;
	private JPanel painelEsquerdo,painelCentral;
	private JButton botaoCadastrarVeiculos,
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
	private TelaCadastrarVeiculo telaCadastroVeiculo= new TelaCadastrarVeiculo();
	private DefaultTableModel model = new DefaultTableModel() {
		@Override
		public boolean isCellEditable(final int l, final int c) {
			return false;
		}


	};
	
	public TelaVeiculo () {

		tela = new JFrame();
		painelEsquerdo = new JPanel();
		painelCentral = new JPanel();
		painelTable = new JPanel();
		botaoCadastrarVeiculos = new JButton("Cadastrar");
		
		tituloMarcas = new JLabel("Buscar por Marcas");
		entradaMarcas = new JTextField();
		botaoBuscarMarcas = new JButton("Buscar");
		tituloCadastro = new JLabel("Alguns Veiculos Cadastrados");


		//DefaultTableModel model = new DefaultTableModel();
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
		//veiculosTable.getTableHeader().setFont(padraoFonte);
		veiculosTable.setFont(padraoFonte);
		veiculosTable.addMouseListener(this);

		tela.setBounds(483 ,159, 650 , 550);	
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
	

		tituloCadastro.setFont(new Font("Arial", Font.BOLD, 20));


		painelTable.add(new JScrollPane(veiculosTable));
		painelEsquerdo.add(botaoCadastrarVeiculos);
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
			Logger.getLogger(TelaVeiculo.class.getName()).log(Level.SEVERE , null, e);
		}
	}
	public void tabelaClick(java.awt.event.MouseEvent evt) {
		
		if(evt.getClickCount() == 2) {
			
			Integer codVeiculo = (Integer) veiculosTable.getModel().getValueAt(veiculosTable.getSelectedRow() ,0);
			String nomeVeiculo = (String) veiculosTable.getModel().getValueAt(veiculosTable.getSelectedRow(), 1);
			Integer ano = (Integer) veiculosTable.getModel().getValueAt(veiculosTable.getSelectedRow(), 2);
			String cor = (String) veiculosTable.getModel().getValueAt(veiculosTable.getSelectedRow(), 3);
			Integer finalPlaca = (Integer) veiculosTable.getModel().getValueAt(veiculosTable.getSelectedRow(), 4);
			Integer numPortas = (Integer) veiculosTable.getModel().getValueAt(veiculosTable.getSelectedRow(), 5);
			Integer preco = (Integer) veiculosTable.getModel().getValueAt(veiculosTable.getSelectedRow(), 6);
			Integer quilometragem = (Integer) veiculosTable.getModel().getValueAt(veiculosTable.getSelectedRow(), 7);
			String categoria = (String) veiculosTable.getModel().getValueAt(veiculosTable.getSelectedRow(), 8);
			String marca = (String) veiculosTable.getModel().getValueAt(veiculosTable.getSelectedRow(), 9);
 			
			this.telaCadastroVeiculo.buscarVeiculo(codVeiculo, nomeVeiculo, ano, cor , finalPlaca,
					numPortas, preco, quilometragem,categoria,marca);
			this.telaCadastroVeiculo.mostrarTela();
			
			
		}
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		int i;
		if(src == botaoCadastrarVeiculos) {
			new TelaCadastrarVeiculo().mostrarTela();
		}
		if(src == botaoCadastrarVendas) {
			new TelaDetalheVendas();
		}
		if(src == botaoBuscarMarcas) {
			consultarVeiculo(e);
		}

	}



	
	@Override
	public void mouseClicked(MouseEvent e) {

	Object src = e.getSource();
	
	if(src == veiculosTable){
		tabelaClick(e);
		
	}
	
		
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	//desabilitar q edição da Tabela

}