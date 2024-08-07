import java.util.Scanner;
public class Carro { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String  marca, modelo, cor;
        int velocAtual = 20;
        int opcao = 1;
        System.out.println("Digite a marca do veículo: ");
        marca = scanner.next();

        System.out.println("Digite o modelo do veículo: ");
        modelo = scanner.next();

        System.out.println("Digite a cor do veículo: ");
        cor = scanner.next();

        while (opcao != 3){
            System.out.println("Automóvel: 001");
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo); 
            System.out.println("Cor:" + cor);
            System.out.println("Velocidade Atual: " + velocAtual + " km/h"); 

            System.out.println("\n O que desewja fazer?");
            System.out.println("1 - Acelerar");
            System.out.println("2 - Frear");
            System.out.println("3 - Sair");
            System.out.println("Dgite uma opção");
            opcao = scanner.nextInt();
            
            switch (opcao){

                case 1: velocAtual = acelerar(velocAtual);
                        break;

                case 2: velocAtual = frear(velocAtual);
                        break;
        
                case 3: sair();
                        break;

                default: System.out.println("opção digitada está incorreta");
        

            } 
        }   
        scanner.close();
    
    public static int acelerar (int velocAtual){
        velocAtual = velocAtual + 10;
        return velocAtual;
    }

    public static int frear (int velocAtual){
        if(velocAtual == 0){
            velocAtual  = 0;
            return velocAtual;
        }else{
           velocAtual = velocAtual - 5;
           return velocAtual;
        }
    }

    public static void sair (int velocAtual){
        System.out.println("O programa será encerrado");
    }

}


        
  


    

