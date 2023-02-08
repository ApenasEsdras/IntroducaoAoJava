//Esdras  Soares de Oliveira
// 11-05-2022
// Nome do programa

//nome da classe

public class Progjava {

    public static void main(String entrada[]) {
        // declaração de variaveis
        int NumInt;
        double NumReal, soma;
        char Caracter;

        // entrada de dados
        NumInt = Integer.parseInt(entrada[0]);
        NumReal = Double.parseDouble(entrada[1]);
        Caracter = (entrada[2].charAt(0));
        // processamento
        soma = (double) NumInt + NumReal;
        // saida de resultados
        System.out.println((double) NumInt + " + " + NumReal + " = " + soma + " sinal " + Caracter);

        System.exit(0);

    }

}
