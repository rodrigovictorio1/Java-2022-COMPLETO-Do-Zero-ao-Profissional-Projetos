package Aula_221_Exceção_Personalizadas_1.Excecao.Personalizadas;

import Aula_221_Exceção_Personalizadas_1.Excecao.Aluno;
// import Aula_221_Exceção_Personalizadas_1.Excecao.Personalizadas.StringVaziaException;
// import Aula_221_Exceção_Personalizadas_1.Excecao.Personalizadas.NumeroForaIntervaldoException;

public class TesteValidacoes {
    public static void main(String[] args) {
        try {
            Aluno aluno = new Aluno("Ana", 7);
            Validar.aluno(aluno);
        } catch (StringVaziaException e) {
            System.out.println(e.getMessage());
        } catch (NumeroForaIntervaldoException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Fim");
    }   
}
