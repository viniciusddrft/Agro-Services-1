package br.gov.sp.fatec.projeto.ads.agroecommercesolution.datajpa.model;

import javax.persistence.*;

@Entity
@Table(name = "servico")
/**
 * Classe representação de um objeto P.O.J.O. (Plain Old Java Object)
 * fazendo um DE/PARA objetos como tabelas de BD, XML, JSON e modelos de dados 
 */
public class Servico {
	
	// RDBMS >> tabela > colunas e linhas
	// NO-SQL >> json, string, object, xml, ...
	
	public Servico() {}
	
	public Servico(Servico _servico) {
		//this.setId(_servico.getId());
		this.nome = _servico.getNome();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "nome")
	private String nome;
	
	
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
		return "Servico [id=" + id + ", nome=" + nome + "]";
	}

}
