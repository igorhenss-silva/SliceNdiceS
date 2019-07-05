package com.igorhenss.SliceNdiceS.SliceNdiceS.entity;

import com.igorhenss.SliceNdiceS.SliceNdiceS.GameFrame;
import com.igorhenss.SliceNdiceS.SliceNdiceS.enums.Occupation;
import com.igorhenss.SliceNdiceS.SliceNdiceS.enums.Race;
import com.igorhenss.SliceNdiceS.SliceNdiceS.enums.Role;
import com.igorhenss.SliceNdiceS.SliceNdiceS.enums.Subrole;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.awt.event.KeyEvent.*;

public class Player extends Entity {

    // ATTRIBUTES

    private String name;
    private Race race;
    private Role role;
    private Subrole subrole;
    private Occupation occupation;
    private Integer luck;

    // STATES

    private Integer velY = 0;
    private Integer velX = 0;
    private Boolean isRunning = false;

    // ASSIST

    private List<Integer> moveKeys = Arrays.asList(VK_W, VK_A, VK_S, VK_D);

//    protected Player() { }

    public Player(Integer posX, Integer posY) {
        super(posX, posY);
    }

    public void update() {
        posX += velX;
        posY += velY;

        collision();
    }

    public void draw(Graphics2D graphics2D) {
        graphics2D.drawImage(getPlayerImage(), posX, posY, null);
        graphics2D.draw(getBounds());
    }

    public Image getPlayerImage() {
        ImageIcon sprite = new ImageIcon("C:/personal_files/SliceNdiceS/src/main/resources/images/player.png");
        return sprite.getImage();
    }

    public Rectangle getBounds() {
        return new Rectangle(posX, posY, getWidth(), getHeight());
    }

    public void collision() {
        ArrayList<Enemy> enemies = GameFrame.getEnemyList();
        for (int i = 0; i < enemies.size(); i++) {
            Enemy killedEnemy = enemies.get(i);
            if (getBounds().intersects(killedEnemy.getBounds())) {
                GameFrame.removeEnemy(killedEnemy);
            }
        }
    }

    private Integer getWidth() {
        return getPlayerImage().getWidth(null);
    }

    private Integer getHeight() {
        return getPlayerImage().getHeight(null);
    }

    // METHODS

    public void keyPressed(KeyEvent key) {
        if (key.getKeyCode() == VK_SHIFT) {
            run();
        } else if (moveKeys.contains(key.getKeyCode())) {
            move(key.getKeyCode());
        }
    }

    public void keyReleased(KeyEvent key) {
        if (moveKeys.contains(key.getKeyCode())) {
            stopMoving(key.getKeyCode());
        }
    }

    // MOVEMENT METHODS

    public void run() {
        setRunning(!isRunning);
    }

    public void move(Integer pressedKey) {
        if (pressedKey == VK_W) {
            goUp();
        } else if (pressedKey == VK_A) {
            goLeft();
        } else if (pressedKey == VK_S) {
            goDown();
        } else if (pressedKey == VK_D) {
            goRight();
        }
    }

    public void stopMoving(Integer releasedKey) {
        if (releasedKey == VK_W) {
            stopGoingUpOrDown();
        } else if (releasedKey == VK_A) {
            stopGoingLeftOrRight();
        } else if (releasedKey == VK_S) {
            stopGoingUpOrDown();
        } else if (releasedKey == VK_D) {
            stopGoingLeftOrRight();
        }
    }

    private void goUp() {
        if (isRunning) {
            velY = -2;
        } else {
            velY = -1;
        }
    }

    private void goLeft() {
        if (isRunning) {
            velX = -2;
        } else {
            velX = -1;
        }
    }

    private void goDown() {
        if (isRunning) {
            velY = 2;
        } else {
            velY = 1;
        }
    }

    private void goRight() {
        if (isRunning) {
            velX = 2;
        } else {
            velX = 1;
        }
    }

    private void stopGoingUpOrDown() {
        setVelY(0);
    }

    private void stopGoingLeftOrRight() {
        setVelX(0);
    }

    // GETTERS AND SETTERS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Subrole getSubrole() {
        return subrole;
    }

    public void setSubrole(Subrole subrole) {
        this.subrole = subrole;
    }

    public Occupation getOccupation() {
        return occupation;
    }

    public void setOccupation(Occupation occupation) {
        this.occupation = occupation;
    }

    public Integer getLuck() {
        return luck;
    }

    public void setLuck(Integer luck) {
        this.luck = luck;
    }

    public Integer getVelY() {
        return velY;
    }

    public void setVelY(Integer velY) {
        this.velY = velY;
    }

    public Integer getVelX() {
        return velX;
    }

    public void setVelX(Integer velX) {
        this.velX = velX;
    }

    public Boolean getRunning() {
        return isRunning;
    }

    public void setRunning(Boolean running) {
        isRunning = running;
    }

}