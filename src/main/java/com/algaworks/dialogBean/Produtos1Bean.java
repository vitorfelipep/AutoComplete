package com.algaworks.dialogBean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped	
public class Produtos1Bean implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private List<String> produtos =  new ArrayList<>();
	private String produtoSelecionado;
	
	public Produtos1Bean() {
		produtos.add("Arroz");
		produtos.add("Feijão");
		produtos.add("Queijo");
		produtos.add("Chocolate");
		produtos.add("Notebook");
		
	}
	
	public void excluirProduto(){
		System.out.println(produtoSelecionado);
		produtos.remove(produtoSelecionado);
	}
	
	public List<String> getProdutos() {
		return produtos;
	}

	public String getProdutoSelecionado() {
		return produtoSelecionado;
	}

	public void setProdutoSelecionado(String produtoSelecionado) {
		this.produtoSelecionado = produtoSelecionado;
	}
	
}
