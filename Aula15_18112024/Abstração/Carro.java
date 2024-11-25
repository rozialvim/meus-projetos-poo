package Abstração;

public class Carro{
    //atributos ou características
    String marca, modelo;
    int ano, velocidade;
    //criar o construtor
    Carro(String marca,String modelo, int ano, int velocidade){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = velocidade;
    }
    //criar método aumentarVelocidade.=. oque o objeto faz
    public void aumentarVelocidade(){
        System.out.println("==================================");
        System.out.println( "O " + modelo + " da marca "+ marca +  "está a "+ velocidade + " km/h");
        velocidade = velocidade + 20;
        System.out.println(" Você acabou de aumentar a velocidade");
        System.out.println("A velocidade atual agora é  " + velocidade + " km/h");

    }
        
}
