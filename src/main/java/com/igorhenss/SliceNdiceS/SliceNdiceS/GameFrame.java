package com.igorhenss.SliceNdiceS.SliceNdiceS;

import com.igorhenss.SliceNdiceS.SliceNdiceS.entity.Enemy;
import com.igorhenss.SliceNdiceS.SliceNdiceS.entity.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class GameFrame extends JPanel implements ActionListener {

    private final static String welcomeMessage = "Welcome to SliceNdiceS: a RPG adventure.";

    private Timer mainTimer;
    private Player player;
    private static ArrayList<Enemy> enemies = new ArrayList<Enemy>();
    private Random rand = new Random();
    private Integer enemyCount = rand.nextInt(10);

    public GameFrame() {
        setFocusable(true);

        player = new Player(240, 140);

        addKeyListener(new KeyAdapt(player));

        mainTimer = new Timer(1, this);
        mainTimer.start();

        for (int i = 0; i < enemyCount; i++) {
            addEnemy(new Enemy(rand.nextInt(1200), rand.nextInt(700)));
        }
    }

    public void paint(Graphics graphics) {
        super.paint(graphics);
        Graphics2D graphics2D = (Graphics2D) graphics;

        for (int i = 0; i < enemies.size(); i++) {
            Enemy goblin = enemies.get(i);
            goblin.draw(graphics2D);
        }

        player.draw(graphics2D);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        player.update();
        repaint();
    }

    public void addEnemy(Enemy enemy) {
        enemies.add(enemy);
    }

    public static ArrayList<Enemy> getEnemyList() {
        return enemies;
    }

    public static void removeEnemy(Enemy killedEnemy) {
        enemies.remove(killedEnemy);
    }

}

// Font font = new Font("Montserrat", Font.BOLD, 12);
// Integer welcomeMessageLength = (int) graphics2D.getFontMetrics().getStringBounds(welcomeMessage, graphics2D).getWidth();
// Integer middleX = getWidth() / 2 - welcomeMessageLength / 2;
// graphics2D.setColor(Color.BLACK);
// graphics2D.setFont(font);
// graphics2D.drawString(welcomeMessage, middleX, getHeight() / 10);