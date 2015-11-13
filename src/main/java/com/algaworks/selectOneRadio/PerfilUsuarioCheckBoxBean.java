package com.algaworks.selectOneRadio;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class PerfilUsuarioCheckBoxBean implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private String nome3;
	private List<String> interesses;
	
	public void atualizar(){
		for(String interesse :interesses){
			System.out.println("Interesses: " + interesse);
		}
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil atualizado!"));
	}

	public String getNome3() {
		return nome3;
	}

	public void setNome3(String nome3) {
		this.nome3 = nome3;
	}

	

	public List<String> getInteresses() {
		return interesses;
	}

	public void setInteresses(List<String> interesses) {
		this.interesses = interesses;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
