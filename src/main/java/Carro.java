public class Carro extends Veiculo {
    public Carro(String marca, String modelo) {
        super (marca, modelo, 0);
    }
    public Carro(String marca, String modelo, double valocidadeInicial) {
        super(marca, modelo, velocidadeInicial);
    }
    public void acelerar(){
        setVelocidade(getVelocidade()+10);
    }
    public void acelerar(int incremento) {
        setVelocidade(getVelocidade()+incremento);
    }
    public void frear(){
        int novaVelocidade = getVelocidade() - 10;
        setVelocidade(Math.max(novaVelocidade, 0));
    }
    public void frear() {
        int novaVelocidade = getVelocidade() - decremento;
        setVelocidade(Math.max(novaVelocidade, 0));
    }
    @Override 
    public String toString() {
        return String.format("Carro: %s %s - Velocidade: %d km/h",
        getMarca(), getModelo(), getVelocidade());
    }
}
