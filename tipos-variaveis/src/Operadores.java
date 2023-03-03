public class Operadores {
    public static void main(String[] args) {

        /*
         * Atribuição: Representado pelo símbolo de igualdade =.
         * exemplos:
         * String nome = "GLEYSON";
         * int idade = 22;
         * double peso = 68.5;
         * char sexo = 'M';
         * boolean doadorOrgao = false;
         * Date dataNascimento = new Date();
         */
        String nome = "Johnny";
        System.out.print(nome);

        /*
         * Aritméticos
         * * Os operadores aritméticos são: + (adição), - (subtração), * (multiplicação)
         * e / (divisão).
         * double soma = 10.5 + 15.7;
         * int subtração = 113 - 25;
         * int multiplicacao = 20 * 7;
         * int divisao = 15 / 3;
         * int modulo = 18 % 3;
         * double resultado = (10 * 7) + (20/4);
         */

        double multiplicacao = 10.5 * 5;
        System.out.print(multiplicacao);
        // ou
        String nomeCompleto = "Johnny" + "James";
        System.out.print(nomeCompleto);

        /*
         * Ternário
         * O operador ternário é representado pelos símbolos ?: utilizados na seguinte
         * estrutura de sintaxe:
         * <Expressão Condicional>`` ?``<Caso condição seja true>``: ``<Caso condição
         * seja false>
         * 
         * exemplo:
         * int a, b;
         * a = 5;
         * b = 6;
         * EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
         * if(a==b)
         * resultado = "verdadeiro";
         * else
         * resultado = "falso";
         */
        int a = 5;
        int b = 6;
        String resultado = (a==b) ? "verdadeiro" : "falso";
        System.out.println(resultado);


        // mais infomações em
        // https://felipe-silva-aguiar.gitbook.io/dio-java/gitbook/sintaxe/operadores

    }
}
