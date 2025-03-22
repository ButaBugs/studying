package src.CalculadoraTarefa;

public class CalculadoraCientifica extends Calculadora {
    @Override
    public void calcular(String operador, double... operandos) {
        if (operandos.length != 1) {
            throw new IllegalArgumentException("Operação científica requer 1 operando!");
        }

        double valor = operandos[0];

        switch (operador.toLowerCase()) {
            case "seno":
                setResultado(Math.sin(valor));
                break;
            case "cosseno":
                setResultado(Math.cos(valor));
                break;
            case "tangente":
                setResultado(Math.tan(valor));
                break;
            case "logaritmo":
                if (valor <= 0) throw new ArithmeticException("Logaritmo de valor não positivo!");
                setResultado(Math.log10(valor)); // Log base 10
                break;
            default:
                throw new IllegalArgumentException("Operação científica inválida: " + operador);
        }
    }
}