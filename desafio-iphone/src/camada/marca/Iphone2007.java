package camada.marca;

import camada.browser.Google;
import camada.browser.NavegadorDeInternet;
import camada.chamadas.AparelhoTelefonico;
import camada.chamadas.Telefone;
import camada.musica.Ipod;
import camada.musica.ReprodutorMusica;

public class Iphone2007 {
    public static void main(String[] args) {
        ReprodutorMusica ipod = new Ipod();
        ipod.selecionarMusica();
        ipod.tocarMusica();
        ipod.pausarMusica();

        AparelhoTelefonico chamada = new Telefone();
        chamada.realizarLigacao();
        chamada.atenderLigacao();
        chamada.iniciarCorreioVoz();

        NavegadorDeInternet google = new Google();
        google.exibirPagina();
        google.adicionarNovaAba();
        google.atualizarPagina();
    }

}
