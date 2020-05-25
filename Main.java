import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;
import java.util.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class Main extends JPanel implements KeyListener{
   
   ///======variables======
    public static final int WIDTH = 1024;
    public static final int HEIGHT = 768;
    public static final int FPS = 5;
    
    ///===============
    public ArrayList<Turtle> Turtles = new ArrayList<Turtle>();
    //====

    //=============main==========================
    public Main()
    {
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        Thread mainThread = new Thread(new Runner());
        mainThread.start(); //run start
        Turtles.add(new Turtle());
        setFocusable(true);
        addKeyListener(this);

    }
    //=============================


///==========Main============================
    public static void main(String[] args){
        JFrame frame = new JFrame("Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Main mainInstance = new Main();
        frame.setContentPane(mainInstance);
        frame.pack();
        frame.setVisible(true);
    }
///===================

///============paint===================================
    public void paintComponent(Graphics g) {
        super.paintComponent(g);        
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, WIDTH, HEIGHT); //Background
        
        g.setColor(Color.GREEN);

        //Turtles
        for(Turtle t:Turtles)
        {
            g.drawImage(t.image,t.position.x,t.position.y,t.size*2,t.size,this);
        }
        //
    }
//=======================

///=================Run===================
    class Runner implements Runnable{
    public void run()
    {
        while(true){
            ///
            repaint();
            ///
        try{
            Thread.sleep(1000/FPS);
        }
        catch(InterruptedException e){}
        }
 
    }
    }
 
    ///=========Keys
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        System.out.println("something pressed: "+keyCode);
        if(keyCode==KeyEvent.VK_U)
        {
            for(Turtle t: Turtles)
            {
                t.update(new Pair(0,0), new Pair(WIDTH,HEIGHT));
            }
            System.out.println("u pressed");
        }
    }    
	public void keyReleased(KeyEvent e) {
    }
    public void keyTyped(KeyEvent e) {
    }
 
    
     
}
