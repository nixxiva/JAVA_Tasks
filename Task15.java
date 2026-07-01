public class Task15 {

    public static void main(String[] args) {
        Circle c = new Circle("white");
        System.out.println(c.calculateArea());
    }
}

interface Shape{
    double calculateArea();
    double calculatePerimeter();
}

abstract class abstractShape implements Shape{
    String color;
    double length;
    double width;

    abstractShape(String color){
        this.color = color;
    }

    abstractShape(String color, double length, double width){
        this.color = color;
        this.length = length;
        this.width = width;
    }

    public double calculateArea(double radius){
        return (Math.PI * radius * radius);
    }    

    public double calculatePerimeter(double radius){
        return (2 * Math.PI * radius);
    }

}

class Circle extends abstractShape{
    double radius;

    Circle(String color){
        super(color);
    }

    public double calculateArea(){
        return (Math.PI * radius * radius);
    }    

    public double calculatePerimeter(){
        return (2 * Math.PI * radius);
    }
}

class Rectangle extends abstractShape{

    Rectangle(String color, double length, double width){
        super(color, length, width);
    }

    @Override
    public double calculateArea(){
        return (length * width);
    }

    public double calculatePerimeter(){
        return 2 * ( length * width);
    }
}
