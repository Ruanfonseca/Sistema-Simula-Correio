package br.com.sistemasmartsend.dto;

import br.com.sistemasmartsend.model.Email;

public class EmailLayout {
	private static final Object QUEBRA_DE_LINHA2 = "<br></br>";
    private final String QUEBRA_DE_LINHA = "<br></br>";
	
    public Email CriaEmailAdmin(String destinatario, String assunto) {
		
		StringBuilder texto = new StringBuilder();
		
		texto.append("A/C Administrador");
		texto.append(QUEBRA_DE_LINHA);

		texto.append("Estou solicitando a alteração da senha do sistema");
		texto.append(QUEBRA_DE_LINHA);
        GerarAssinatura(texto);
		GerarRodape(texto);

		return new Email(destinatario, assunto, texto.toString());
	}

	private StringBuilder GerarAssinatura(StringBuilder texto) {
		return texto.append(QUEBRA_DE_LINHA2)
			   .append("Operador de caixa ")  
			   .append(QUEBRA_DE_LINHA2)  
			   .append("Att.: ");
		
	}

	private String GerarRodape(StringBuilder texto) {
           return texto.append("Não responda a esse email").toString();
	}

}
