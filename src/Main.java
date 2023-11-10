// Project: IMC Calculator
// Author: Eduardo Nascimento
// Date: 11/10/2023
import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double altura = 1.83, peso = 140, imc;
        System.out.println("------------------------------");
        System.out.println("***** Calculadore de IMC *****");
        System.out.println("------------------------------");
        /*
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o sua altura (m): ");
        altura = teclado.nextDouble();
        System.out.print("Digite o seu peso atual (Kg): ");
        peso = teclado.nextDouble();
        */
        imc = peso/Math.pow(altura,2);
        System.out.printf("Seu IMC é: %.2f\n", +imc);
        System.out.println("Seu IMC é: " +new DecimalFormat(".##").format(imc));
        System.out.println("*Classificação para adultos acima de 20 anos");
        if (imc < 18.5) {
            System.out.println("Abaixo do peso!");
            }else if (imc > 18.5 && imc <= 24.9){
                System.out.println("Peso normal!");
                } else if (imc > 24.9 && imc <= 29.9) {
                    System.out.println("Pré-obesidade");
                    } else if (imc > 29.9 && imc <= 34.9) {
                        System.out.println("Obesidade Grau 1");
                        } else if (imc > 34.9 && imc <= 39.9) {
                            System.out.println("Obesidade grau 2");
                            } else if (imc > 39.9) {
                                System.out.println("Obesidade Grau 3");
                            }
    }
}

