// importing awt libraries  
import java.awt.*;    
import java.awt.event.*;    
// class which inherits Frame class and implements KeyListener interface  
public class KLE extends Frame implements KeyListener {    
// creating object of TextArea class  
  
    TextArea area;    
// class constructor  
    KLE() {    
         
   
// creating the text area  
        area = new TextArea();    
// setting the location of text area   
        area.setBounds (20, 80, 300, 300);//top left corner+width and height of the component   
// adding the KeyListener to the text area  
        area.addKeyListener(this);  
 
add(area);    
// setting the size, layout and visibility of frame  
        setSize (400, 400);    
        setLayout (null);    
        setVisible (true);    
    }    
// overriding the keyPressed() method of KeyListener interface where we set the text of the label when key is pressed  
    public void keyPressed (KeyEvent e) {    
        area.setText ("Key Pressed");    
    }    
// overriding the keyReleased() method of KeyListener interface where we set the text of the label when key is released  
    public void keyReleased (KeyEvent e) {    
        area.setText ("Key Released");    
    }    
// overriding the keyTyped() method of KeyListener interface where we set the text of the label when a key is typed  
    public void keyTyped (KeyEvent e) {    
        area.setText ("Key Typed");    
    }    
  // main method  
    public static void main(String[] args) {    
        new KLE();    
    }    
}   