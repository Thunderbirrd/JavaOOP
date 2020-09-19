package com.company.four;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Football extends JFrame
{
    JLabel res = new JLabel("Result: 0 X 0");
    JLabel last = new JLabel("Last Scorer: N/A");
    JLabel winner = new JLabel("Winner: DRAW");
    JButton milan = new JButton("AC Milan");
    JButton madrid = new JButton("Real Madrid");
    Font fnt = new Font("Times new roman", Font.BOLD,20);
    Football() {
        super("Game");
        setLayout(null);
        getContentPane().setBackground(new Color(0x10C4AF));
        res.setBounds(380, 300, 400, 40);
        winner.setBounds(380, 0, 200, 40);
        last.setBounds(365, 100, 200, 40);
        milan.setBounds(250, 450, 150, 30); madrid.setBounds(450, 450, 150, 30);
        milan.setBackground(new Color(0x065252)); madrid.setBackground(new Color(0x065252));
        setSize(700,600);
        add(last);
        add(res);
        add(winner);
        add(milan);
        add(madrid);
        milan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {
                last.setText("Last Scorer: AC Milan");
                String r = res.getText(); String r1 = r.substring(8, r.indexOf("X") - 1);
                String r2 = r.substring(r.indexOf("X") + 2); int goalsR = Integer.parseInt(r2);
                int goalsM = Integer.parseInt(r1); goalsM++;
                r = "Result: " + goalsM + " X " + goalsR;
                res.setText(r);
                if(goalsM > goalsR) {
                    winner.setText("Winner: AC Milan");
                }else if(goalsM == goalsR){
                    winner.setText("Winner: DRAW");
                }
            }
        });
        madrid.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae)
            {
                last.setText("Last Scorer: Real Madrid");
                String r = res.getText(); String r1 = r.substring(8, r.indexOf("X") - 1);
                String r2 = r.substring(r.indexOf("X") + 2); int goalsR = Integer.parseInt(r2);
                int goalsM = Integer.parseInt(r1); goalsR++;
                r = "Result: " + goalsM + " X " + goalsR;
                res.setText(r);
                if(goalsR > goalsM) {
                    winner.setText("Winner: Real Madrid");
                }else if(goalsM == goalsR){
                    winner.setText("Winner: DRAW");
                }
            }
        });
        setVisible(true);
    }
    public static void main(String[]args)
    {
        new Football().setVisible(true);
    }
}
