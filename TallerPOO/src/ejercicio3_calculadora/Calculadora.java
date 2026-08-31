package ejercicio3_calculadora;

public class Calculadora {

    public double sumar(double a, double b) { return a + b; }
    public double restar(double a, double b) { return a - b; }
    public double multiplicar(double a, double b) { return a * b; }

    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: no se puede dividir entre cero.");
            return 0;
        }
        return a / b;
    }

    public void mostrarResultado(String operacion, double resultado) {
        System.out.println("Operación: " + operacion + " -> Resultado: " + resultado);
    }
}
