package Aula_222_Exceção_Personalizadas_2.Excecao.Personalizadas_B;

import Aula_222_Exceção_Personalizadas_2.Excecao.Aluno;
// import Aula_221_Exceção_Personalizadas_1.Excecao.Personalizadas.StringVaziaException;
// import Aula_221_Exceção_Personalizadas_1.Excecao.Personalizadas.NumeroForaIntervaldoException;

public class TesteValidacoes {
    public static void main(String[] args) {
        try {
            Aluno aluno = new Aluno("Ana", 7);
            Validar.aluno(aluno);
            Validar.aluno(null);
        } catch (StringVaziaException e) {
            System.out.println(e.getMessage());
        } catch (NumeroForaIntervaldoException e) {
            System.out.println(e.getMessage());
        }
        // Validar.aluno(null);
        System.out.println("Fim");
    }   
}
 