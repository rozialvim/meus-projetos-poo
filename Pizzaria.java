import java.util.Scanner;
public class Pizzaria {
    public static  void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int opcao;
        System.out.println("MENU DE PIZZAS\n");
        System.out.println("1- Frango\n");
        System.out.println("2- À moda\n");
        System.out.println("3- Portuguesa\n");
        System.out.println("Escolha o sabor\n");
        opcao = scanner.nextInt();
        calcularValorPizza(opcao);
        scanner.close();
    }
    public static void calcularValorPizza(int opcao){
        switch(opcao){
            case 1: System.out.print("\nValor da pizza de frango é de R$50,00");
            break;
            case 2: System.out.print("\nValor da pizza à moda é de R$60,00");
            break;
            case 3: System.out.print("\nValor da pizza portuguesa é de R$75,00");
            break;
            default: System.out.print("\n VOpcao incorreta");
            break;

        }
    }
    
}
