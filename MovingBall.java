/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package ja01;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class MovingBall {
    public static void main(String[] args) throws InterruptedException {
        JFrame myframe=new JFrame("Simulate Ball");
        Game mygame=new Game();
        myframe.setSize(300,400);
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.add(mygame);
        myframe.setVisible(true);
        while (true){
            mygame.repaint();
            mygame.moveBall();
            Thread.sleep(10);
        }
    }
}
class Game extends JPanel{
    static int x,y=0;
    static void moveBall(){x++;y++;}
    public void paint(Graphics g){
        super.paint(g);
        g.fillOval(x, y, 30, 30);
    }
}