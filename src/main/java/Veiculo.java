public class Veiculo {
    private String marca;
    private String modelo;
    private int velocidade;
    
    public Veiculo(String marca, String modelo, int velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public double getVelocidade() {
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
