package one.digitalinnovation.oo;

public class Calculadora implements Operacao {

    @Override
    public void somar(double operando1, double operando2) {
        System.out.println("Soma: " + (operando1 + operando2));
    }

    public void subtrair(double operando1, double operando2) {
        System.out.println("Subtração: " + (operando1 - operando2));
    }

    public void multiplicar(double operando1, double operando2) {
        System.out.println("Multiplicação: " + (operando1 * operando2));
    }

    public void dividir(double operando1, double operando2) {
        if (operando2 != 0) {
            System.out.println("Multiplicação: " + (operando1 / operando2));
        } else
            System.out.println("Impossível efetuar divisão por zero.");
    }
}
