package br.edu.unifaesp;

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] aposta = new int[6];
        int[] sorteio = new int[6];
        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i <= 5; i++){
                System.out.println("Digite um número para sua aposta:");
                aposta[i] = teclado.nextInt();
            while (aposta[i] > 60){
                JOptionPane.showMessageDialog(null, "Aposta invalida");
                JOptionPane.showMessageDialog(null, "Valor Invalido, Adicione valor valido!");
                System.out.println("Digite um número para sua aposta:");
                aposta[i] = teclado.nextInt();
            }
            for(int y = 0; y < i; y++){
                while (aposta[y] == aposta[i]){
                    JOptionPane.showMessageDialog(null, "Valor invalida");
                    JOptionPane.showMessageDialog(null, "Valor repetido, Adicione valor valido!");
                    System.out.println("Digite um número para sua aposta:");
                    aposta[i] = teclado.nextInt();
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Sua aposta foi esta:\n" + Arrays.toString(aposta));
        System.out.println("Sua aposta é esta: ");
        for(int i = 0; i <= 5; i++){
            System.out.println(aposta[i]);
        }
        Random random = new Random();
        for(int i = 0; i<=5; i++){
            sorteio[i] = random.nextInt(60);
        }
        JOptionPane.showMessageDialog(null, "Os números sorteados são estes\n" + Arrays.toString(sorteio));

        if(aposta == sorteio){
            JOptionPane.showMessageDialog(null, "Parabens, Vecê foi sorteado!!!");
        }else {
            JOptionPane.showMessageDialog(null, "Infelizmente hoje não é seu dia de sorte");
        }

    }
}
