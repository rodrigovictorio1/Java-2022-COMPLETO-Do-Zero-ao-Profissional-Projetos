package Aula_222_Exceção_Personalizadas_2.Excecao.Personalizadas_A;

@SuppressWarnings("serial")
public class StringVaziaException extends RuntimeException {
	
	private String nomeDoAtributo;
	
	public StringVaziaException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	
	public String getMessage() {
		return String.format("O atributo '%s' está vazio.", nomeDoAtributo);
	}
}