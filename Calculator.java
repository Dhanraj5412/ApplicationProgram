import java.awt.*;
import java.awt.event.*;




class Calculator 
{
    public static void main(String Arg[])
    {
        MarvellousCalculator mobj = new MarvellousCalculator(400,400,"Marvellous");
    }
    
}

class MarvellousCalculator extends WindowAdapter  // implements ActionListener
{
    public Frame fobj;
    public Button b1,b2,b3,b4;
    public TextField t1,t2;
    public Label lobj;

    public MarvellousCalculator(int width, int height, String title)
    {
       Frame  fobj = new Frame(String title) 
    }

}
