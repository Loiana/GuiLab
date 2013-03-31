/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JFrame;

/**
 *
 * @author aluno
 */
public class TestaTextField { //Rodar, selecionar o campo e apertar Enter para vizualisar a mensagem
    public static void main(String[] args){
        TextFieldFrame frm = new TextFieldFrame();
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(350,100);
        frm.setVisible(true);
    }
}
