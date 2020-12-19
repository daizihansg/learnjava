package edu.sjcny.gpv1;

import javax.swing.*;
import java.awt.*;

public class GameBoard  extends JFrame{
    private DrawableAdapter app;
    String windowTitle;
    public  LinePaintDemo main_panel;
    public  JPanel button;
    public GameBoard(DrawableAdapter app,String windowTitle){
        super(windowTitle);
        this.app=app;


        final FlowLayout card=new FlowLayout();
        setLayout(card);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main_panel = new LinePaintDemo();
        main_panel.setPreferredSize(new Dimension(400, 400));
        button= new JPanel();
        // setting some properties
        main_panel.setBackground(Color.magenta);
        add(main_panel,"one");
        button.setLayout(new GridLayout(6, 1, 20, 20));

        // create some components, say 6
        Button b1 = new Button("start");
        Button b2 = new Button("pause");
        Button b3 = new Button("up");
        Button b4 = new Button("down");
        Button b5 = new Button("left");
        Button b6 = new Button("right");
        // add 3 buttons to Panel p1
        button.add(b1);
        button.add(b2);
        button.add(b3);
        // add 3 buttons to Panel p2
        button.add(b4);
        button.add(b5);
        button.add(b6);
        // add panels to frame

        add(button,"two");

    }
    public void setTimerInterval(int timerNumber,int interval){

    }
    public void startTimer(int timerNumber){

    }
    public void stopTimer(int timerNumber){

    }
    public class LinePaintDemo extends JPanel {

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            app.draw(g);
        }
    }
}
