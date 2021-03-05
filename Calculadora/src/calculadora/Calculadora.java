/*
 * Programa Calculadora
 * Autor: Marcos Gabriel De Oliveira Favaretto
 * Aula de D.S. 01/08/2019
 */
package calculadora;

/**
 *
 * @author ETEC ALUNO
 */
public class Calculadora {
    static int num1 = 10, num2 = 5;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Exercício 1 - mostrar na tela a soma de dois números:
        somar();
        
        //Exercício 2 - mostrarr na tela a subtração de dois números:
        subtrair();
        
        //Exercício 3 - mostrarr na tela a multiplicação e a divisão de dois números:
        multiplicar();
        dividir();
    }
    
    //Exercício 4 - Criar um método para cada operação:
    public static void somar(){
        System.out.println(num1 + "+" + num2 + " = " + (num1 + num2));
    }
    public static void subtrair(){
        System.out.println(num1 + "-" + num2 + " = " + (num1 - num2));
    }
    public static void multiplicar(){
        System.out.println(num1 + "*" + num2 + " = " + (num1 * num2));
    }
    public static void dividir(){
        System.out.println(num1 + "/" + num2 + " = " + (num1 / num2));
    }
    
}
