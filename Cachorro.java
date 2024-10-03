import java.util.Scanner;

public class Cachorro {
static Scanner scanner = new Scanner(System.in);
public static void main(String[]args){
     String nome, raca, cor;
     int idade,opcao = 10;
     float peso;
     System.out.println("CADASTRE SEU CACHORRO: ");
    System.out.println("Nome: ");
    nome = scanner.nextLine();
    System.out.print("Raça: ");
    raca = scanner.nextLine();
    System.out.print("Idade: ");
    idade = scanner.nextInt();
    System.out.print("Peso: ");
    peso = scanner.nextFloat();
    System.out.print("Cor: ");
    cor = scanner.next();
     System.out.println("\n\n CACHORRO SALVO COM SUCESSO \n\n ");
     while(opcao!= 0){   
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
        switch (opcao) {
      case 1: latir(nome);
           break;
      case 2: comer(nome);
           break;
      case 3: buscarObjeto(nome);
           break;
      case 4:brincar(nome);
           break;
      case 5:dormir(nome);
           break;
      case 6: System.out.println("\n\n SAINDO DO SISTEMA EM 3...2...1...");
           break;
      default: System.out.println("Opção digitada está incorreta");
           break;
    }
}
}

  public static void latir(String nome){
    System.out.println("\n\n" + nome + " está latindo!!\n\n");
  }
  public static void comer(String nome){
      String comida;
      System.out.println(">>> O que o cachorro irá comer?.RESPOSTA:");
      comida = scanner.next();
      System.out.println(nome + " está comendo" + comida);
  } 
  public static void buscarObjeto(String nome){
      String objeto;
      System.out.println(">>>O que o cachorro irá buscar? RESPOSTA:");
      objeto = scanner.next();
      System.out.println(nome + " está buscando o (a)" + objeto);
  }
  public static void brincar(String nome){
    System.out.println(nome + " está brincando !!!");
  }
  public static void dormir(String nome){
    System.out.println(nome + " está descansando!!!");
  }
}      


    
 
    

