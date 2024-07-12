import java.util.Scanner;
public class conversorMoeda {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        float valor;
        System.out.println("Digite  um valor em reais.");
        valor = scanner.nextFloat();
        scanner.close();
        conversorDolar(valor);
        conversorEuro(valor);
    }
    public static void conversorDolar(float valor){
        float resultado = valor/5;
        System.out.printf("R$ " + valor + " em dolares é US$ %.2f%n", resultado);
    }
    public static void conversorEuro(float valor){
        float resultado = valor/6;
        System.out.printf("R$ " + valor + " em euros é €%.2f%n", resultado);
    }
}