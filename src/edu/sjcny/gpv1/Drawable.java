package edu.sjcny.gpv1;

import java.awt.*;

public interface Drawable {
    void draw(Graphics graphics);
    void timer1();
    void timer2();
    void timer3();
    void leftButton();
    void rightButton();
    void upButton();
    void downButton();
    void keyStruc(char key);
    void mouseClicked(int x, int y, int buttonPressed);
    void mouseDragged(int x, int y);

}
