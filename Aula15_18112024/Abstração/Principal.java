package Abstração;

public class Principal {
        //criar carros.=> instanciar objetos
       //obs:todo carro começa com a velocidade 0
    public static void main(String[]args){
       Carro onix = new Carro ("Chevrolet", "onix",2020,0);
       Carro hb20 = new Carro ("Hyndai", "hb20",2022,0);
       Carro tiggo = new Carro ("Caoa Cherry", "tiggo",2024,0);
       Carro haval = new Carro ("GWM", "haval",2023,0);
       // aumente a velocidade de todos os carros
       onix.aumentarVelocidade();
       hb20.aumentarVelocidade();
       tiggo.aumentarVelocidade();
       haval.aumentarVelocidade();
       //como acessar os atributos e métodos interno do objeto?
       //R: Através do ponto após o nome do objeto.Ex: onix.<acessa o atributo ou método>

    }

} 