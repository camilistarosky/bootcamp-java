package edu.sintaxe.tiposOperadores;

public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "Camili" + "Starosky";
        System.out.println(nomeCompleto);

        int numero = 5;
        System.out.println(- numero);

        numero++;
        System.out.println(numero);
        System.out.println(++numero); //atualiza e imprimi

        numero--;
        System.out.println(numero);
        System.out.println(--numero);

        boolean variavel = true;
        variavel = !variavel; //inverter o ipo
        System.out.println(!variavel);

        int a, b;
        a = 5;
        b = 6;

        if (a==b) {
            String resultadoIF = "true";
        } else {
            String resul = "true";
        }

        // mesma coisa
        String resultado = a==b ? "verdadeiro" : "falso";
        int resultadonum = a==b ? 1 : 0;

        // && == E
        // || == OU

    }
}
