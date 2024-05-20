public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 10;

        if(nota >= 7)
        System.out.println("Aprovado");
        
        else if(nota >=5 && nota < 7) //retorna true ou false
        System.out.println("Em Recuperacao");
        
        else
        System.out.println("Reprovado");
    }
}
