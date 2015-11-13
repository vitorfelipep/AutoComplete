package com.algaworks.selectOneMenu;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class PerfilUsuarioSMBean implements Serializable{
	

	private static final long serialVersionUID = 1L;
	private String nome;
	private String profissao;
	
	public PerfilUsuarioSMBean() {
		// TODO Auto-generated constructor stub
	}
	
	public void atualizar(){
		
		System.out.println("Profissão: " + this.profissao);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil atualizado!"));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	
}
