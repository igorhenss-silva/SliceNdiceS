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
    }

    public Image getEnemyImage() {
        ImageIcon sprite = new ImageIcon("C:/personal_files/SliceNdiceS/src/main/resources/images/archer_goblin_resized.png");
        return sprite.getImage();
    }

}
