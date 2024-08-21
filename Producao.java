public class Producao {
     String setor = "Produção";
     public void verSetor(){
        System.out.println("Você está no setor de produção: ");
     }
     private static void verStatus(){
        System.out.println("Este método é privado");
     }
     public static void main(String[] args) {
      verStatus();
     }
}
