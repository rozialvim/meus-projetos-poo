package Herança;
//classe modelo e classe pai
public class Animal {
    //características que todos os animais compartilham
    //Tipo, raça, cor e idade
    //criem os atributos
    String tipo;
    String raça;
    String cor;
    int idade;

    //os animais compartilham o método comer
    //crie o método comer.->. público,sem retorno e sem parâmetro
    public void comer(){
        
        System.out.println("================================");
        System.out.println("O " + tipo +  " está se alimentando. ");
        
    
    }
        
}
    

