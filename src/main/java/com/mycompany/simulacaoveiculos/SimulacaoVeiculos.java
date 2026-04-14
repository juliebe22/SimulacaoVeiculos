public class Main {
    public static void main(String[] args) {
        Garagem minhaGaragem = new Garagem(5);

        // Testando Sobrecarga de Construtores
        Carro c1 = new Carro("Toyota", "Corolla");
        Carro c2 = new Carro("Honda", "Civic", 50);

        // Testando Sobrecarga de Métodos
        c1.acelerar();      // +10
        c2.acelerar(30);    // +30
        c2.frear();         // -10

        minhaGaragem.adicionarCarro(c1);
        minhaGaragem.adicionarCarro(c2);

        // Testando Sobrescrita (toString)
        minhaGaragem.exibirCarros();
    }
}