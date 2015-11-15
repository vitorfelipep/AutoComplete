package com.algaworks.dataTable;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Funcionario implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long matricula;
	private String nome;
	private Date dataEmissao;
	private BigDecimal salario;
	
	public Funcionario(Long matricula, String nome, Date dataEmissao,
			BigDecimal salario) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.dataEmissao = dataEmissao;
		this.salario = salario;
	}

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
