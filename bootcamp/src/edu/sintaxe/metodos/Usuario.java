package edu.sintaxe.metodos;

public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " +smartTv.volume);

        System.out.println("TV ligada: "+smartTv.ligada);
        System.out.println("Canal Atual: "+smartTv.canal);

        smartTv.mudarCanal(15);
        System.out.println("Canal Atual: "+smartTv.canal);


        smartTv.ligar();
        System.out.println("Novo status -> TV ligada: "+smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> TV ligada: "+smartTv.ligada);    }
}
