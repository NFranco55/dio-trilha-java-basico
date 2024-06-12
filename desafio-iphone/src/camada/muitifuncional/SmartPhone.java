package camada.muitifuncional;

import camada.browser.NavegadorDeInternet;
import camada.chamadas.AparelhoTelefonico;
import camada.musica.ReprodutorMusica;

public class SmartPhone implements ReprodutorMusica, AparelhoTelefonico, NavegadorDeInternet {
    @Override
    public void selecionarMusica() {
        System.out.println("Reproduzindo música no Smartphone");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música no Smartphone");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando música no Smartphone");
    }

    @Override
    public void realizarLigacao() {
        System.out.println("Realizando chamada no Smartphone");
    }

    @Override
    public void atenderLigacao() {
        System.out.println("Atendendo chamada no Smartphone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no Smartphone");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina no navegador");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba no navegador");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página do navegador");
    }
}
