package SistemaDeVeiculos;

public class Moto extends Veiculo {
    private boolean temCarenagem;

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Carenagem: " + (temCarenagem ? "Sim" : "Não"));
    }

    public boolean isTemCarenagem() { return temCarenagem; }
    public void setTemCarenagem(boolean temCarenagem) { 
        this.temCarenagem = temCarenagem;
    }
}