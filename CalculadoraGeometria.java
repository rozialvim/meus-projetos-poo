import java.util.Scanner;

importjava.util.Scanner;
public class CalculadoraGeometria {
    public static void main(String[]args){
        Scanner scanner = new scanner(System.in);
        int menu = 0; 

        while (menu== 0) {
            System.out.println("Selecione a opção correspondente:");
            System.out.println("\n1- Área do Círculo.");
            System.out.println("2- Área do Retângulo.");
            System.out.println("3- Área do Triângulo.");
            System.out.println("4- Sair.");
            System.out.println("\n->");
            menu = scanner.nextInt();
            switch (menu) {
                case 1: círculo();
                        break;
                case 2: retângulo();
                        break;
                case 3: triângulo();
                        break;
                
            
                default:
                    break;
            }


            
        }
    }
    
}
