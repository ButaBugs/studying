package SistemaDeVeiculos;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeAtual;

    public void acelerar() {
        velocidadeAtual += 10;
    }

    public void frear() {
        velocidadeAtual = Math.max(velocidadeAtual - 10, 0);
    }

    public void exibirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h");
    }

    // Getters e Setters
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getAno() { return ano; }
    public void setAno(int ano) { this.ano = ano; }

    public double getVelocidadeAtual() { return velocidadeAtual; }
    public void setVelocidadeAtual(double velocidadeAtual) { 
        this.velocidadeAtual = velocidadeAtual;
    }

    // Métodos sobrecarregados
    public double calcularConsumo(double distancia) {
        return distancia / 15; // 15 km/l 
    }

    public double calcularConsumo(double distancia, double eficiencia) {
        return distancia / eficiencia;
    }
}