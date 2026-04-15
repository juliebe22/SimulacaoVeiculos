public class Caminhao extends Veiculo {
    
    public Caminhao(String marca, String modelo, String placa, int velocidade) {
        super(marca, modelo, placa, velocidade);
    }
    @Override
    public double calcularConsumo() {
        return getVelocidade() * 0.3;
    }
    @Override
    public String toString() {
        return String.format("Caminhão: %s %s [Placa %s] - Valocidade: d% km/h",
                getMarca(), getModelo(), getPlaca(), getVelocidade());
    }
}
