public class SimulacaoVeiculos {

    public static void main(String[] args) {
        Garagem minhaGaragem = new Garagem(3);

        Carro carro1 = new Carro("Toyota", "Corolla");

        Carro carro2 = new Carro("Honda", "Civic", 50);

        System.out.println("--- Testando Carro 1 ---");
        carro1.acelerar();     
        carro1.acelerar(25);    
        carro1.frear();        
        System.out.println(carro1);

        System.out.println("\n--- Testando Carro 2 ---");
        carro2.acelerar(30);    
        carro2.frear(100);      
        System.out.println(carro2);

        System.out.println("\n--- Estacionando ---");
        minhaGaragem.adicionarCarro(carro1);
        minhaGaragem.adicionarCarro(carro2);

        minhaGaragem.exibirCarros();
    }
}