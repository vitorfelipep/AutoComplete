package com.algaworks.messages;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class MessagesBean {
	
	public void adicionarMenssagemErro(){
		FacesContext context =  FacesContext.getCurrentInstance();
		
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_WARN,
				"Resumo da mensagem de erro", "Messagem de erro completa");
		context.addMessage("destinoErro", msg);
	}
	
	public void adicionarMenssagemAviso(){
		FacesContext context =  FacesContext.getCurrentInstance();
		
		FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO,
				"Resumo da mensagem de informação", "Messagem de informação completa");
		context.addMessage("destinoAviso", msg);
	}
	
}
