package edu.sintaxe.anatomiaClasse;
public class MinhaClasse {

    public static void main (String [] args) {
        String primeiroNome = "Camili";
        String segundoNome = "Starosky";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    private static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
