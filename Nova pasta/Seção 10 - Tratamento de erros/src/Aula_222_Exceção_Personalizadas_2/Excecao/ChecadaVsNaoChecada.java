package Aula_222_Exceção_Personalizadas_2.Excecao;

public class ChecadaVsNaoChecada {
    public static void main(String[] args) {

        try {
            geraErro1();
        } catch (Exception e) {
            e.printStackTrace();
        }

        geraErro2();

        System.out.println("Fim");
    }

    // Exceção NÂO checada ou NÂO verificada
    static void geraErro1() {
        throw new RuntimeException("Ocorreu um erro bem legal #01");
    }

    // Exceção checada ou verificada
    static void geraErro2() /*throws Exception*/ {
        try {
            // throw = lança
            throw new Exception("Ocorreu um erro bem legal #02");
        } catch (Exception e) {
            System.out.println("que legal!");
        }
    }
}
