import java.util.*;
/* ShapeTester class- menu driven class. Allows user to (1)create a set of shapes, (2)add shapes...
 * ...(3)compute and print out the total surface area, (4)print out information about all of the shapes, and (5) exits
 * @author: Nashiha Ahmed
 * @version 1/ 18.03.15
 */

public class ShapeTester
{
    public static void main( String[] args)
    {
        //objects
        ShapeContainer container;
        Circle circle;
        Rectangle rectangle;
        Square square;
        
        //constants
        final int EXIT = 5;
        
        //variables
        int height;
        int width;
        int radius;
        int side;
        int choice;
        String whichShape;
        String squareOption;
        
        //code
        //1.Print welcome message
        System.out.println( "Welcome to the Shapes Creator! What would you like to do?");
        System.out.println();
        
        //program code
        choice = 0;
        container = new ShapeContainer();
        
        //run menu until user enters EXIT value
        Scanner scan = new Scanner( System.in);
        do{
            //print menu
            System.out.println();
            System.out.println( "Choices:\n(1)Create a set of shapes\n(2)Add shapes\n(3)Compute" + 
                               " and Print out the total surface area\n(4)Print out information about all" +
                               " of your shapes\n(5)Quit ");
            System.out.println();
            choice = scan.nextInt();
            
            //if choice 1...
            if( choice == 1)
            {
                //1.1 Print confirmation message
                System.out.println( "Set of shapes created.");
            }
            
            //if choice 2...
            else if( choice == 2)
            {
                if( container != null)
                {
                    do{
                        //2.1 Ask user which shape they want added
                        System.out.println( "What kind of shape would you like to add? Enter QUIT to stop adding shapes");
                        System.out.println( "Circle or Rectangle?");
                        whichShape = scan.next();
                        //if the shape is a circle...
                        if( !whichShape.equalsIgnoreCase( "QUIT")) 
                        {
                            if( whichShape.equalsIgnoreCase( "Circle"))
                            {
                                //2.2 Ask for the radius
                                System.out.println( "Please enter the radius of your circle");
                                radius = scan.nextInt();
                                //2.3 Create circle
                                circle = new Circle( radius);
                                //2.4 Add circle to set of shapes
                                container.add( circle);
                            }
                            //if the shape is a rectangle...
                            else if( whichShape.equalsIgnoreCase( "Rectangle"))
                            {
                                //2.2 Ask if user wants a square
                                System.out.println( "Would you like to add a square? Squares are rectangles too? Enter"+
                                                   " \"yes\" or \"no\")");
                                squareOption = scan.next();
                                //if no...
                                if( squareOption.equalsIgnoreCase("no"))
                                {
                                    //2.3  Ask for the height and width
                                    System.out.println( "Please enter the height then width of your rectangle");
                                    height = scan.nextInt();
                                    width = scan.nextInt();
                                    //2.4 Create rectangle
                                    rectangle = new Rectangle( height, width);
                                    //2.5 Add rectangle to set of shapes
                                    container.add( rectangle);
                                }
                                //if yes...
                                else
                                {
                                    //2.3 Ask for the side
                                    System.out.println( "Please enter the length of the side of your square");
                                    side = scan.nextInt();
                                    //2.4 Create square
                                    square = new Square( side);
                                    //2.5 Add square to set of shapes
                                    container.add( square);
                                }
                            }
                            else
                                System.out.println( "Cannot create this shape!");
                        }
                    }while( !whichShape.equalsIgnoreCase( "QUIT"));
                }
                else
                    System.out.println( "Set of shapes has not been created");
            }
            //if choice 3...
            else if( choice == 3)
            {
                if( container != null)
                {
                    System.out.println( "Total Surface Area= " + container.getArea());
                }
                else
                    System.out.println( "Set of shapes has not been created");
            }
            
            //if choice 4...
            else if( choice == 4)
            {
                if( container != null)
                {
                    System.out.println( "Information about shapes in container= " + container.toString());
                }
                else
                    System.out.println( "Set of shapes has not been created");
            }
        }while( choice != 5);
            System.out.println( "Thanks for using Shape Creator!");
    }
}