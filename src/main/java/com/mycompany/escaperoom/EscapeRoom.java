/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.escaperoom;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author paulo
 */
public class EscapeRoom {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("\n---------- JOGO DE ESCAPE ROOM ----------\n");
        System.out.println("Você está preso em um quarto escuro com o seu maior inimigo.\nPorém para sair vivo dessa jogada é necessário advinhar o numero do Guardião dos Portais Infernais para que possa passar por ele.\nEu irei desafiar-lo em 5 Tentativas.\nSerá que você é capaz de me vencer nesse jogo?\n");
        System.out.println("---------- QUE COMECEM OS JOGOS ----------");
        int tentativas = 0;
        int numero = random.nextInt((100) + 1);
        int palpite;
        do{
            System.out.print("\nQual o seu palpite?: ");
            palpite = scanner.nextInt();
            tentativas +=1;
            if(palpite < numero && tentativas < 5){
                System.out.println("\nTente um número maior...");
            }else if(palpite > numero && tentativas < 5){
                System.out.println("\nTente um número menor...");
            }else if(tentativas == 5 && numero != palpite){
                System.out.println("\nVocê está morto. O Guardião dos Portais Infernais te matou com seus poderes mágicos e as Succubus comeram sua carne vivo. GAME OVER!!! O Numero da Morte é: "+ numero);
                break;
            }else{
                System.out.println("\nVocê venceu o Guardião dos Portais Infernais e agora o seu inimigo está morto. Você concluiu sua missão com exito!!! O Numero da Vitória é: " + numero);
                break;
            }
        }while(tentativas < 5 && numero != palpite);
    }
}
