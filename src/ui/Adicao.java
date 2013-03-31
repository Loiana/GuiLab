/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Adicao {
    public static void main(String[] args){
        String num1 = JOptionPane.showInputDialog("Digite o primeiro inteiro:");
        String num2 = JOptionPane.showInputDialog("Digite o segundo inteiro:");
        
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int soma = n1 + n2;
       
        JOptionPane.showMessageDialog(null, "A soma é: "+soma, "Soma de Dois Inteiros", JOptionPane.INFORMATION_MESSAGE);//JOptionPane.PLAIN_MESSAGE
        //O primeiro paramentro é uma "janela pai", ou seja, para onde ele vai depois de executar esta janela.
        System.out.println(soma); //sout tab
    }
    
}
