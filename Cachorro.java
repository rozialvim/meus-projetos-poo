import java.util.Scanner;

public class Cachorro {
  Scanner scanner = new Scanner(System.in);
  public static void main(String[]args){
    String nome, raça, cor;
    int idade,opcao;
    double peso;
    System.out.println("CADASTRE SEU CACHORRO: ");
    System.out.println("Nome: ");
    nome = scanner.nextLine();
    System.out.print("Raça: ");
    raça = scanner.nextLine();
    System.out.print("Idade: ");
    idade = scanner.nextInt();
    System.out.print("Peso: ");
    peso = scanner.nextDouble();
    System.out.print"Cor: ");
    cor = scanner.nextline();
    System.out.println("\n CACHORRO SALVO COM SUCESSO \n ");

    System.out.println(" MENU DE AÇÕES DO CACHORRO ");
    System.out.println(" O QUE VOCÊ QUE O CACHORRO FAÇA?: ");
    System.out.println("1- Latir");
    System.out.println("2- Comer");
    System.out.println("3- Buscar Objeto");
    System.out.println("4- Brincar");
    System.out.println("5- Dormir");
    System.out.println("0- Sair ");
    System.out.println("opção Selecionada" );
    opcao = scanner.nextInt();

    


  }

}  
    
 
    

