/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.FlowLayout;
//Podemos usar import javax.swing.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author aluno
 */
public class LabelFrame extends JFrame {
    protected JLabel label1;
    protected JLabel label2;
    protected JLabel label3;
    
    public LabelFrame() {
        super("Testando JLabel"); //Enteder os construtores de JFrame
        setLayout(new FlowLayout());
        
        label1 = new JLabel("Label com texto");
        label1.setToolTipText("Isto é o label1");
        add(label1); //indica que a Janela Frame tem um subcomponente label1.
        
        //iconfinder.com - onde baixa-se icones, o icone abelha.png foi movido para a pasta src>ui
        Icon inseto = new ImageIcon( getClass().getResource("abelha.png"));
        label2 = new JLabel("Label com texto e icone", inseto, SwingConstants.LEFT);
        label2.setToolTipText("Este é o label2.");
        add (label2);
        
        label3 = new JLabel();
        label3.setText("Label com icone e texto embaixo");
        label3.setIcon(inseto);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("Este é um label3");
        add (label3);
    } 
}
