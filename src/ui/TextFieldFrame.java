/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author aluno
 */
public class TextFieldFrame extends JFrame {
    protected JTextField t1;
    protected JTextField t2;
    protected JTextField t3;
    protected JPasswordField p1;
    
    public TextFieldFrame() {
        super ("Testando JTextField e JPasswordField");
        setLayout(new FlowLayout());
        
        t1 = new JTextField(10);
        add(t1);
        
        t2 = new JTextField("Digite o texto aqui");
        add(t2);       
        
        t3 = new JTextField("Campo nao editável",21);
        t3.setEditable(false);
        add(t3);
        
        p1 = new JPasswordField("Texto oculto");
        add(p1);
        
        TextFieldHandler handler = new TextFieldHandler();
        t1.addActionListener(handler);
        t2.addActionListener(handler);
        t3.addActionListener(handler);
        p1.addActionListener(handler);
    }
    
    private class TextFieldHandler implements ActionListener { //Dentro da classe eu crio uma classe aninhada

        @Override
        public void actionPerformed(ActionEvent e) {
            String msg = "";
            if (e.getSource() == t1) { //getSource = de objt onde veio
                msg = String.format("t1: %s",e.getActionCommand());
                t3.setEditable(true);
            }
            if (e.getSource() == t2) { //getSource = de objt onde veio
                msg = String.format("t2: %s",e.getActionCommand());
            }
            if (e.getSource() == t3) { //getSource = de objt onde veio
                msg = String.format("t3: %s",e.getActionCommand());
            }
            if (e.getSource() == p1) { //getSource = de objt onde veio
                msg = String.format("p1: %s",e.getActionCommand());
            }
            JOptionPane.showMessageDialog(null, msg);
        }
    
    }
}
