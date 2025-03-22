package SistemaDeVeiculos;

public class Carro extends Veiculo {
    private int numeroPortas;

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Número de Portas: " + numeroPortas);
    }

    public int getNumeroPortas() { return numeroPortas; }
    public void setNumeroPortas(int numeroPortas) { 
        this.numeroPortas = numeroPortas;
    }
}