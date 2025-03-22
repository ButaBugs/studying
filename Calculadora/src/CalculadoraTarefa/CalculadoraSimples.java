package src.CalculadoraTarefa;

public class CalculadoraSimples extends Calculadora {
    @Override
    public void calcular(String operador, double... operandos) {
        if (operandos.length != 2) {
            throw new IllegalArgumentException("Operação básica requer 2 operandos!");
        }

        double a = operandos[0];
        double b = operandos[1];

        switch (operador) {
            case "+":
                setResultado(a + b);
                break;
            case "-":
                setResultado(a - b);
                break;
            case "*":
                setResultado(a * b);
                break;
            case "/":
                if (b == 0) throw new ArithmeticException("Divisão por zero!");
                setResultado(a / b);
                break;
            default:
                throw new IllegalArgumentException("Operação inválida: " + operador);
        }
    }
}