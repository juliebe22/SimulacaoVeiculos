import java.util.Objects;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    private String placa;
    private int velocidade;
    
    public Veiculo(String marca, String modelo, String placa, int velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.velocidade = velocidade;
    }
    public abstract double calcularConsumo();
    
    public void abastecer(double litros) {
        System.out.println("Abastecendo" + litros + " litros de combustível comum.");
    }
    public void abastecer(double litros, String tipoCombustivel) {
        System.out.println("Abastecendo" + litros + " litros de " + tipoCombustivel);
    }
    public void interagir(Veiculo outro){
        System.out.println(this.modelo + " está buzinando para " + outro.getModelo());
    }
    public void interagir(Caminhao c) {
        System.out.println(this.modelo + " está mantendo distância segura do caminhão " + c.getModelo());
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Veiculo veiculo = (Veiculo) o;
        return Objects.equals(placa, veiculo.placa);
    }
    @Override
    public int hashCode() {
        return Objects.hash(placa);
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public String getPlaca() {
        return placa;
    }
    public int getVelocidade() {
        return velocidade;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setVelocidade(int velocidade) {
        if (velocidade >= 0) {
        this.velocidade = velocidade;
        } else {
            System.out.println("Valor inválido. Velocidade deve ser positiva.");
        }
    }
}
