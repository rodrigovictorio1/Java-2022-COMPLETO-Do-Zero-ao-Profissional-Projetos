package Aula_222_Exceção_Personalizadas_2.Excecao.Personalizadas_B;

@SuppressWarnings("serial")
public class NumeroForaIntervaldoException extends Exception{
    private String nomeDoAtributo;

    public NumeroForaIntervaldoException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMassage() {
        return String.format("O atributo '%s' está fora do intervalo.", nomeDoAtributo);
    }
}
