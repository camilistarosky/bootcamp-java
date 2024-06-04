package edu.sintaxe.tiposVariaveis;

public class TiposVariveis {
    public static void main(String[] args) {
        // <tipo> <nomeVariavel> <atribuiçãoOpicional>
        // tipo float tem que acabar com 'f' no final
        // tipo long tem que acabar com 'l' no final para armazenar

        // Java é altamente tipado

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // -> cast

        // variaveis e constantes
        // variaveis são armazenadas e podem ser mudadas
        // constantes não podem ser alteradas
        // tem que ser final para não alterar e tem qeu estar em caixa alta

        final double VALORPI = 3.14;
        System.out.println(VALORPI);

        String meuNome = "Camili Naara Starosky";
        System.out.println(meuNome);
    }
}
