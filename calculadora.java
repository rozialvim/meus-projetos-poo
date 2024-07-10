

import java.util.Scanner;
public class calculadora{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
    int opcao=0;
    
    System.out.println("CAUCULADORA - MENU PRINCIPAL");
    System.out.println("1 - SOMAR");
    System.out.println("2- SUBTRAIR");
    System.out.println("3 - MULTIPLICAR");
    System.out.println("4 - DIVIDIR");
    System.out.println(" ESCOLHA A OPCAO:");
    opcao = scanner.nextInt();
    switch (opcao) {
        case 1:
            somar();
            break;
        case 2:
            subtrair();
            break;
        case 3:
            multiplicar();
            break;
        case 4:
            dividir();
            break;
        default:System.out.println("A opção digitada está incorreta");
        }
        scanner.close();
    }
    public static void somar(){
    float numero1, numero2, resultado;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o primeiro número");
    numero1 = scanner.nextFloat();
    System.out.print("Digite o segundo número");
    numero2 = scanner.nextFloat();
    resultado = numero1 + numero2;
    exibirResultado(resultado);
    scanner.close();

    }
    public static void subtrair(){
        float numero1, numero2, resultado;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número");
        numero1 = scanner.nextFloat();
        System.out.print("Digite o segundo número");
        numero2 = scanner.nextFloat();
        resultado = numero1 - numero2;
        exibirResultado(resultado);
        scanner.close();
    }
    public static void multiplicar(){
        float numero1, numero2, resultado;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número");
        numero1 = scanner.nextFloat();
        System.out.print("Digite o segundo número");
        numero2 = scanner.nextFloat();
        resultado = numero1 * numero2;
        exibirResultado(resultado);
        scanner.close();
    }
    public static void dividir(){
        float numero1, numero2, resultado;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número");
        numero1 = scanner.nextFloat();
        System.out.print("Digite o segundo número");
        numero2 = scanner.nextFloat();
        resultado = numero1 / numero2;
        exibirResultado(resultado);
        scanner.close();
    }
    public static void exibirResultado(float resultadoRecebido){
        System.out.println("o resultado é "+ resultadoRecebido);

    }
}
