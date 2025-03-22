package src.CalculadoraTarefa;

public abstract class Calculadora {
    private double resultado;

    // Getter e Setter encapsulado
    public double getResultado() {
        return resultado;
    }
    protected void setResultado(double resultado) {
        this.resultado = resultado;
    }

    // Método abstrato para cálculo
    public abstract void calcular(String operador, double... operandos);
}