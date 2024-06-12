package camada.musica;

public class Ipod implements ReprodutorMusica {

    @Override
    public void selecionarMusica() {
        System.out.println("-----------------------");
        System.out.println("### Abrindo Ipod ###");
        System.out.println("-----------------------");
        System.out.println("Selecionando a música");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Reproduzindo a música");

    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando a música");
        System.out.println("-----------------------\n");
    }
}


