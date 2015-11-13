package com.algaworks.cursojavaee;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class PerfilUsuarioEstadoBean implements Serializable{
	

	private static final long serialVersionUID = 1L;
	
	private List<String> estados = new ArrayList<>();
	private List<String> cidades = new ArrayList<>();
	
	private String nomeCara;
	private String estado;
	private String cidade;
	
	public PerfilUsuarioEstadoBean() {
		estados.add("MG");
		estados.add("RJ");
		estados.add("RS");
		estados.add("SP");
		
	}
	
	public void atualizar(){
		System.out.println("Estado: " + this.estado);
		System.out.println("Cidade: " + this.cidade);
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil Atualizado!"));
	}
	
	public void carregarCidades(){
		cidades.clear();
		
		if("MG".equals(estado)){
			cidades.add("Uberlandia");
			cidades.add("Uberaba");
			cidades.add("Belo Horizonte");
		}else if("RJ".equals(estado)){
			cidades.add("Belford Roxo");
			cidades.add("Nova Iguaçu");
			cidades.add("Madureira");
			cidades.add("Caxias");
		}else if("SP".equals(estado)){
			cidades.add("Blumenau");
			cidades.add("Ribeirão Preto");
			cidades.add("Franca");
			cidades.add("São Paulo");
		}
	}
	public List<String> getEstados() {
		return estados;
	}


	public List<String> getCidades() {
		return cidades;
	}

	
	public String getNomeCara() {
		return nomeCara;
	}

	public void setNomeCara(String nomeCara) {
		this.nomeCara = nomeCara;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

}
