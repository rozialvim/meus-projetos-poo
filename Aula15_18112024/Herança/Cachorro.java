package Herança;
//classe filha e também a classe que dará origem aos objetos
public class Cachorro extends Animal{
    //Esta classe constroi objetos
    Cachorro (String tipo, String raça, String cor, int idade){
        this. tipo = tipo;
        this. raca = raca;
        this. cor = cor;
        this .idade = idade;
    }
 
    //apenas o método latir
    public void latir(){
        System.out.println("================================");
        System.out.println("O " + tipo + " está latindo. ")


    }
}
