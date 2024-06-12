package camada.browser;

public class Google implements NavegadorDeInternet {

    @Override
    public void exibirPagina() {
        System.out.println("--------------------------------");
        System.out.println("### Abrindo Navegador Google ###");
        System.out.println("--------------------------------");
        System.out.println("Exibindo página no navegador");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página");
        System.out.println("--------------------------------");
    }
}



