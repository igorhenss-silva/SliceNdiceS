package com.igorhenss.SliceNdiceS.SliceNdiceS;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("SliceNdiceS");
        frame.setSize(1200, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(new GameFrame());
        frame.setVisible(true);
    }

}
