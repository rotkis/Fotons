/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author unifarotkis
 */
public class SimulacaoModel implements ActionListener{
    Timer timer;
    Image ball;
    int xVelocity;
    int yVelocity = 0;
    int x = 0;
    int y = 0;

    public SimulacaoModel(int xVelocity) {
        this.xVelocity = xVelocity;
        ball = new ImageIcon("ball.png").getImage();
        timer = new Timer(10,this);
        timer.start();
    }
    public void paint(Graphics g) {
		paint(g);
		Graphics2D g2D = (Graphics2D) g;
		//g2D.drawImage(backgroundImage, 0, 0, null);
		g2D.drawImage(ball, x, y, null);
	}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(x>=807 - ball.getWidth(null) || x<0) {
		xVelocity = xVelocity * -1;
	}
	x = x + xVelocity;
	paint(null);
	}
    }
