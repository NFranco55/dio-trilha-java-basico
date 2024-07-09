package main.java.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //Atributo
    private List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for(Livro l : livrosList){
              if(l.getAutor().equalsIgnoreCase(autor)){
                  livrosPorAutor.add(l);
              }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloDeAno (int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloDeAno = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for(Livro l : livrosList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloDeAno.add(l);
                }
            }
        }
        return livrosPorIntervaloDeAno;
    }
    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livrosList.isEmpty()) {
            for(Livro l : livrosList) {
                if(l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro1", "Autor1", 2020);
        catalogoLivros.adicionarLivro("Livro1", "Autor2", 2021);
        catalogoLivros.adicionarLivro("Livro2", "Autor2", 2022);
        catalogoLivros.adicionarLivro("Livro3", "Autor3", 2023);
        catalogoLivros.adicionarLivro("Livro4", "Autor4", 1994);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor2"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloDeAno(2020, 2021));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro1"));


    }

}
