/* Tester class
 * @author: Nashiha Ahmed
 * @version 1/ 18.03.15
 */
public class Tester
{
    public static void main( String[] args)
    {
        //objects
        Circle circle;
        Rectangle rectangle;
        Square square;
        ShapeContainer container;
        
        //constants
        //variables
        int height;
        int width;
        int radius;
        int side;
        
        //program code
        //Tester print statements
//        System.out.println( "Start...");
//        System.out.println();
//        System.out.println( "...End");
        
        //initialize and give all variables a number
        height = 10;
        width = 5;
        radius = 2;
        side = 6;
        
        //create objects
        circle = new Circle( radius);
        rectangle = new Rectangle( height, width);
        square = new Square( side);
        
        //Test getArea methods by printing area of each shape
        System.out.println( "Circle's area: " + circle.getArea());
        System.out.println( "Rectangle's area: " + rectangle.getArea());
        System.out.println( "Square's area: " + square.getArea());
        
        //Make a new container
        container = new ShapeContainer();
        container.add( circle);
        container.add( rectangle);
        container.add( square);
        System.out.println( "\nTotal surface area: " + container.getArea());
        System.out.println( "Info about all shapes in container: " + container.toString());
    }
}