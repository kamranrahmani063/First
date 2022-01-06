//4. Write a simple program that sets foreground and background colors and outputs a string.

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
 
public class SetBackColor extends Applet {
 
 public void init() 
 {
  setBackground(Color.cyan);
  setForeground(Color.red);
 }
 
 public void paint(Graphics g)
 {
  g.drawString("Hello Java",50,50);
 }
}
 
/* 
<applet code="SetBackColor.class" width=200 height=200>
</applet>
*/
