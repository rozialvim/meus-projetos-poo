package Aula14_13112024;

public class Produto {
String nome;
double preco;
int quantidade;

Produto(String nome, double preco, int quantidade){
this.nome = nome;
this.preco = preco;
this.quantidade = quantidade;
}
public void exibirProduto(){
    System.out.println("Nome:" + nome);
    System.out.println("Preço:" + preco);
    System.out.println("Quantidade:" + quantidade);
}    
}
