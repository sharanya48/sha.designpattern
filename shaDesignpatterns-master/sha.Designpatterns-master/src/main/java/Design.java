import java.util.ArrayList;
import java.util.List;
/*MEDIATOR PATTERN*/
class A
{
    int n;
    A(int n) {
        this.n=n;
    }

    protected void print() {
        System.out.println("Hello"+ n);
    }
}
class B extends A
{
    B(int n)
    {
        super(n);
    }
}
/*ABSTRACT FACTORY METHOD*/
interface ComputerAbstractFactory
{
    Computer createComputer();
}
class ComputerFactory implements ComputerAbstractFactory
{
   String ram;
   ComputerFactory(String r)
   {
       ram=r;
   }

    public Computer createComputer() {
        return new PC(ram);
    }
}
abstract class Computer
{
    public abstract String getRam();
}
class PC extends Computer
{
    String ram;

    PC(String ram) {
        this.ram =ram;
    }
    public String getRam()
    {
        return ram;
    }
}
/*COMPOSITE*/ /*AND*/ /*TEMPLATE METHOD*/

interface Shape {
    void draw(String color);
}

class Triangle implements Shape {
    public void draw(String color) {
        System.out.println("Triangle's Color :- " + color);
    }
}

class Circle implements Shape {
    public void draw(String color) {
        System.out.println("Circle's Color :- " + color);
    }
}

class Drawing implements Shape
{
    List<Shape> shapes=new ArrayList<Shape>();

    public void draw(String color) {

        for (Shape shape: shapes) {
            shape.draw("Orange");
        }
    }
}
class Color
{
    String color()
    {
        return "orange";
    }
}
/*SINGLETON METHOD*/
public class Design
{
    public static final Design design = new Design();

    private Design() {

    }
    public static Design DesignInstance() {
        return design;
    }
    public static void main(String[] args)
    {
        Drawing drawing = new Drawing();
        Color color = new Color();
        drawing.draw(color.color());//BRIDGE METHOD
        B temp = new B(5);
        temp.print();
    }
}
