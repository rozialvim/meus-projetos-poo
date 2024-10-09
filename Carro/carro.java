package Carro;

public class carro {
    String marca, modelo,status;
    int ano;   
    public void exibirCarrosVendidos(){
       System.out.println("Marca:" + marca);
       System.out.println("Modelo:" + modelo);
       System.out.println("Ano:" + ano);
       System.out.println("Status:" + status);
       System.out.println("\n======================\n");
   }
   public void exibirCarrosDisponiveis(){
      System.out.println("Marca:" + marca);
      System.out.println("Modelo:" + modelo);
      System.out.println("Ano:" + ano);
      System.out.println("Status:" + status);
      System.out.println("\n======================\n");
   }   
}
