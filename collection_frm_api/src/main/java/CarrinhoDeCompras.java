package main.java;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome, double preco, int quantidade) {
        List<Item> itemsParaRemover = new ArrayList<>();
        for (Item i : itemList) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itemsParaRemover.add(i);
            }
        }
        itemList.removeAll(itemsParaRemover);
    }

    //Obter numero total de itens
    public int numeroTotalItens(){
        return itemList.size();
    }

    public int calcularValorTotal() {
        double valorTotal;
        valorTotal = itemList.stream()
                .mapToDouble(item -> item.getQuantidade() * item.getPreco())
                .sum();
        return (int) valorTotal;
    }

    public void exibirItens(){
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras compras = new CarrinhoDeCompras();
        //Teste unitário para saber se há itens na lista
        System.out.println("O número total de itens na lista é: " + compras.numeroTotalItens());

        //Adicionando
        compras.adicionarItem("Produto1",1.25,2);
        compras.adicionarItem("Produto2",3.44,1);
        compras.adicionarItem("Produto3",5.62,3);
        System.out.println("O número total de itens na lista é: " + compras.numeroTotalItens());

        //Removendo itens
        compras.removerItem("Produto2", 3.44, 1);
        System.out.println("O número total de itens na lista é: " + compras.numeroTotalItens());

        //Calculando valor total
        compras.calcularValorTotal();
        System.out.println("Valor total da compra R$: " + compras.calcularValorTotal());

        //Exibir lista de itens
        compras.exibirItens();

    }

 }
