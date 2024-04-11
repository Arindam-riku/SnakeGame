package snakegame;
/**
 *
 * @author Arindam
 */
import javax.swing.*;//extends JFrame present in this library 
public class SnakeGame extends JFrame{
    //classs ka constructor
    SnakeGame(){
        super("Snake Game");//frame heading,,it must be the first line inside a constructer 
        add(new Board());//board is changed to pannel by using add()
        pack();//for reload the frames to reflect the changes
        
        
        //setLocation(100,100);//(x,y)
        setLocationRelativeTo(null);//according to screensize it will open in center
        setResizable(false);//setSize(300,300);//(width,height)
        
        
    }

    public static void main(String[] args) {
        new SnakeGame().setVisible(true);//class ka object//setvisible:to create a frame
    }
    
    
}
