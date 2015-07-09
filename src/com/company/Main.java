package com.company;

abstract class Figure{
    public abstract double getS();
}
class Rectangle extends Figure{
    private double height,width;

    public Rectangle(int h,int w){
        height=h;
        width=w;
    }
    public double getS(){
        return height*width;
    }
}
class Triangle extends Figure{
    private double basis,height;
    public Triangle(int n,int h){
        basis=n;
        height=h;
    }
    public double getS(){
        return (basis*height)/2;
    }
}
class Circle extends Figure{
    private double radius;
    public Circle(int r){

        radius=r;
    }
    public double getS(){
         return Math.PI*radius*radius;
    }
}
public class Main {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 4);
        System.out.println(r.getS());
        Triangle s = new Triangle(4, 5);
        System.out.println(s.getS());
        Circle c = new Circle(10);
        System.out.println(c.getS());

        Figure[] list = {
                new Rectangle(4, 3),
                new Rectangle(5, 7),
                new Triangle(4, 5),
                new Triangle(6, 8),
                new Circle(3),
                new Circle(7)
        };
        StringBuilder sb;

        for (Figure d : list) {
             if (d instanceof Rectangle)
                 System.out.println("Прямоугольник");
            else if (d instanceof Triangle)
            System.out.println("Треугольник");
            else if (d instanceof Circle)
                 System.out.println("Круг");

            sb = new StringBuilder()
                    .append(d.getS());
            System.out.println(sb.toString());

        }
    }
}
