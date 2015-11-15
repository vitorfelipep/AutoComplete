package com.algaworks.dataTable;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class DataTableMb implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private static final String[]	names = {"João", "Maria", "José", "Eduardo", "Sebastião", "Mariana", "Francisco", "Manoel", 
											"Maria", "Assis", "Batista", "Fernanda", "Vitor", "Gabriela", "Mário", "Marcos" };
	
	private static final String[]	sobreNomes = {"Souza", "Silva", "Andrade", "Machado", "Júnior", "Alburqueque", "Alencar", "Labre", 
		"Assis", "Batista", "Camargo", "Coelho", "Costa", "Dias", "Rosa", "Leal", "Lima", "Soares" };
	
	private List<Funcionario> funcionarios;
	
	public DataTableMb() throws ParseException{
		funcionarios = new ArrayList<>();
		
		for(int i = 0; i< 50; i++){
			adicionarFuncionario();
		}
	}

	private void adicionarFuncionario() {
		String nomeCompleto = getNomeAleatorio() + " " + getSobreNomeAleatorio() + " " + getSobreNomeAleatorio();
		
		funcionarios.add(new Funcionario(getMatriculaAleatoria(), nomeCompleto, getDataAleatoria(), getSalarioAleatorio()));
	}

	
	private Long getMatriculaAleatoria() {
		return (long) (Math.random() * 10000);
	}

	private BigDecimal getSalarioAleatorio(){
		return new BigDecimal(1000 + (Math.random() * 29000));
	}
	
	private String getNomeAleatorio() {
		int posicao = (int) Math.round(Math.random() * (names.length -1));
		return names[posicao];
	}
	
	private Date getDataAleatoria() {
		long dezAnosEmMillis = 24 * 60 * 60 * 1000;
		long periodoSorteadoEmMillis = ((long) (Math.random() * 10 * 365)) * dezAnosEmMillis;
		return new Date(System.currentTimeMillis() - periodoSorteadoEmMillis);
	} 
	
	private String getSobreNomeAleatorio() {
		int posicao = (int) Math.round(Math.random() * (sobreNomes.length -1));
		return sobreNomes[posicao];
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
}
