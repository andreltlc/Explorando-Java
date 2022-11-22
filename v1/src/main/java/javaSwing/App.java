package javaSwing;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
public class App 
{
    public static void main( String[] args ){
       
        JLabel label = new JLabel(" Olá Professor, esse é meu pequeno programa, para explorando a biblioteca javax.swing* ", JLabel.CENTER);
        label.setFont(new Font("Calibri", Font.BOLD,20));
        label.setForeground(Color.BLACK);

        JFrame janela = new JFrame();
        janela.setSize(700,700 );
        janela.getContentPane().setBackground(new Color(200, 200 ,200));
        janela.add(label);
        janela.setVisible(true);

    }
}
