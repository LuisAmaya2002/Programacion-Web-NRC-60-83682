package ejercicio3_calculadora;

public class Main {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        double a = 20;
        double b = 30;

        double resultadoSuma = calculadora.sumar(a, b);
        calculadora.mostrarResultado("Suma", resultadoSuma);

        double resultadoResta = calculadora.restar(a, b);
        calculadora.mostrarResultado("Resta", resultadoResta);

        double resultadoMultiplicacion = calculadora.multiplicar(a, b);
        calculadora.mostrarResultado("Multiplicación", resultadoMultiplicacion);

        double resultadoDivision = calculadora.dividir(a, b);
        calculadora.mostrarResultado("División", resultadoDivision);
    }
}
