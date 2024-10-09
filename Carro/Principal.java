package Carro;

public class Principal {
    public static void main (String[]args){
        carro carro1 = new carro();
        carro1.marca = "Ford";
        carro1.modelo = "Mustang";
        carro1.ano = 2020;
        carro1.status = "Vendido";

        carro carro2 = new carro();
        carro2.marca = "Chevrolet";
        carro2.modelo = "Camaro";
        carro2.ano = 2021;
        carro2.status = "Vendido";
    
        carro carro3 = new carro();
        carro3.marca = "Pegeout";
        carro3.modelo = "2008";
        carro3.ano = 2020;
        carro3.status = "disponivel";
    
        carro carro4 = new carro();
        carro4.marca = "Renault";
        carro4.modelo = "Duster";
        carro4.ano = 2017;
        carro4.status = "Disponivel";
    
    
        System.out.println("Carros Vendidos:");
        carro1.exibirCarrosVendidos();
        carro2.exibirCarrosVendidos();

        // Exibição dos carros disponíveis
        System.out.println("\nCarros Disponíveis:");
        carro3.exibirCarrosDisponiveis();
        carro4.exibirCarrosDisponiveis();
    }
}
