package pl.Snake;

import pl.Board.Board;

import javax.swing.*;
import java.awt.*;

public class Snake extends JFrame {

    public Snake(){

        initUI();
    }


    public void initUI(){
        add(new Board());

        setResizable(false);
        pack();

        setTitle("SnakeGame");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(()-> {
            JFrame ex = new Snake();
            ex.setVisible(true);
        });
    }
}
