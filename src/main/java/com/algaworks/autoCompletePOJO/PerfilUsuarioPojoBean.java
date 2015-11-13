package com.algaworks.autoCompletePOJO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class PerfilUsuarioPojoBean implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	public static final List<Pais> PAISES = new ArrayList<>();
	
	static{
		PAISES.add(new Pais(1,"Alemanha"));
		PAISES.add(new Pais(2,"Argélia"));
		PAISES.add(new Pais(3,"Argentina"));
		PAISES.add(new Pais(4,"Bélgica"));
		PAISES.add(new Pais(5,"Bolivia"));
		PAISES.add(new Pais(6,"Brasil"));
		PAISES.add(new Pais(7,"Espanha"));
		PAISES.add(new Pais(8,"Estados Unidos"));
		PAISES.add(new Pais(9,"Canadá"));
		PAISES.add(new Pais(10,"Japão"));
		PAISES.add(new Pais(11,"China"));
	}
	
	
	private String nome;
	private Pais pais;
	
	public List<Pais> sugerirPaises(String consulta){
		List<Pais> paisesSugeridos = new ArrayList<>();
		
		for(Pais pais : PAISES){
			if(pais.getNome().toLowerCase().startsWith(consulta.toLowerCase())){
				paisesSugeridos.add(pais);
			}
		}
		
		return paisesSugeridos;
	}
	
	
	public void atualizar(){
		
		if(pais == null){
			adicionarMensagem("Perfil atualizado sem pais!");
		}else{
			adicionarMensagem("Perfil atualizado com pais "+ this.pais.getNome()
					+ " (" + this.pais.getCodigo() + "). ");
		}
	}
	
	
	public void adicionarMensagem(String msg){
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(msg));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static List<Pais> getPaises() {
		return PAISES;
	}
}
