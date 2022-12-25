import java.awt.*;  
import java.awt.event.*;  
import java.applet.*;  
public class AppletClass extends Applet implements ActionListener  
{  
    TextField t1 = new TextField(10);  
    TextField t2 = new TextField(10);  
    Label l1 = new Label("First Number:");  
    Label l2 = new Label("Second Number:");  
    Label afterSwapping = new Label("AfterSwapping :");
    Label l3 = new Label("First Number:");  
    Label l4 = new Label("Second Number:");  
    TextField afterSwappingFirstNumber = new TextField(10);
    TextField afterSwappingSecondNumber = new TextField(10);
    Button b = new Button("Swap");  
    public void init()  
    {   
        add(l1);  
        add(t1);  
        add(l2);  
        add(t2);  
        add(b);  
        add(afterSwapping);
        add(l3); 
        add(afterSwappingFirstNumber);
        add(l4);
        add(afterSwappingSecondNumber);  
        b.addActionListener(this);  
    }  
    public void actionPerformed(ActionEvent e)  
    {  
        if (e.getSource() == b)  
        {  
            int x = Integer.parseInt(t1.getText());  
            int y = Integer.parseInt(t2.getText());  
            x = x + y;   
            y = x - y;   
            x = x - y;   
            afterSwappingFirstNumber.setText(""+x);
            afterSwappingSecondNumber.setText(""+y);
        }  
    }  
}  