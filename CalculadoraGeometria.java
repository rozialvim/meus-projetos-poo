import java.util.Scanner;


public class CalculadoraGeometria {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
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
                case 1: circulo();
                        break;
                case 2: retangulo();
                        break;
                case 3: triangulo();
                        break;
                case 4: menu++;
                        break;
            
                default:
                System.out.println("Digite uma opção correta...\n");
                        break;
            }
            scanner.close();

            
        }
    }
    public static void circulo(){
        System.out.print("Digite o valor do raio: ");
        Scanner scanner = new Scanner(System.in);
        double raio = scanner.nextDouble();
        scanner.close();
        double resultadoCirculo = Math.PI*(raio*raio);
        System.out.println(resultadoCirculo);
    }
    public static void retangulo(){
        System.out.print("Digite a altura: ");
        Scanner scanner = new Scanner(System.in);
        double altura = scanner.nextDouble();
        System.out.print("Digite a largura: ");
        double largura = scanner.nextDouble();
        scanner.close();
        double resultadoRetangulo = altura*largura;
        System.out.println(resultadoRetangulo);
    }
    public static void triangulo(){
        System.out.print("Digite o tamanho da base do triangulo; ");
        Scanner scanner = new Scanner(System.in);
        double base = scanner.nextDouble();
        System.out.println("Digite a altura: ");
        double altura = scanner.nextDouble();
        double resultadoTriangulo =(base*altura)/2;
        System.out.println(resultadoTriangulo);
        scanner.close();                                
    }

        
}
