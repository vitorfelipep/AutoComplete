package com.algaworks.tabView;

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class UsuarioTabViewMB implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	public Date getDataAtual() {
		return new Date();
	}
}
