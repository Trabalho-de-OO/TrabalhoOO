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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Controle.ControleVeiculo;
import Controle.ControleVenda;
import Dao.ExceptionDAO;
import Modelo.Veiculo;
import Modelo.Venda;

public class TelaVenda  implements ActionListener, MouseListener{

	private JFrame tela = new JFrame();
	private JPanel painelEsquerdo = new JPanel();
	private JPanel painelCentral  = new JPanel();
	private JPanel painelTable = new JPanel();
	private JButton botaoBuscarVendedor = new JButton("Buscar");
	private JButton botaoCadastrarVenda = new JButton("Cadastrar");
	//private JComboBox<String> comboBoxPreco = new JComboBox<String>();
	private Font fonte = new Font("Bodoni MT Condensed", Font.PLAIN, 12);
	private JTable vendaTable;
	
	private TelaCadastrarVenda  telaCadastroVenda = new TelaCadastrarVenda();
	private JTextField entradaPrecos = new JTextField();
	
	public TelaVenda() {
		
		model.addColumn("Código");
		model.addColumn("Vendedor");
		model.addColumn("Veiculo");
		model.addColumn("Preço");
		model.addColumn("Local");
		
		vendaTable = new JTable(model);
		vendaTable.setRowHeight(30);
		vendaTable.getTableHeader().setFont(new Font("Arial", Font.BOLD, 12));
		vendaTable.setFont(fonte);
		vendaTable.addMouseListener(this);

		tela.setBounds(483 ,159, 650 , 550);	
		tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);		
		painelEsquerdo.setBackground(Color.LIGHT_GRAY);
		painelEsquerdo.setLayout(new BoxLayout(painelEsquerdo, BoxLayout.Y_AXIS));
		painelCentral.setLayout(null);
		painelTable.setBounds(50,70, 600,400);
		painelCentral.setLayout(new FlowLayout());
		/*
		comboBoxPreco.addItem("3000 até 20.000");
		comboBoxPreco.addItem("30.000 até 50.000");
		comboBoxPreco.addItem("50.000 até 100.000");
		comboBoxPreco.addItem("200.000 até 500.000");
		comboBoxPreco.addItem("500.000 até 1.000.000");
*/

		painelCentral.setBounds(333 ,159, 500 , 450);	
		Dimension tamanhoBotoes = new Dimension(100,25);
		Dimension tamanhoEntrada = new Dimension(200,25);

	
		botaoBuscarVendedor.setPreferredSize(tamanhoBotoes);
		botaoBuscarVendedor.setMaximumSize(tamanhoBotoes);
		botaoCadastrarVenda.setSize(tamanhoBotoes);
		botaoCadastrarVenda.setMaximumSize(tamanhoBotoes);
		entradaPrecos.setPreferredSize(tamanhoEntrada);
		entradaPrecos.setMaximumSize(tamanhoEntrada);
		
		painelTable.add(new JScrollPane(vendaTable));
		painelEsquerdo.add(botaoCadastrarVenda);
		painelEsquerdo.add(Box.createVerticalStrut(5));
		
		botaoBuscarVendedor.addActionListener(this);
		botaoCadastrarVenda.addActionListener(this);
		painelCentral.add(entradaPrecos);
		painelCentral.add(botaoBuscarVendedor);
		painelCentral.add(painelTable);
		tela.add(painelEsquerdo, BorderLayout.WEST);
		tela.add(painelCentral);
		tela.setVisible(true);
		
}
	public void consultarVenda(java.awt.event.ActionEvent evt) {
		String vendedor = entradaPrecos.getText();
		DefaultTableModel model = (DefaultTableModel) vendaTable.getModel();
		model.setRowCount(0);
		ControleVenda controle = new ControleVenda();
		try {
			ArrayList<Venda> vendas = controle.consultarVendas(vendedor);
			vendas.forEach((Venda venda) ->{
				model.addRow(new Object[] { venda.getCodVenda(),
						venda.getVendedor(),
						venda.getVeiculo(),
						venda.getPrecoVenda(),
						venda.getLocalVenda()});
			}); vendaTable.setModel(model);
			
		}catch(Exception e1) {
			
			}
		
	}
	
	
	
	public static void main(String[] args) {
	
		TelaVenda tela = new TelaVenda();
	}
public void tabelaClick(java.awt.event.MouseEvent evt) {
		
		if(evt.getClickCount() == 2) {
			
			Integer codVenda= (Integer) vendaTable.getModel().getValueAt(vendaTable.getSelectedRow() ,0);
			String vendedor = (String) vendaTable.getModel().getValueAt(vendaTable.getSelectedRow(), 1);
			String veiculo = (String) vendaTable.getModel().getValueAt(vendaTable.getSelectedRow(), 2);
			Integer precoVenda = (Integer) vendaTable.getModel().getValueAt(vendaTable.getSelectedRow(), 3);
			String localVenda = (String) vendaTable.getModel().getValueAt(vendaTable.getSelectedRow(), 4);
 			
			this.telaCadastroVenda.buscarVenda(codVenda, vendedor, veiculo, precoVenda, localVenda);
			this.telaCadastroVenda.mostrarTela();
			
		}
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == botaoCadastrarVenda) {
			new TelaCadastrarVenda().mostrarTela();
		}
		if(src == botaoBuscarVendedor) {
				consultarVenda(e);
			}
					
		
		
		
	}

	


	@Override
	public void mouseClicked(MouseEvent e) {
			Object src = e.getSource();
			
			if(src == vendaTable) {
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
	public DefaultTableModel model = new DefaultTableModel() {
		
		@Override 
		public boolean isCellEditable(final int l, final int c) {
			return false;
		}
	};
	

}
