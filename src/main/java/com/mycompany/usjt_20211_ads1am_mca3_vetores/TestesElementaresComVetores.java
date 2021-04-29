/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.usjt_20211_ads1am_mca3_vetores;

import javax.swing.JOptionPane;

/**
 *
 * @author rodrigo
 */
public class TestesElementaresComVetores {
    
    public static void main(String[] args) {
        int [] v1;
        int v2 [];
        int [] meuVetor = new int[4];
        meuVetor[0] = 2;
        System.out.println ("meuVetor[0]: " + meuVetor[0]);
        System.out.println("meuVetor[2]: " +  meuVetor[2]);
        //meuVetor[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite um inteiro"));
        //JOptionPane.showMessageDialog(null, meuVetor[1]);
        System.out.println ("meuVetor.length: " + meuVetor.length);
        meuVetor[0] = 5;
        meuVetor[1] = 2;
        int r = meuVetor[0] + meuVetor[1];
        System.out.println("r: " + r);
        System.out.println ("E esse?: " + meuVetor[3 - 2]);
        System.out.println ("E agora?: " + meuVetor[3 - meuVetor.length + 2]);
        //System.out.println ("E agora???: " + meuVetor[meuVetor.length]);
        System.out.println ("E com valor negativo?: " + meuVetor[-1]);
    }
    
}
