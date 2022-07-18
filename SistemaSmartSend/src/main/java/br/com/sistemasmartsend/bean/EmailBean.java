package br.com.sistemasmartsend.bean;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.sistemasmartsend.dto.EmailLayout;
import br.com.sistemasmartsend.model.Email;
import br.com.sistemasmartsend.service.EmailService;

//referenciando a pagina
@Named
@RequestScoped

public class EmailBean implements Serializable {

	private static final long serialVersionUID = 453875558265458403L;
    private static final String DESTINATARIO = "ruan@gmail.com";
    private static final String ASSUNTO = "Mudança de senha";
    @Inject
	private EmailService ServiceE;

	public String enviarEmail() {
		ServiceE.Enviar(CriaEmail());
		return null;
	}
	
	
	private Email CriaEmail() {
		EmailLayout layout = new EmailLayout();
		return layout.CriaEmailAdmin(DESTINATARIO,ASSUNTO);
		
		
	}

}
