package Controle;

import java.util.ArrayList;

import Dao.ExceptionDAO;
import Modelo.Veiculo;
import Modelo.Venda;

public class ControleVenda {

	private Venda venda ;

	public ControleVenda() {

	}	
	public Venda getVenda() {
		return venda;
	}
	public void setVenda(Venda venda) {
		this.venda = venda;
	}

	public boolean cadastrarVendas(String vendedor, String veiculo, int precoVenda,String localVenda) throws ExceptionDAO {

		if( vendedor  != null && vendedor.length() > 0 &&  veiculo != null && veiculo.length() > 0 &&
				precoVenda >= 3000 && localVenda != null && localVenda.length() >0) {

			Venda venda = new Venda( vendedor, veiculo,precoVenda, localVenda);
			venda.cadastrarVenda(venda);
			return true;
		}

		return false;
	}
	public ArrayList<Venda> consultarVendas(String vendedor) throws ExceptionDAO{
		return new Venda().consultarVenda(vendedor);
	}	

	public boolean mudarVenda(int codVenda, String vendedor, String veiculo, int precoVenda,String localVenda) throws ExceptionDAO {

		if( vendedor  != null && vendedor.length() > 0 &&  veiculo != null && veiculo.length() > 0 &&
				precoVenda >= 3000 && localVenda != null && localVenda.length() >0) {

			Venda venda = new Venda( vendedor, veiculo,precoVenda, localVenda);
			venda.setCodVenda(codVenda);
			venda.mudarVenda(venda);
			return true;
		}
		return false;

	}
	
	public boolean apagarVenda(int codVenda) throws ExceptionDAO {
		if(codVenda == 0) {
			return false;
			
		}else {
			Venda venda = new Venda();
			venda.setCodVenda(codVenda);
			venda.apagarVenda(venda);
			return true;
		}
		
		
		
		
	}
}