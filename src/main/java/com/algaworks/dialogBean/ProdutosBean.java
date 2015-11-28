package com.algaworks.dialogBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ProdutosBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private List<String> produtos;
	private String nomeProduto;
	
	public ProdutosBean() {
		this.produtos = new ArrayList<String>();
	}
	
	public void incluirProduto(){
		System.out.println(nomeProduto);
		produtos.add(nomeProduto);
		System.out.println(produtos);
		nomeProduto = null;
	}

	public List<String> getProdutos() {
		return produtos;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

}
