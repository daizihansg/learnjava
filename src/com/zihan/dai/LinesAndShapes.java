package com.zihan.dai;

import edu.sjcny.gpv1.DrawableAdapter;
import edu.sjcny.gpv1.GameBoard;

import java.awt.*;


public class LinesAndShapes extends DrawableAdapter {
    static LinesAndShapes ge = new LinesAndShapes();
    static GameBoard gb = new GameBoard(ge, "Lines and Shape");


    public static void main(String[] args)
    {

        showGameBoard(gb);


    }
    @Override
    public void draw(Graphics g){
        g.drawRect(100,105,100,100);
        g.drawString("嗨小LinesAndShapes 🐱!",100,75);

    }
}
