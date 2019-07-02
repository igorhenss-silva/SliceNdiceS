package com.igorhenss.SliceNdiceS.SliceNdiceS;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class GameFrame extends JPanel {

    private final static String welcomeMessage = "Welcome to SliceNdiceS: a RPG adventure.";

    public GameFrame() {
        setFocusable(true);
    }

    public void paint(Graphics graphics) {
        super.paint(graphics);
        Graphics2D graphics2D = (Graphics2D) graphics;
        Font font = new Font("Montserrat", Font.BOLD, 12);
        Integer welcomeMessageLength = (int) graphics2D.getFontMetrics().getStringBounds(welcomeMessage, graphics2D).getWidth();
        Integer middleX = getWidth() / 2 - welcomeMessageLength / 2;
        graphics2D.setColor(Color.BLACK);
        graphics2D.setFont(font);
        graphics2D.drawString(welcomeMessage, middleX, getHeight() / 10);
    }

}
