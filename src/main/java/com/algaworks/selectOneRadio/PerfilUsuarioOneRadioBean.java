package com.algaworks.selectOneRadio;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class PerfilUsuarioOneRadioBean implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private String nome3;
	private String sexo;
	private String estadoCivil;
	
	public void atualizar(){
		System.out.println("Sexo: " + this.sexo);
		System.out.println("Estado Civil: " + this.estadoCivil);
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil atualizado!"));
	}

	public String getNome3() {
		return nome3;
	}

	public void setNome3(String nome3) {
		this.nome3 = nome3;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
