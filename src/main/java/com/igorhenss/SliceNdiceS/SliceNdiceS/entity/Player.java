//package com.igorhenss.SliceNdiceS.SliceNdiceS.entity;
//
//import com.igorhenss.SliceNdiceS.SliceNdiceS.enums.Occupation;
//import com.igorhenss.SliceNdiceS.SliceNdiceS.enums.Race;
//import com.igorhenss.SliceNdiceS.SliceNdiceS.enums.Role;
//import com.igorhenss.SliceNdiceS.SliceNdiceS.enums.Subrole;
//
//import java.awt.event.KeyEvent;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import static java.awt.event.KeyEvent.*;
//
//public class Player {
//
//    // ATTRIBUTES
//
//    private String name;
//    private Race race;
//    private Role role;
//    private Subrole subrole;
//    private Occupation occupation;
//    private Integer luck;
//
//    // STATES
//
//    private Integer velY = 0;
//    private Integer velX = 0;
//    private Boolean isRunning;
//
//    // ASSIST
//
//    private List<Integer> moveKeys = Arrays.asList(VK_W, VK_A, VK_S, VK_D);
//
////    protected Player() { }
//
//    public Player(Integer posX, Integer posY) {
//        super(posX, posY);
//    }
//
//    // METHODS
//
//    public void keyPressed(KeyEvent key) {
//        if (moveKeys.contains(key.getKeyCode())) {
//            run();
//            move(key.getKeyCode());
//        }
//    }
//
//    public void keyReleased(KeyEvent key) {
//        if (key.getKeyCode() == VK_SHIFT) {
//            stopRunning();
//        } else if (moveKeys.contains(key.getKeyCode())) {
//            stopMoving(key.getKeyCode());
//        }
//    }
//
//    // MOVEMENT METHODS
//
//    public void update() {
//        posY += velY;
//        posX += velX;
//    }
//
//    public void run() {
//        setRunning(true);
//    }
//
//    public void stopRunning() {
//        setRunning(false);
//    }
//
//    public void move(Integer pressedKey) {
//        if (pressedKey == VK_W) {
//            goUp();
//        } else if (pressedKey == VK_A) {
//            goLeft();
//        } else if (pressedKey == VK_S) {
//            goDown();
//        } else if (pressedKey == VK_D) {
//            goRight();
//        }
//    }
//
//    public void stopMoving(Integer releasedKey) {
//        if (releasedKey == VK_W) {
//            stopGoingUpOrDown();
//        } else if (releasedKey == VK_A) {
//            stopGoingLeftOrRight();
//        } else if (releasedKey == VK_S) {
//            stopGoingUpOrDown();
//        } else if (releasedKey == VK_D) {
//            stopGoingLeftOrRight();
//        }
//    }
//
//    private void goUp() {
//        if (isRunning) {
//            velY = -2;
//        } else {
//            velY = -1;
//        }
//    }
//
//    private void goLeft() {
//        if (isRunning) {
//            velX = -2;
//        } else {
//            velX = -1;
//        }
//    }
//
//    private void goDown() {
//        if (isRunning) {
//            velY = 2;
//        } else {
//            velY = 1;
//        }
//    }
//
//    private void goRight() {
//        if (isRunning) {
//            velX = 2;
//        } else {
//            velX = 1;
//        }
//    }
//
//    private void stopGoingUpOrDown() {
//        setVelY(0);
//    }
//
//    private void stopGoingLeftOrRight() {
//        setVelX(0);
//    }
//
//    // GETTERS AND SETTERS
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Race getRace() {
//        return race;
//    }
//
//    public void setRace(Race race) {
//        this.race = race;
//    }
//
//    public Role getRole() {
//        return role;
//    }
//
//    public void setRole(Role role) {
//        this.role = role;
//    }
//
//    public Subrole getSubrole() {
//        return subrole;
//    }
//
//    public void setSubrole(Subrole subrole) {
//        this.subrole = subrole;
//    }
//
//    public Occupation getOccupation() {
//        return occupation;
//    }
//
//    public void setOccupation(Occupation occupation) {
//        this.occupation = occupation;
//    }
//
//    public Integer getLuck() {
//        return luck;
//    }
//
//    public void setLuck(Integer luck) {
//        this.luck = luck;
//    }
//
//    public Integer getVelY() {
//        return velY;
//    }
//
//    public void setVelY(Integer velY) {
//        this.velY = velY;
//    }
//
//    public Integer getVelX() {
//        return velX;
//    }
//
//    public void setVelX(Integer velX) {
//        this.velX = velX;
//    }
//
//    public Boolean getRunning() {
//        return isRunning;
//    }
//
//    public void setRunning(Boolean running) {
//        isRunning = running;
//    }
//
//}