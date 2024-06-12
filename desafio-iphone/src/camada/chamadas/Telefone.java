package camada.chamadas;

public class Telefone implements AparelhoTelefonico {



    @Override
    public void realizarLigacao() {
        System.out.println("------------------------");
        System.out.println("### Abrindo Telefone ###");
        System.out.println("------------------------");
        System.out.println("Realizando a ligação");
    }

    @Override
    public void atenderLigacao() {
        System.out.println("Atendendo a ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
        System.out.println("------------------------\n");
    }
}



