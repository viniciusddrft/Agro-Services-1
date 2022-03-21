package br.gov.sp.fatec.projeto.ads.agroecommercesolution.datajpa.model;

import javax.persistence.*;

@Entity
@Table(name = "produto")
/**
 * Classe representação de um objeto P.O.J.O. (Plain Old Java Object)
 * fazendo um DE/PARA objetos como tabelas de BD, XML, JSON e modelos de dados 
 */
public class Produto {
	
	// RDBMS >> tabela > colunas e linhas
	// NO-SQL >> json, string, object, xml, ...
	
	public Produto() {}
	
	public Produto(Produto _produto) {
		//this.setId(_produto.getId());
		this.nome = _produto.getNome();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "peso")
	private String peso;
		
	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + "]";
	}

}
