package Herança;

public class Principal {
    public static void main(String[]args){

        //criar um objeto com nome Thoor,tipo: Thoor, raça: perdigueiro, cor: marrom, idade: 7
        Cachorro Thoor =  new Cachorro ("Thoor", "perdigueiro", "marrom", 7 );

        //acione o método comer e latir com  base no objeto criado
        Thoor.comer();
        Thoor.latir();
    }
    
}
