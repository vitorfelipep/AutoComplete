package com.algaworks.booleanCheckBox;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class PerfilUsuarioBolleanCheckBoxMb implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private boolean aceito;
	
	public void atualizar(){
		
		System.out.println("Aceite: " + this.aceito);
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil atualizado!"));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isAceito() {
		return aceito;
	}

	public void setAceito(boolean aceito) {
		this.aceito = aceito;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
