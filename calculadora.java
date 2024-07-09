impoprt java.util.Scanner;
public class calculadora{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
    int opcao = 0
    System.out.println("CAUCULADORA - MENU PRINCIPAL");
    System.out.println("1 - SOMAR");
    System.out.println("2- SUBTRAIR");
    System.out.println("3 - MULTIPLICAR");
    System.out.println("4 - DIVIDIR");
    System.out.println(" ESCOLHA A OPCAO:");
    opcao = Scanner.nextInt();
    switch (opcao) {
        case 1:
            somar();
            
            break;
        case 2:
            subtrair();
    
        default:
            break;
    }
    }
    public static void somar(){

    }
    public static void subtrair(){

    }
    public static void multiplicar(){

    }
    public static void dividir(){

    }
    public static void exibirResultado(String resultadoRecebido){

    }
}
