//7. Write a program to implement constructor overloading by passing different number of parameters of different types. 

import java.util.*;
class box
{
double length,breadth,height;
    box()
    {
        length=0.0;
        breadth=0.0;
        height=0.0;
    }
    box(double p)
    {
        length=p;
        breadth=p;
        height=p;
    }
    box(double l,double b,double h)
    {
        length = l;
        breadth = b;
        height = h;
    }
    void disp()
    {
    System.out.println("length=" +length+ "\t breadth=" +breadth+ "\t height=" +height);
    System.out.println("Volume of a box = " +(length*breadth*height));

    }
} 
class ConstOverload
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        box b1 = new box();
        System.out.println("default constructor is invoked ");
        b1.disp();
        System.out.println("enter a double value");
        double d = sc.nextDouble();
        box b2 = new box(d);
        System.out.println("one parameter constructor is invoked");
        b2.disp();
        System.out.println("enter length");
        double l = sc.nextDouble();
        System.out.println("enter breadth");
        double b = sc.nextDouble();
        System.out.println("enter height");
        double h = sc.nextDouble();
        box b3 = new box(l,b,h);
        System.out.println("three parameter constructor is invoked");
        b3.disp();
      }   
}