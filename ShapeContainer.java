import java.util.ArrayList;
/* Shape Container class- holds a set of shapes
 * @author: Nashiha Ahmed
 * @version 1/ 18.03.15
 */
public class ShapeContainer
{
    //properties
    ArrayList<Shape> container;
    
    //constructor
    public ShapeContainer()
    {
        container = new ArrayList<Shape>();
    }
    
    //methods
    //add method
    public void add( Shape s)
    {   
        //code
        //1. Add s to arraylist
        container.add(s);
    }
    
    //getArea method= gets the total surface area of all shapes in container
    public double getArea()
    {
        //variable 
        double area;
        int i;
        
        //code
        area = 0;
        //1. Go through entire list calling getArea method of the shape in current position and sum them all
        for( i = 0; i < container.size(); i++)
        {
            area = area + container.get(i).getArea();
        }
        //2. Return area
        return area;
    }
    
    //toString method = prints information about each shape 
    public String toString()
    {
        //variable
        String s;
        int i;
        
        //code
        s = "";
        for( i = 0; i < container.size(); i++)
        {
            if( container.get(i) instanceof Circle )
            {
                s = s + "\n| Index:" + i + "\t|  Shape: Circle " + "\t| Area: " + container.get(i).getArea();;
            }
            if( container.get(i) instanceof Rectangle)
            {
                if( container.get(i) instanceof Square)
                {
                    s = s + "\n| Index:" + i + "\t|  Shape: Square " + "\t| Area: " 
                        + container.get(i).getArea();;
                }
                else
                {
                s = s + "\n| Index:" + i + "\t|  Shape: Rectangle " + "\t| Area: " + container.get(i).getArea();;
                }
            }
        }
        return s;
    }
    
    //getSize method: returns size of container
    public int getSize()
    {
        return container.size();
    }
    
}