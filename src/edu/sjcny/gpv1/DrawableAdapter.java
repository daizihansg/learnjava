package edu.sjcny.gpv1;

import javax.swing.*;
import java.awt.*;

public abstract class DrawableAdapter  implements Drawable {
    public  static void showGameBoard(GameBoard gb){
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {

                gb.pack();
                gb.setVisible(true);
            }
        });
    }
    @Override
    public  void draw(Graphics graphics) {

    }

    @Override
    public void timer1() {

    }

    @Override
    public void timer2() {

    }

    @Override
    public void timer3() {

    }

    @Override
    public void leftButton() {

    }

    @Override
    public void rightButton() {

    }

    @Override
    public void upButton() {

    }

    @Override
    public void downButton() {

    }

    @Override
    public void keyStruc(char key) {

    }

    @Override
    public void mouseClicked(int x, int y, int buttonPressed) {

    }

    @Override
    public void mouseDragged(int x, int y) {

    }
}
