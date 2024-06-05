package edu.sintaxe.metodos;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void aumnetarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++; //aumenta +1
        System.out.println("Aumentando o volume para: "+volume);
    }

    public void diminuirVolume(){
        volume--; // diminui -1
        System.out.println("Diminuindo o volume para: "+volume);
    }
}
