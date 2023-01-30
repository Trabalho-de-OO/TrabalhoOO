package Modelo;


/**
 * Classe abstrata para representar uma pessoa
 * quer tem atributos herdados por comprador e vendedor
 * 
 * 
 * @author Doan Filho
 *@since 2022
 */

public class Pessoa {
	//atributos
		protected String nome ;
		protected String email;
		protected int telefone;
		protected String cpf;
		protected String endereco;
		
		/**
		 * Construtor vazio pois classe abstrata não pode ser instanciada
		 */

		public Pessoa() {
			super();
		}
		//get e set nome 
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		//email
		
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		//telefone
		public int getTelefone() {
			return telefone;
		}
		public void setTelefone(int telefone) {
			this.telefone = telefone;
		}
		//cpf
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		//endereco
		public String getEndereco() {
			return endereco;
		}
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		
}
