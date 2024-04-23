package CWH;

import java.awt.*;

import static java.lang.Math.PI;

//P1: create a class circle and use inheritance to create another class cylinder
class Circle{
    public int radius;
    public Circle(int radius){
        this.radius = radius;
    }

public double area(){
    return PI*this.radius*this.radius;
}
}
class Cylinder extends Circle{
    public int height;
    public Cylinder(int height , int radius) {
        super(radius);
        this.height = height;
    }


public double Volume(){
    return PI*this.radius*this.radius*height;
}
}

//P1 : create a class Rectange and use inheritance to create another class Cuboid ,try to keep as close to real world scenario as possible
class Rectangle{

}
class Cuboid extends Rectangle{

}

public class CWH_52_Chapter10_PracticeSet {
    public static void main(String[] args) {
        Cylinder a = new Cylinder(33,22);
        System.out.println("the area of circle is : "+ a.area());
        System.out.println("the volume of cylynder is : "+   a.Volume());
//        Circle b = new Circle();
    }
}
