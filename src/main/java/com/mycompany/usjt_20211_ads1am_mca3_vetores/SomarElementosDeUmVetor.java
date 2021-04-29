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
public class SomarElementosDeUmVetor {
    
    public static void main(String[] args) {
        /*somaTotal = somaTotal + v[0];
        somaTotal = somaTotal + v[1];
        somaTotal = somaTotal + v[2];*/
                
        //syntax sugar
        float [] v = {2.5f, 6.4f, 7.5f, 1f};
        float somaTotal = 0;
        int contador = 0;
        /*while (contador < v.length){
            somaTotal += v[contador];
            ++contador; // contador = contador + 1;
        }*/
        
        
        while (contador < v.length){
            somaTotal = somaTotal + v[contador++];
        }
        JOptionPane.showMessageDialog(null, somaTotal);
        
        
    }
    
}
