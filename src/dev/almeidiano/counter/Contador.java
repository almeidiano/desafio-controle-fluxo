package dev.almeidiano.counter;

import java.util.InputMismatchException;
import java.util.Scanner;

import dev.almeidiano.counter.ParametrosInvalidosException;

public class Contador {

    static void print(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        print("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        print("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        }catch (InputMismatchException | ParametrosInvalidosException exception) {
            print(exception.getMessage());
        }finally {
            terminal.close();
        }
    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;

        //realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }

}