/**
 * Projeto: Calculadora
 * Autor: Marcos Gabriel De Oliveira Favaretto.
 * Data: 01 de Agosto de 2019.
 */
package calculadora;

public class Calculadora {

    static int num1 = 10, num2 = 5;

    public static void main(String[] args) {
        somar();
        subtrair();
        multiplicar();
        dividir();
    }

    public static void somar() {
        System.out.println(num1 + "+" + num2 + " = " + (num1 + num2));
    }

    public static void subtrair() {
        System.out.println(num1 + "-" + num2 + " = " + (num1 - num2));
    }

    public static void multiplicar() {
        System.out.println(num1 + "*" + num2 + " = " + (num1 * num2));
    }

    public static void dividir() {
        System.out.println(num1 + "/" + num2 + " = " + (num1 / num2));
    }

}
