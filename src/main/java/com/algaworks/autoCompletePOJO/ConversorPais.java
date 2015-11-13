package com.algaworks.autoCompletePOJO;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("pais")
public class ConversorPais implements Converter{

	@Override
	public Object getAsObject(FacesContext context, UIComponent component,
			String value) {
		
		if(value != null){
			Integer codigo = Integer.valueOf(value);
			for(Pais pais: PerfilUsuarioPojoBean.PAISES){
				if(codigo.equals(pais.getCodigo())){
					return pais;
				}
			}
		}
		
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component,
			Object value) {
		if(value != null && !value.equals("")){
			Pais pais = (Pais) value;
			return String.valueOf(pais.getCodigo());
		}
		return null;
	}

}
