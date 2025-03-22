package SistemaDeVeiculos;

public class Concessionaria {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setMarca("Ford");
        carro.setModelo("Ka");
        carro.setAno(2023);
        carro.setNumeroPortas(4);

        Moto moto = new Moto();
        moto.setMarca("Honda");
        moto.setModelo("CG 160");
        moto.setAno(2024);
        moto.setTemCarenagem(false);

        // Testando métodos
        carro.acelerar();
        carro.acelerar();
        carro.frear();

        moto.acelerar();
        moto.acelerar();
        moto.acelerar();
        moto.frear();

        System.out.println("=== Informações do Carro ===");
        carro.exibirInfo();
        
        System.out.println("\n=== Informações da Moto ===");
        moto.exibirInfo();

        // Testando métodos sobrecarregados (opcional)
        System.out.println("\nConsumo do carro (padrão): " + 
            carro.calcularConsumo(300) + " litros");
        System.out.println("Consumo da moto (personalizado): " + 
            moto.calcularConsumo(300, 30) + " litros");
    }
}