import java.util.Scanner;
public class Cidade {
    public static void main(String[]args){
        Temperatura temperatura = new Temperatura();
        int opcaoCidade, resultadoTemp;
        String nomeCidade;
        Scanner scanner=new Scanner(System.in);
       
        menu(opcaoCidade) {
            System.out.println("Selecione a cidade que quer saber a temperatura: ");
            System.out.println(" 1- Bangkok:");
            System.out.println(" 2- Dubai:");
            System.out.println(" 3- São Paulo:");
            System.out.println(" 4- Nova York:");
            System.out.println(" 5- Sydney:");
            System.out.println(" 6- Londres:");
            System.out.println(" 7- Moscou:");
            System.out.println(" 8- Cidade do México:");
            System.out.println(" 9- Toquio:");
            System.out.println(" 10- Cairo:");

            System.out.println("Digite a opcao: ");
            opcaoCidade = scanner.nextInt();
            scanner.close();
        }
            switch(opcao){
                case 1: nomeCidade = "Bangkok";
                    break;
                case 2: nomeCidade = "Dubai";
                    break;
                case 3: nomeCidade = "São Paulo";
                    break;
                case 4: nomeCidade = "New York";    
                    break;
                case 5: nomeCidade = "Sydney";
                    break;
                case 6: nomeCidade = "Londres";
                    break;
                case 7: nomeCidade = "Moscou";
                    break;
                case 8: nomeCidade = "Cidade do México";
                    break;
                case 9: nomeCidade = "Tóquio";
                    break;
                case 3: nomeCidade = "Cairo";
                    break;
                default:
                    break;
            }
            resultadoTemp = temperatura.verificarTemp(opcaoCidade);
            System.out.println("A temperatura é + resultado");
    }
}
