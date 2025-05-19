package meuiphone;
import iphone.internet.Safari;
import iphone.musica.Ipod;
import iphone.telefone.Celular;

public class Iphone implements Safari, Ipod, Celular {

    @Override
    public void pesquisar(){
        System.out.println("Pesquisando na web...");
    }

    @Override
    public void verHistorico(){
        System.out.println("Mostrando histórico na tela...");
    }

    @Override
    public void tocarMusica(){
        System.out.println("Tocando música...");
    }

    @Override
    public void pausarMusica(){
        System.out.println("Música pausada");
    }

    @Override
    public void pularMusica(){
        System.out.println("Pulando música...");
    }

    @Override
    public void voltarMusica(){
        System.out.println("Voltando música...");
    }

    @Override
    public void fazerChamada(){
        System.out.println("Chamando...");
    }

    @Override
    public void desligarChamada(){
        System.out.println("Chamada encerrada");
    }

    @Override
    public void botarModoEspera(){
        System.out.println("Chamada em modo espera");
    }

}
