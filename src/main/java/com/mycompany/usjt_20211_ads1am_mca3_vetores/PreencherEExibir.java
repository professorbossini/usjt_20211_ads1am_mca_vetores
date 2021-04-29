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
public class PreencherEExibir {
    
    public static void main(String[] args) {
        double [] valores = new double[4];
        //isso é uma repetição manual
        /*valores[0] = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor"));
        valores[1] = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor"));
        valores[2] = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor"));*/
        
        /*for (int i = 0; i < valores.length; i++){
            valores[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor"));
        }*/
        //esse for faz exatamente a mesma coisa que o anterior
        
        for (int i = 1; i <= valores.length; i++){
            valores[i - 1] = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor"));
        }
        /*int i = 0;
        while (i < valores.length){
            JOptionPane.showMessageDialog(null, valores[i]);
            i++;
        }*/
        
        String s = "";
        for (int i = 0; i < valores.length; i++){
            s = s + valores[i] + " ";
        }
        JOptionPane.showMessageDialog(null, s);
        
        
        
        
        
    }
    
}
