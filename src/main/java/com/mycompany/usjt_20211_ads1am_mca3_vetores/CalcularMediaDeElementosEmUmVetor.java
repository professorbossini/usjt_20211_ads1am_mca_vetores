/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.usjt_20211_ads1am_mca3_vetores;

import java.util.Random;

/**
 *
 * @author rodrigo
 */
public class CalcularMediaDeElementosEmUmVetor {
    public static void main(String[] args) {
        Random gerador = new Random();
        //de 0 a 10
        //double numero = gerador.nextDouble() * 10;
        //double numero = 2 + gerador.nextDouble () * 5;
        //de 15 a 21
        //double numero = 15 + gerador.nextDouble() * 6;
        //System.out.println(numero);
        
        
        double [] v = new double[10];
        for (int i = 0; i < v.length; i++){
            v[i] = Math.min(9.5 + gerador.nextDouble() * 0.6, 10);//[0, 1]
        }
        //exibindo
        for (int i = 0; i < v.length; i++){
            System.out.printf("%.2f\n", v[i]);
        }
        //primeiro fazer a soma
        double soma = 0;
        for (int i = 0; i < v.length; i = i + 1){
            soma += v[i];
        }
        double media = soma / v.length;
        System.out.printf ("Média: %.2f\n", media);
    }
}
