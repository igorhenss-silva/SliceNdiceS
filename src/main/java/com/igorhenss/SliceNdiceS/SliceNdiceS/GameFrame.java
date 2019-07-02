package com.igorhenss.SliceNdiceS.SliceNdiceS;

import com.igorhenss.SliceNdiceS.SliceNdiceS.entity.Enemy;
import com.igorhenss.SliceNdiceS.SliceNdiceS.entity.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameFrame extends JPanel implements ActionListener {

    private final static String welcomeMessage = "Welcome to SliceNdiceS: a RPG adventure.";

    Timer mainTimer;
    Player player;
    Enemy goblin;

    public GameFrame() {
        setFocusable(true);

        player = new Player(240, 140);

        addKeyListener(new KeyAdapt(player));

        mainTimer = new Timer(1, this);
        mainTimer.start();
    }

    public void paint(Graphics graphics) {
        super.paint(graphics);
        Graphics2D graphics2D = (Graphics2D) graphics;

        player.draw(graphics2D);

        Enemy++
        goblin.draw(graphics2D);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        player.update();
        repaint();
    }

}

// Font font = new Font("Montserrat", Font.BOLD, 12);
// Integer welcomeMessageLength = (int) graphics2D.getFontMetrics().getStringBounds(welcomeMessage, graphics2D).getWidth();
// Integer middleX = getWidth() / 2 - welcomeMessageLength / 2;
// graphics2D.setColor(Color.BLACK);
// graphics2D.setFont(font);
// graphics2D.drawString(welcomeMessage, middleX, getHeight() / 10);