package Publisher.View;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JDialog;

public class Frame extends JFrame
{   
    private static JMenuBar nav;
   // private JMenuBar lienzo;
    private static JMenu archive;
    private static JMenu insert;
    private static JMenu option;
    private static JMenu help;
    
    private static Canvas1 canvas;
    
    private static JPanel west;
    
    public Frame()
    {
        nav = new JMenuBar();
        nav();
        setJMenuBar(nav);
        
        // west = new JPanel();
        // west.setSize(300,800);
        // west.setVisible(true);
        // setContentPane(west);
        canvas = new Canvas1(1600,800);
        add(canvas);
        
        setTitle("Publisher Graficacion Por Computadora");
        setSize(1600, 800);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void west(){        //BorderLayout west = new BorderLayout();        
    }
    public void nav(){
        archive = new JMenu("Archive");
        insert = new JMenu("Insert");
        option = new JMenu("Option");
        help = new JMenu("Help");
        this.nav.add(archive);
        this.nav.add(insert);
        this.nav.add(option);
        this.nav.add(help);
    }
}
