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


import Controle.ControleVeiculo;

import Dao.ExceptionDAO;
import Modelo.Veiculo;

/*
 * Tela para Veiculo com a tebela de veiculos
 * 
 */

public class TelaVeiculo implements ActionListener, MouseListener{

	private JFrame tela = new JFrame();
	private JPanel painelEsquerdo = new JPanel();
	private	JPanel painelCentral= new JPanel();
	private JPanel painelTable = new JPanel();
	private JButton botaoCadastrarVeiculos = new JButton("Cadastrar");
	private JButton botaoBuscarMarcas = new JButton("Buscar");
	private JButton botaoBuscarPrecos = new JButton("Buscar");
	private JTextField entradaMarcas = new JTextField();
	private JTextField entradaPrecos = new JTextField("0");
	private JLabel tituloMarcas = new JLabel("Buscar por Marcas"); 
	private JLabel tituloPreco = new JLabel("Buscar por Preço"); ;
	private JTable veiculosTable;
	private Font fonte = new Font("Bodoni MT Condensed", Font.PLAIN, 12);
	private TelaCadastrarVeiculo telaCadastroVeiculo= new TelaCadastrarVeiculo();
	

	public TelaVeiculo () {
		
		model.addColumn("Código");
		model.addColumn("Nome");
		model.addColumn("Ano");
		model.addColumn("Cor");
		model.addColumn("FinalPlaca");
		model.addColumn("Portas");
		model.addColumn("Preco");
		model.addColumn("kms");
		model.addColumn("Categoria");
		model.addColumn("Marca");
		veiculosTable = new JTable(model);

		veiculosTable.setPreferredSize(new Dimension(700,400));
		veiculosTable.getTableHeader().setFont(new Font("Arial", Font.BOLD, 12));
		veiculosTable.setFont(fonte);
		veiculosTable.addMouseListener(this);

		tela.setBounds(483 ,159, 600, 550);	
		tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);		
		painelEsquerdo.setBackground(Color.LIGHT_GRAY);
		painelEsquerdo.setLayout(new BoxLayout(painelEsquerdo, BoxLayout.Y_AXIS));
		painelCentral.setLayout(null);
		entradaMarcas.setBounds(50,40,100,30);
		entradaPrecos.setBounds(50,40,100,30);
		tituloMarcas.setBounds(50,10,200,30);
		tituloPreco.setBounds(50,10,200,30);
		painelTable.setBounds(50,70, 800,400);
		painelCentral.setLayout(new FlowLayout());


		painelCentral.setBounds(333 ,159, 800 , 450);	
		Dimension tamanhoBotoes = new Dimension(100,30);
		Dimension tamanhoEntrada = new Dimension(200,25);

		entradaMarcas.setPreferredSize(tamanhoEntrada);
		entradaMarcas.setMaximumSize(tamanhoEntrada);
		entradaPrecos.setPreferredSize(tamanhoEntrada);
		entradaPrecos.setMaximumSize(tamanhoEntrada);
		botaoBuscarMarcas.setPreferredSize(tamanhoBotoes);
		botaoBuscarMarcas.setMaximumSize(tamanhoBotoes);
		botaoBuscarPrecos.setPreferredSize(tamanhoBotoes);
		botaoBuscarPrecos.setMaximumSize(tamanhoBotoes);
		botaoCadastrarVeiculos.setSize(tamanhoBotoes);
		botaoCadastrarVeiculos.setMaximumSize(tamanhoBotoes);
	
		painelTable.add(new JScrollPane(veiculosTable));
		painelEsquerdo.add(botaoCadastrarVeiculos);
		painelEsquerdo.add(Box.createVerticalStrut(5));
		
		botaoBuscarMarcas.addActionListener(this);
		botaoBuscarPrecos.addActionListener(this);
		botaoCadastrarVeiculos.addActionListener(this);
		painelCentral.add(tituloMarcas);
		painelCentral.add(entradaMarcas);
		painelCentral.add(botaoBuscarMarcas);
		painelCentral.add(tituloPreco);
		painelCentral.add(entradaPrecos);
		painelCentral.add(botaoBuscarPrecos);
		painelCentral.add(painelTable);
		tela.add(painelEsquerdo, BorderLayout.WEST);
		tela.add(painelCentral);
		tela.setVisible(true);



	}
	/*
	 * 
	 * Método para instanciar uma nova tela com dados 
	 * já preenchidos 
	 */
	
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
	
	/*
	 * Método para dar ações ao componentes 
	 * 
	 */
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		int i;
		if(src == botaoCadastrarVeiculos) {
			new TelaCadastrarVeiculo().mostrarTela();
		}
	
		if(src == botaoBuscarMarcas) {
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

			}catch(ExceptionDAO e1) {
				Logger.getLogger(TelaVeiculo.class.getName()).log(Level.SEVERE , null, e);
			}
		}
		if(src == botaoBuscarPrecos) {
			int preco= Integer.parseInt(entradaPrecos.getText());
			DefaultTableModel model = (DefaultTableModel) veiculosTable.getModel();
			model.setRowCount(0);
			ControleVeiculo controle = new ControleVeiculo();

			try {
				ArrayList<Veiculo> veiculos = controle.consultarVeiculoPreco(preco);

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

			}catch(ExceptionDAO e1) {
				Logger.getLogger(TelaVeiculo.class.getName()).log(Level.SEVERE , null, e);
			}
			
		}

	}

/*
 * Método para dar ação ao click do mouse
 * 
 */

	
	@Override
	public void mouseClicked(MouseEvent e) {

	Object src = e.getSource();
	
	if(src == veiculosTable){
		tabelaClick(e);
		tela.dispose();
		
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
		
		
	}
	
	/*
	 * Método para desativar a edição da tabela
	 * 
	 */
	
	//desabilitar q edição da Tabela
	private DefaultTableModel model = new DefaultTableModel() {
		@Override
		public boolean isCellEditable(final int l, final int c) {
			return false;
		}
	};

}