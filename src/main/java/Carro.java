public class Carro extends Veiculo {
    
    public Carro(String marca, String modelo, String placa) {
        super(marca, modelo, placa, 0);
    }
    public Carro(String marca, String modelo, String placa, int velocidadeInicial) {
        super(marca, modelo, placa, velocidadeInicial);
    }
    @Override
    public double calcularConsumo() {
        return getVelocidade() * 0.1;
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
    public void frear(int decremento) {
        int novaVelocidade = getVelocidade() - decremento;
        setVelocidade(Math.max(novaVelocidade, 0));
    }
    @Override 
    public String toString() {
        return String.format("Carro: %s %s - Velocidade: %d km/h",
        getMarca(), getModelo(), getVelocidade());
    }
}
