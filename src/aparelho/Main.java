package aparelho;

import meuiphone.Iphone;

public class Main {
    public static void main (String [] args){
        Iphone yan = new Iphone();

        yan.pesquisar();
        yan.verHistorico();

        yan.tocarMusica();
        yan.pausarMusica();

    }
}
