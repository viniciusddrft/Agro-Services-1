package br.gov.sp.fatec.projeto.ads.agroecommercesolution.datajpa.model;

import javax.persistence.*;

@Entity
@Table(name = "pedido")
/**
 * Classe representação de um objeto P.O.J.O. (Plain Old Java Object)
 * fazendo um DE/PARA objetos como tabelas de BD, XML, JSON e modelos de dados 
 */
public class Pedido {
	
	// RDBMS >> tabela > colunas e linhas
	// NO-SQL >> json, string, object, xml, ...
	
	public Pedido() {}
	
	public Pedido(Pedido _pedido) {
		//this.setId(_pedido.getId());
		this.nome = _pedido.getNome();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "total")
	private String total;
	
	@Column(name = "idUsuario")
	private String idUsuario;
	
	
	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
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
		return "Pedido [id=" + id + ", nome=" + nome + "]";
	}

}
