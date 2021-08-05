import java.util.Scanner;

abstract class Shape1{
    abstract public double area();
    abstract public double perimeter();
    }
class Rectangle extends Shape1{
    public double length;
    public double breadth;
    public void setLength(double length) {
        this.length = length;
    }
    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
    public Rectangle(double length,double breadth){
        setLength(length);
        setBreadth(breadth);
    }
    public double area(){
        return length * breadth;
    }
    public double perimeter() {
        return 2 * (length + breadth);
    }
}
class Circle extends Shape1{
    public double radius;
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public Circle(double radius){
        setRadius(radius);
    }
    public double area(){
        return Math.PI * radius * radius;
    }
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
public class Shape {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius = s.nextDouble();
        Shape1 c = new Circle(radius);
        System.out.println("The area of the rectangle is " + c.area());
        System.out.println("The perimeter of the rectangle is " + c.perimeter());

        System.out.println("Enter the length: ");
        double length = s.nextDouble();
        System.out.println("Enter the breadth: ");
        double breadth = s.nextDouble();
        Shape1 r = new Rectangle(length,breadth);
        System.out.println("The area of the rectangle is " + r.area());
        System.out.println("The perimeter of the rectangle is " + r.perimeter());
    }
}
