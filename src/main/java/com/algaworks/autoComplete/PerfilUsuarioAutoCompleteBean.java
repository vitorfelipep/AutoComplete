package com.algaworks.autoComplete;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class PerfilUsuarioAutoCompleteBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private List<String> paises = new ArrayList<>();
	
	private String nomePais;
	private String pais;
	
	public PerfilUsuarioAutoCompleteBean() {
		
		paises.add("Alemanha");
		paises.add("Argélia");
		paises.add("Argentina");
		paises.add("Bélgica");
		paises.add("Bolivia");
		paises.add("Brasil");
		paises.add("Bulgaria");
		paises.add("Espanha");
		paises.add("Estados Unidos");
		
	}
	
	public void atualizarPais(){
		System.out.println("Pais "+ this.pais);
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Perfil Atualizado!!",null));
	}
	
	public List<String> sugerirPaises(String consulta){
		List<String> paisesSugeridos = new ArrayList<String>();
			
			for(String pais :this.paises){
				if(pais.toLowerCase().startsWith(consulta.toLowerCase())){
					paisesSugeridos.add(pais);
				}
			}
		
		return paisesSugeridos;
	}

	public String getNomePais() {
		return nomePais;
	}

	public void setNomePais(String nomePais) {
		this.nomePais = nomePais;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
