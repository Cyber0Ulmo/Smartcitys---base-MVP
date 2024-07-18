package br.com.fiap.smartcities.domain;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;


@Entity
@Table(name = "tb_estoque")
public class Estoque {
	
	@Id
	@SequenceGenerator(name="estoque",sequenceName="sq_tb_estoque",allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="estoque")
	@Column(name = "id_estoque")
	private Integer id;

	@Column(name = "nome_estoque", length = 50)
	private String nome;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dh_criacao")
	private Calendar dataCriacao;
	
	@OneToOne
	@JoinColumn(name="id_loja")
	private Loja hU;

	public Loja gethU() {
		return hU;
	}

	public void sethU(Loja hU) {
		this.hU = hU;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Calendar dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	

}
