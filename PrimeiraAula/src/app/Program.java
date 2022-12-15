package app;

public class Program {

    public static void main(String[] args) {

           //declaração de varieveis
            String nome;
            nome ="Esdas";
            nome = "jese";
            nome = "brasil";
            System.out.println("Ola, " + nome);


            // Tipos de variavesi e operações numericas
            int a;
            int b = 2;
            a = 3;
            int soma = a+b;
            int subtracao = a-b;
            int multiplicacao = a*b;
            float divisao = (float) a/b;

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);

        //operações boolean e tabela verdade

        boolean resultado = false;
        // o sout serve para autoComplet do print
        System.out.println(resultado);
        System.out.println();


        boolean fimDeSemana = false;
        boolean fazendoSol = true;;
        boolean vamosAPraia = fimDeSemana && fazendoSol;
        System.out.println(vamosAPraia);


        //tabela verdade
        //Operador && (AND)

        System.out.println(vamosAPraia);
        String mensagem = fimDeSemana? "è fim de semana" : "não é fim de semana";
        System.out.println(mensagem);


    }
}
