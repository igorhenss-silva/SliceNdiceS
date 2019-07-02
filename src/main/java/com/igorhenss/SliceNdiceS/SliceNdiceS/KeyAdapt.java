package com.igorhenss.SliceNdiceS.SliceNdiceS;

import com.igorhenss.SliceNdiceS.SliceNdiceS.entity.Player;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyAdapt extends KeyAdapter {

    Player player;

    public KeyAdapt(Player player) {
        this.player = player;
    }

    public void keyPressed(KeyEvent keyPressed) {
        player.keyPressed(keyPressed);
    }

    public void keyReleased(KeyEvent keyReleased) {
        player.keyReleased(keyReleased);
    }

}
