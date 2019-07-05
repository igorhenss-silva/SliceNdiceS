package com.igorhenss.SliceNdiceS.SliceNdiceS.entity;

import javax.swing.*;
import java.awt.*;

public class Enemy extends Entity {

    public Enemy(Integer posX, Integer posY) {
        super(posX, posY);
    }

    public void update() {

    }

    public void draw(Graphics2D graphics2D) {
        graphics2D.drawImage(getEnemyImage(), posX, posY, null);
        graphics2D.draw(getBounds());
    }

    public Image getEnemyImage() {
        ImageIcon sprite = new ImageIcon("C:/personal_files/SliceNdiceS/src/main/resources/images/archer_goblin_resized.png");
        return sprite.getImage();
    }

    public Rectangle getBounds() {
        return new Rectangle(posX, posY, getWidth(), getHeight());
    }

    private Integer getWidth() {
        return getEnemyImage().getWidth(null);
    }

    private Integer getHeight() {
        return getEnemyImage().getHeight(null);
    }

}
