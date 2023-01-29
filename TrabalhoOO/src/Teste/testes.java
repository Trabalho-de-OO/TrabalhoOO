package Teste;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import Controle.ControleVeiculo;
import Controle.ControleVenda;
import Dao.ExceptionDAO;

class testes {

	@Test
	void testcCadastrarVeiculo() throws ExceptionDAO {
		ControleVeiculo controleVeiculo = new ControleVeiculo();
		assertTrue(controleVeiculo.cadastrarVeiculo("Celta", 2019, "Branco", 45, 4, 30000, 3000, "Sedan", "Fiat") );
		assertFalse(controleVeiculo.cadastrarVeiculo(null, 0, null, 0, 0, 0, 0, null, null));	
	}
	
	@Test
	void testarCadastrarVenda() throws ExceptionDAO{
		ControleVenda controleVenda = new ControleVenda();
		assertTrue(controleVenda.cadastrarVendas("Doan", "Ferrari", 100000000, "Gama-DF"));
		assertFalse(controleVenda.cadastrarVendas(null, null, 0, null));
	}
	
	@Test
	void testarApagarVeiculo() throws ExceptionDAO {
			ControleVenda controleVenda2 = new ControleVenda();
			assertTrue(controleVenda2.apagarVenda(1));
			assertFalse(controleVenda2.apagarVenda(0));
	}

}
