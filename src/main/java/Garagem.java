public class Garagem {
    private Carro[] vagas;
    private int contador;
    
    public Garagem(int capacidade) {
       this.vagas = new Carro[capacidade];
       this.contador = 0;
    }
    public void adicionarCarro(Carro novoCarro) {
       if (contador < vagas.length) {
           vagas[contador] = novoCarro;
           contador++;
       } else {
           System.out.println("Garagem lotada!");
       }
    }
    public void exibirCarros() {
        System.out.println("--- Veículos na Garagem ---");
        for (int i = 0; i < contador; i++) {
            System.out.print(vagas[i]);
        }
    }
}
