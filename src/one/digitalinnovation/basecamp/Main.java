package one.digitalinnovation.basecamp;

/*Classe de exemplo para o exercício de variáveis, tipos de dados e operadores aritméticos.*/

public class Main {

    public static void main(String[] args) {

        int i;
        // int i; não pode ter nomes iguais
        int I;
        // int 1a; não pode começar com números
        int _1a; //não é boa prática
        int $aq; //não é boa prática

        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        final int j = 10; // final = constante
        // j = 15; valor não pode mudar
        int asrn24678md;
        // int asrn246 78md; não é permitido espaços
        // int asrn2$4678_md = 10; não é boa prática
        // int asrn246%78_md = 10; não é permitido caracteres especiais

        // asrn24678md = 10;
        // asrn2$4678_md = 10;

        int quantidadeProduto = 50;
        int QuantidadeProduto; // não é boa prática iniciar com letra maiuscula
        final int NUMERO_TENTATIVAS = 5; // final não se usa camel case
        final int numeroTentativas = 5; // não segue boa prática
        int QUANTIDADE_OPCOES = 25; //não segue boa prática, não declarar final
        int qtdProd; // não segue boa prática, nome não é expressivo

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        //System.out.println(asrn24678md);
        // System.out.println(asrn2$4678_md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);

        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
       // short s2 = 40000; ultrapassando limite que o short suporta

       // int i1 = -100000000000; ultrapassando limite negativamente que o int suporta
        int i2 = 28500;

        long l1 = 100000000000000L; // indentificar long com 'L' ao final
        long l2 = 200400500055000L;

        //  float f1 = 4.5;
        float f2 = 10.68f; // indentificar float com 'F' ao final

        double d1 = 85.69;
        double d2 = 99.04d; // indentificar double com 'D' ao final

        char c1 = 'W';
        //char c2 = 'TW' Só aceita 1 caracter em char;
        char c3 = '\u0057'; //valor default unicode de 'W';

        String st1 = "Fulano";
        String st2 = "Cicrano";
        String st3 = "ag dgb se se set KNBJBJBB &*&% 7589539";

        // String dt1 = "09/021981";

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(b1);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(bo1);
        System.out.println(bo2);




    }
}
