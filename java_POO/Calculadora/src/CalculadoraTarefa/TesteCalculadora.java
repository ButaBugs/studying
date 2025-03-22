package src.CalculadoraTarefa;

public class TesteCalculadora {
    public static void main(String[] args) {
        // Teste Calculadora Simples
        CalculadoraSimples simples = new CalculadoraSimples();
        simples.calcular("+", 5, 3);
        System.out.println("5 + 3 = " + simples.getResultado());

        simples.calcular("/", 10, 2);
        System.out.println("10 / 2 = " + simples.getResultado());

        // Teste Calculadora Científica
        CalculadoraCientifica cientifica = new CalculadoraCientifica();
        cientifica.calcular("seno", Math.PI / 2);
        System.out.println("Seno(pi/2) = " + cientifica.getResultado());

        cientifica.calcular("logaritmo", 100);
        System.out.println("Log10(100) = " + cientifica.getResultado());
    }
}