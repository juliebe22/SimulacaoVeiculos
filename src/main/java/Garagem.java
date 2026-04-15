public class Garagem {
    private Carro[] vagas;
    private int totalCarros;
    
    public Garagem(int capacidade) {
       this.vagas = new Carro [capacidade];
       this.totalCarros = 0;
    }
    public void adicionarCarro(Carro carro) {
       if (totalCarros < vagas.length) {
           vagas[totalCarros] = carro;
           totalCarros++;
       } else {
           System.out.print("Garagem lotada!");
       }
    }
    public void exibirCarros() {
        System.out.print("--- Vaículos na Garagem ---");
        for (int i = 0; i < totalCarros; i++) {
            System.out.print(vagas[i].toString());
        }
    }
}
