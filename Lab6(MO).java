//4. Write a program to find area of geometrical figures using method overloading.

import java.util.*;
class geofig
{
    double area(double r)
    {
        return(3.14*r*r);
    }
    float area(float s)
    {
        return(s*s);
    }
    float area(float l,float b)
    {
        return(l*b);
    }
    double area(double b,double h)
    {
        return(0.5*b*h);
    }
}

class geo
{
    public static  void main(String arg[])
    {
        Scanner sc =new Scanner(System.in);
        geofig g = new geofig();
        System.out.println("enter double value for radius of circle");
        double r =sc.nextDouble();
        System.out.println("area of circle="+g.area(r));
        System.out.println("enter float value for side of a square");
        float s =sc.nextFloat();
        System.out.println("area of square="+g.area(s));
        System.out.println("enter float value for length and breadth of rectangle");
        float l =sc.nextFloat();
        float b =sc.nextFloat();
        System.out.println("area of rectangle="+g.area(l,b));
        System.out.println("enter double value for base & height of triangle");
        double b1 =sc.nextDouble();
        double h =sc.nextDouble();
        System.out.println("area of triangle="+g.area(b1,h));
    }
}