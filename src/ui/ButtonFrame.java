/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class ButtonFrame extends JFrame {
    protected JButton b1;
    protected JButton b2;
    
    public ButtonFrame() {
        super ("Testando Botões"); //Chama a superclasse (titulo da janela)
        setLayout(new FlowLayout());
        
        b1 = new JButton("Botão Chapado");
        add(b1);
        
        Icon inseto1 = new ImageIcon(getClass().getResource("abelha.png"));
        Icon inseto2 = new ImageIcon(getClass().getResource("abelha2.png"));
        
        b2 = new JButton("Botão Chique",inseto1);
        b2.setRolloverIcon(inseto2);
        add(b2);
        
        ButtonHandler handler = new ButtonHandler();
        b1.addActionListener(handler);
        b2.addActionListener(handler);
        
    }

    private class ButtonHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(ButtonFrame.this, String.format("Você precionou: %s", e.getActionCommand()));
        }
    }
    
}
