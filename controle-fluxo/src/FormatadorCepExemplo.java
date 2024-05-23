public class FormatadorCepExemplo {
    public static void main(String[] args) {
       try {
           String cepFormatado = formatarCep("66080650");
           System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
           System.out.println("O cep nao esta inserido corretamente, verifique");

        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();

        //simulando um cep formatado
        return "66.080-650";
    }
}
